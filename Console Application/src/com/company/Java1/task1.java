package com.company.Java1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Документи on 02.02.2017.
 */
public class task1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Input two numbers \"a\" and \"b\" to define results of the next operations " +
                    "(use Enter between numbers): ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            arythm(a, b);

            System.out.println("Give answer on the question:");
            question(sc);

            System.out.println("Input number \"m\":");
            int m = sc.nextInt();
            int n = nSet(m);
            System.out.println("We defined the value \"n\": " + n);

            System.out.println("Input the number to calculate sum");
            int k = sc.nextInt();
            int suma = sum(k);
            System.out.println("We calculated the sum: " + suma);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.println(e.getMessage() + "\n");
        }
        catch (InputMismatchException e) {
            e.printStackTrace();
            System.err.println(e.getMessage() + "\n");
        }
    }
    public static void arythm(int a, int b) throws ArithmeticException{
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + a * b);
        if (b ==0) throw new ArithmeticException("Dividing on zero!");
        System.out.println("a / b = " + a / b);
    }

    public static void question(Scanner sc) throws InputMismatchException{
        System.out.println("How are you?");
        String answer = sc.next();
        if (answer.toLowerCase().equals("fine") || answer.toLowerCase().equals("not fine"))
            System.out.println("You are " + answer);
        else throw new InputMismatchException("Inputed nothing! Input \"fine\" or \"not fine\".");

    }

    public static int nSet(int m){
        int n;
        if (m == 0) n = 0;
        else n = m / Math.abs(m);
        return n;
    }

    public static int sum(int n) throws ArithmeticException {
        if (n <= 0) throw new ArithmeticException("That is not correct number to define sum! That has to be more than zero.");
        int suma = 0;
        for (int i = 1; i < n + 1; i++) suma += i;
        return suma;
    }

}
