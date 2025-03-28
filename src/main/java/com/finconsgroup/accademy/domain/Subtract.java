package com.finconsgroup.accademy.domain;

import org.springframework.stereotype.Component;

@Component("subtract")
public class Subtract implements Operation{

    public Subtract() {
    }

    @Override
    public double executeOperation(double a, double b) {
        return a - b;
    }
}
