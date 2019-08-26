package com.example.functionalExample;

public class Test {
    public Test() {
    }

    public int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
