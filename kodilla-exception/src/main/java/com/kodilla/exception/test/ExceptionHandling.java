package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){
        SecondChellenge secondChellenge = new SecondChellenge();

        try{
            secondChellenge.probablyIWillThrowException(1.1, 1.5);

        } catch (Exception e){
            System.out.println("Error: " + e);

        } finally {
            System.out.println("Not working.");
        }
    }
}
