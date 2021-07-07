package com.company;

public class Calculator{
    double sum(double a, double b) {
        return a + b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    double mul(double a, double b) {
        return a * b;
    }

    double div(double a, double b){
        if (b==0)
            throw new ArithmeticException("Аргумент делителя не может быть равен нулю");
        else
            return a/b;
    }
}
