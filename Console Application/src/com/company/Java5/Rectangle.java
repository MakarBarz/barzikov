package com.company.Java5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Документи on 14.02.2017.
 */
public class Rectangle {

    public static void main(String[] args) throws ArithmeticException{
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("You input no correct type. It have be a number.");
        }
        System.out.println(Rectangle.squareRectangle(a, b));
    }
    public static int squareRectangle(int a, int b){
        if (a < 0 || b < 0) throw new ArithmeticException("Argument has negative value");
        return a * b;
    }
}
