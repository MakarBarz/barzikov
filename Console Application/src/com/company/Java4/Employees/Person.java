package com.company.Java4.Employees;

/**
 * Created by Документи on 12.02.2017.
 */
abstract public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    protected abstract void print();
}
