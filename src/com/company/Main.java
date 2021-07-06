package com.company;

public class Main {

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 17, -18);
        quadraticEquation.findRoots();
        System.out.println(quadraticEquation);
    }
}
