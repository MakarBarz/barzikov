package com.company.Java6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Документи on 17.02.2017.
 */
public class StringsHome {
    public static void task1(String[] strings){
        String max = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > max.length()) max = strings[i];
        }
        char[] chars = strings[1].toCharArray();
        char[] charsRevers = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charsRevers[i] = chars[chars.length - 1 - i];
        }
        String revers = new String(charsRevers);
        System.out.println("The first longest string is: " + max);
        System.out.println("It has " + max.length() + " letters.");
        System.out.println("The second word in reverse order is: " + revers);
    }
    public static void killerExcessiveSpace(String s) {
        char[] chars = s.toCharArray();
        int ind = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') continue;
            else {
                ind = i;
                break;
            }
        }
        String s1 = "";
        for (int i = ind; i < chars.length; i++) {
            if (chars[i] == ' ') {
                if (i == chars.length - 1) break;
                if (chars[i + 1] == ' ') continue;
            }
            s1 += chars[i];
        }
        System.out.println(s1);
    }

    public static boolean checkCurrencyUS(String userName) {
        Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
        Matcher m = p.matcher(userName);
        return m.matches();
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input five words to carry operations on their: ");
        String[] strings = new String[5];
        for (int i = 0; i < 5; i++) {
            strings[i] = scanner.nextLine();
        }

        StringsHome.task1(strings);

        System.out.println("Enter a sentence that contains the words between more than one space: ");
        String s = scanner.nextLine();
        StringsHome.killerExcessiveSpace(s);

        System.out.println("Enter five occurrences for US currency: ");
        for (int i = 0; i < 5; i++) {
            strings[i] = scanner.nextLine();
            System.out.println("Result of check: " + StringsHome.checkCurrencyUS(strings[i]));
        }

    }
}
