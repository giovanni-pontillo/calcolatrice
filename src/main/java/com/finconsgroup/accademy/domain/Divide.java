package com.finconsgroup.accademy.domain;

import org.springframework.stereotype.Component;

@Component("divide")
public class Divide implements Operation{

    public Divide() {
    }

    @Override
    public double executeOperation(double a, double b) {
        return a / b;
    }
}
