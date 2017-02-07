package com.company.Java2;

/**
 * Created by Документи on 06.02.2017.
 */
public class Employee {
    private String name;
    private int rate, hours;
    private static int totalHours = 0;
//constructors
    public Employee(){
        this.setName("");
        this.setRate(0);
        this.setHours(0);
    }
    public Employee(String name, int rate){
        this.setName(name);
        this.setRate(rate);
        this.setHours(0);
    }
    public Employee(String name, int rate, int hours){
        this.setName(name);
        this.setRate(rate);
        this.setHours(hours);
    }
//getters and setters
    public String getName(){
        return this.name;
    }
    public int getRate(){
        return this.rate;
    }
    public int getHours(){
        return this.hours;
    }
    public int getTotalHours(){
        return Employee.totalHours;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRate(int rate){
        this.rate = rate;
    }
    public void setHours(int hours){
        if (this.hours != 0) Employee.totalHours -= this.hours;
        this.hours = hours;
        Employee.totalHours += hours;
    }
//other methods
    public int salary(){
        return this.rate * this.hours;
    }
    public void changeRate(int rate){
        this.rate = rate;
    }
    public double bonuses(int salary){
        return salary*0.2;
    }
    @Override
    public String toString(){
        return "Employee's name is: " + this.name + ". Rate is: " + this.rate + ". Hours are: " +
                this.hours + ". Salary is: " + this.salary() + ". Bonuses are: " + this.bonuses(this.salary());
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Oleg", 10, 160);
        Employee employee2 = new Employee("Pavlo", 12, 155);
        Employee employee3 = new Employee("Danylo", 14, 170);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Total hours of all workers are: " + Employee.totalHours);
    }
}
