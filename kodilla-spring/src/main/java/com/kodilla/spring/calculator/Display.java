package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Display {

    public void displayValue(double val) {
        System.out.println("Result: " + val);
    }
}
