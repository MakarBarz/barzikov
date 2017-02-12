package com.company.Java4.Employees;

/**
 * Created by Документи on 12.02.2017.
 */
public class Teacher extends Staff{
    final public String TYPE_PERSON = "teacher";

    public Teacher(String name, String department) {
        super(name, department);
        print();
    }

    @Override
    protected void salary() {
        System.out.println("My salary is - 300$");
    }

    @Override
    protected void print() {
        System.out.println("I am a " + TYPE_PERSON + ". My name is " + name);
    }
}
