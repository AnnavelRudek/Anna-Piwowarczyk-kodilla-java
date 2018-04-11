package com.kodilla.exception.test;

import java.util.stream.Stream;

public class FirstChellenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }
    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */

    public static void main(String[] args) {
        FirstChellenge firstChellenge = new FirstChellenge();

        try {
            double result = firstChellenge.divide(3, 0);
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("It is impossible to divide by zero!" + e);

        } finally {
            System.out.println("Forget to divide by zero!");
        }
    }
}



