package com.company.Java1;

import java.util.Scanner;

/**
 * Created by Документи on 02.02.2017.
 */
public class task2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input radius of flowers bed: ");
        float radius = sc.nextFloat();
        flowersBed(radius);

        System.out.println("Give an answer on the questions: ");
        nameAge(sc);

        System.out.print("Input number a year to define if this year is a leap year: ");
        int year = sc.nextInt();
        leapYear(year);

        System.out.print("Input number of rows of the piramid: ");
        int n = sc.nextInt();
        pattern(n);
    }
    public static void flowersBed(float radius){
        System.out.println("Perymeter = " + radius * 2 * Math.PI);
        System.out.println("Area = " + radius * radius * Math.PI);
    }

    public static void nameAge(Scanner sc){
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("Name: " + name + "     Age: " + age);
    }

    public static void leapYear(int year){
        String s;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) s = "a leap";
        else s = "not a leap";
        System.out.println("This is " + s + " year.");
    }

    public static void pattern(int n){
        for (int i = 0; i < n; i++){
            int persha = (n - i - 1) * 2;
            for (int j = 0; j < persha; j++) System.out.print(" ");
            for (int j = 0; j < i * 2; j++) System.out.print("* ");
            System.out.println("*");
        }
    }


}