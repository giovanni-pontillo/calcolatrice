package com.finconsgroup.accademy.runner;

import com.finconsgroup.accademy.domain.Operation;
import com.finconsgroup.accademy.facade.OperationHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component("commandLiner")
public class CommandLiner implements CommandLineRunner {

    private final OperationHandler operationHandler;
    private final Scanner scanner;

    @Autowired
    public CommandLiner(OperationHandler operationHandler) {
        this.operationHandler = operationHandler;
        scanner = new Scanner(System.in);
    }

    @Override
    public void run(String... args) throws Exception {
        Logger logger = LoggerFactory.getLogger(CommandLiner.class);
        System.out.print("Inserisci il primo numero: ");
        double a = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero: ");
        double b = scanner.nextDouble();

        boolean valid = false;
        Operation.OperationType operation = Operation.OperationType.ADD;
        System.out.println("""
                    Quale operazione vuoi eseguire?
                    (1) SOMMA
                    (2) SOTTRAZIONE
                    (3) DIVISIONE
                    (4) MOLTIPLICAZIONE""");
        while(!valid) {
            try {
                operation = Operation.OperationType.findEnum(scanner.nextInt());
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println("Operazione non valida, riprovare");
            }
        }

        System.out.println(
                "Il risultato di " + a + " " + operation.getSymbol() + " " + b + " è " +
                operationHandler.handleOperation(
                        operation,
                        a,
                        b
                )
        );
    }
}
