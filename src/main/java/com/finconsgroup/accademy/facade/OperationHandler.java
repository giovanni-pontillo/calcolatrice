package com.finconsgroup.accademy.facade;

import com.finconsgroup.accademy.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("operationHandler")
public class OperationHandler {
    private final Add add;
    private final Subtract subtract;
    private final Divide divide;
    private final Multiply multiply;

    @Autowired
    public OperationHandler(Add add, Subtract subtract, Divide divide, Multiply multiply) {
        this.add = add;
        this.subtract = subtract;
        this.divide = divide;
        this.multiply = multiply;
    }

    public double handleOperation(Operation.OperationType type, double a, double b) {
        return switch (type) {
            case ADD -> add.executeOperation(a, b);
            case SUBTRACT -> subtract.executeOperation(a, b);
            case DIVIDE -> divide.executeOperation(a, b);
            case MULTIPLY -> multiply.executeOperation(a, b);
        };
    }
}
