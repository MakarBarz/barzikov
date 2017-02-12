package com.company.Java4.Animals;

/**
 * Created by Документи on 12.02.2017.
 */
public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("My dog say \"Gaff\"");
    }

    @Override
    public void feed() {
        System.out.println("I feed my dog");
    }

}
