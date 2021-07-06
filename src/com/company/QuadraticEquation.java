package com.company;

public class QuadraticEquation {

    private double a,b,c;
    private double d;
    double[] roots = new double[2];


    public QuadraticEquation(int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;

        d = b * b - (4 * a * c);

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public int numberOfRoots () {
        return (d > 0) ? 2 : (d == 0) ? 1 : 0;
    }


    public double [] findRoots () {

        int r = numberOfRoots();

        if (r == 2) {

            roots = new double[2];

            roots[0] = (-b + Math.sqrt(d)) / (2 * a);
            roots[1] = (-b - Math.sqrt(d)) / (2 * a);

            return roots;
        } else if (r == 1) {

            roots = new double[1];

            roots[0] = (int) (-b) / (2 * a);

            return roots;
        }

        return null;
    }

    public String toString(){
        String str = "";
        str += Double.toString(roots[0])+" "+Double.toString(roots[1]);
        return str;
    }
}
