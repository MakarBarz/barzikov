package com.company.Java6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Документи on 17.02.2017.
 */
public class Strings {
    public static boolean containString(String s1, String s2) {
        return s2.contains(s1);
    }
    public static void personalData(String name, String surname, String patronymic) {
        name = name.replaceFirst(name.substring(0, 1), name.substring(0, 1).toUpperCase());
        surname = surname.replaceFirst(surname.substring(0, 1), surname.substring(0, 1).toUpperCase());
        patronymic = patronymic.replaceFirst(patronymic.substring(0, 1), patronymic.substring(0, 1).toUpperCase());
        System.out.println("Surname and initials: " + surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ".");
        System.out.println("Name: " + name);
        System.out.println("Name, middle name and last name: " + name + " " + patronymic + " " + surname);
    }

    public static boolean checkWithRegExp(String userName) {
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userName);
        return m.matches();
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input two strings to contain: ");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("Second string contains first string: " + Strings.containString(s1, s2));

        System.out.println("Input name: ");
        String s3 = scanner.nextLine();
        System.out.println("Input patronymic: ");
        String s4 = scanner.nextLine();
        System.out.println("Input surname: ");
        String s5 = scanner.nextLine();
        Strings.personalData(s3, s5, s4);

        System.out.println("Input five names for checking the username for valadity:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Strings.checkWithRegExp(scanner.nextLine()));
        }
    }
}
