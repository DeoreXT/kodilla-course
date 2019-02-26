package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(3 ,3));
        } catch (Exception e) {
            System.out.println("General exception\n");
        }
    }
}
