package com.company.Java4.Employees;

/**
 * Created by Документи on 12.02.2017.
 */
public class Personnel {
    public static void main(String[] args) {
        Person[] array = new Person[6];
        array[0] = new Teacher("One", "education");
        array[1] = new Teacher("Two", "training");
        array[2] = new Cleaner("Three", "classrooms");
        array[3] = new Cleaner("Four", "territory");
        array[4] = new Student("Five");
        array[5] = new Student("Six");

        for (int i = 0; i < array.length; i++) {
            array[i].print();
            if (array[i] instanceof Staff) ((Staff) array[i]).salary();
        }
    }
}
