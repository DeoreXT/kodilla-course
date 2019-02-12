package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int a = 5, b = 2;

        if (calculator.add(a, b) == a + b) {
            System.out.println("test OK");
        }
        else {
            System.out.println("Error method add()!");
        }

        if (calculator.subtract(a, b) == a - b) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Error method subtract()gitt!");
        }
    }
}
