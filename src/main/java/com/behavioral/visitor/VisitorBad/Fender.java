package com.behavioral.visitor.VisitorBad;

public class Fender implements AtvPart {
    @Override
    public double calculateShipping() {
        return 3;
    }
}
