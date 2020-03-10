package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("First test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator = new Calculator();

        int addResult = calculator.add(3, 4);

        if(addResult == 7) {
            System.out.println("Second test OK");
        } else {
            System.out.println("Error!");
        }
        int subtractResult = calculator.subtract(4, 3);

        if(subtractResult == 1) {
            System.out.println("Third test ok");
        } else {
            System.out.println("Error!");
        }
    }
}
