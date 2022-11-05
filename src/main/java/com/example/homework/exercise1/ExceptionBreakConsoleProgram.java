package com.example.homework.exercise1;

public class ExceptionBreakConsoleProgram {

    public static void main(String[] args) {

        System.out.println("I'm Maniek");
        if (true) {
            throw new NullPointerException();
        }
        System.out.println("what now??");
    }
}
