package com.finconsgroup.accademy.domain;

import org.springframework.stereotype.Component;

@Component("multiply")
public class Multiply implements Operation{

    public Multiply() {
    }

    @Override
    public double executeOperation(double a, double b) {
        return a * b;
    }
}
