package com.finconsgroup.accademy.domain;

import org.springframework.stereotype.Component;

@Component("add")
public class Add implements Operation{

    public Add() {}

    @Override
    public double executeOperation(double a, double b) {
        return a + b;
    }
}
