package com.company.Java4.Employees;

/**
 * Created by Документи on 12.02.2017.
 */
public class Cleaner extends Staff{
    final public String TYPE_PERSON = "cleaner";

    public Cleaner(String name, String department) {
        super(name, department);
        print();
    }

    @Override
    protected void salary() {
        System.out.println("My salary is - 200$");
    }

    @Override
    protected void print() {
        System.out.println("I am a " + TYPE_PERSON + ". My name is " + name);
    }
}
