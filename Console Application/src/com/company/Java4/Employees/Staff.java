package com.company.Java4.Employees;

/**
 * Created by Документи on 12.02.2017.
 */
abstract public class Staff extends Person{
    private String department;

    public Staff(String name, String department) {
        super(name);
        this.department = department;
    }

    abstract protected void salary();
}
