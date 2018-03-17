package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import static javax.print.attribute.standard.MediaSizeName.A;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "realname");

        String result = simpleUser.getUsername();
    }

}
