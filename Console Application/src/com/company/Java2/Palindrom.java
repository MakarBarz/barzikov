package com.company.Java2;

/**
 * Created by Документи on 07.02.2017.
 */
public class Palindrom {
    public static boolean check(int n){
        String s = Integer.toString(n);
        char[] chars = s.toCharArray();
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < s.length(); i++){
            chars1[chars1.length - 1 - i] = chars[i];
        }
        return s.equals(new String(chars1));
    }

    public static void main(String[] args) {
        int i = 0,j = 0, d = 0;
        l:for (i = 999; i > 100; i--) {
            for (j = i; j > 100; j--) {
                d = i * j;
                if (check(d)) break l;
            }
        }
        System.out.println(d + " =");
        System.out.println(i + " * " + j);
    }
}
