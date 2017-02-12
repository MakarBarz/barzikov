package com.company.Java4.Animals;

/**
 * Created by Документи on 12.02.2017.
 */
public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("My cat say \"Miau\"");
    }

    @Override
    public void feed() {
        System.out.println("I feed my cat");
    }

}
