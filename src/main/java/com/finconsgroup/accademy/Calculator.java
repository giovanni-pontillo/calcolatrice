package com.finconsgroup.accademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class Calculator {
    public static void main(String... args) {
        SpringApplication.run(Calculator.class, args);
    }
}
