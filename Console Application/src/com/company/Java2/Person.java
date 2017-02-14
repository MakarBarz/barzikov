package com.company.Java2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Документи on 06.02.2017.
 */
public class Person {
    private String name;
    private int birthYear;
    private Calendar calendar;
//constructors
public Person() {
    setName("");
    setBirthYear(0);
    calendar = null;
}
    public Person(String name, int birthYear) throws ArithmeticException {
        setName(name);
        setBirthYear(birthYear);
        calendar = new GregorianCalendar();
    }
//getters and setters

    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthYear(int birthYear) throws ArithmeticException {
        if (birthYear < 0) throw new ArithmeticException("Year of birth has to be more than zero!");
        this.birthYear = birthYear;
    }
//other methods

    public int age() {
        return calendar.get(Calendar.YEAR) - birthYear;
    }
    public void input(String name, int birthYear) throws ArithmeticException {
        this.setName(name);
        this.setBirthYear(birthYear);
        this.calendar = new GregorianCalendar();
    }
    public void output() {
        System.out.println("Person's name: " + name + ". Year of birthday: " + birthYear +
                ". Age: " + age());
    }
    public void changeName(String name) {
        this.setName(name);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        try {
            person1.input("Ivan", 1950);
            person2.input("Petro", 1960);
            person3.input("Danylo", 1970);
            person4.input("Stepan", 1980);
            person5.input("Mykola", 1990);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.println(e.getMessage() + "\n");
        }
        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}
