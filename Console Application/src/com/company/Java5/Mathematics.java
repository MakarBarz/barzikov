package com.company.Java5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Документи on 14.02.2017.
 */
public class Mathematics {

    public static double div(double a, double b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("That is dividing on zero!");
        }
        else return a / b;
    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            throw new InputMismatchException("Inputed value is not number type.");
        }
        if (number <= start || number >= end) {
            throw new ArithmeticException("Inputed value is not correct. It has be between " + start + " and " + end);
        }
        else return number;
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        double c = 0;
        try {
            c = Mathematics.div(a, b);
            System.out.println("Result of deviding is: " + c);
            for (int i = 0; i < 10; i++) {
                System.out.println("Input number from 1 to 100: ");
                c = Mathematics.readNumber(1, 100);
            }
            System.out.println("Ok!");
        }
        catch (ArithmeticException e) {
            System.err.println(e.getMessage() + "\n");
        }
        catch (InputMismatchException e) {
            System.err.println(e.getMessage() + "\n");
        }
    }
}
