package com.company.Java4.Employees;

/**
 * Created by Документи on 12.02.2017.
 */
public class Student extends Person {

    final public String TYPE_PERSON = "student";

    public Student(String name){
        super(name);
        print();
    }

    @Override
    public void print(){
        System.out.println("I am a " + TYPE_PERSON + ". My name is " + name);
    }
}
