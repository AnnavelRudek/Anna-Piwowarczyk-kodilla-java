package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import static javax.print.attribute.standard.MediaSizeName.A;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result   = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("error!");
        }

        System.out.println("\n Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        int addAtoB;
        int substractAFromB;

        System.out.println("Add = " + calculator.addAtoB(9, 9));
        System.out.println("Substract = " + calculator.substractAfromB(156, 3));
    }
}
