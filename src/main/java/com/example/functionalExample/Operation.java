package com.example.functionalExample;

public class Operation {
    public Operation() {
    }

    public int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
