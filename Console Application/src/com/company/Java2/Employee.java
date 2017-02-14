package com.company.Java2;

/**
 * Created by Документи on 06.02.2017.
 */
public class Employee {
    private String name;
    private int rate, hours;
    private static int totalHours = 0;

//constructors

    public Employee() {
        setName("");
        setRate(0);
        setHours(0);
    }
    public Employee(String name, int rate) throws ArithmeticException {
        setName(name);
        setRate(rate);
        setHours(0);
    }
    public Employee(String name, int rate, int hours) throws ArithmeticException {
        setName(name);
        setRate(rate);
        setHours(hours);
    }

//getters and setters

    public String getName(){
        return name;
    }
    public int getRate(){
        return rate;
    }
    public int getHours(){
        return hours;
    }
    public int getTotalHours(){
        return totalHours;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRate(int rate) throws ArithmeticException {
        if (rate <= 0) throw new ArithmeticException("Rate has to be more than zero!");
        this.rate = rate;
    }
    public void setHours(int hours) throws ArithmeticException {
        if (hours < 0) throw new ArithmeticException("Hours can not be less than zero!");
        if (this.hours != 0) Employee.totalHours -= this.hours;
        this.hours = hours;
        Employee.totalHours += hours;
    }

//other methods

    public int salary(){
        return rate * hours;
    }
    public void changeRate(int rate) throws ArithmeticException{
        this.setRate(rate);
    }
    public double bonuses(int salary) throws ArithmeticException {
        if (salary < 0) throw new ArithmeticException("Salary can not be less than zero!");
        return salary * 0.2;
    }
    @Override
    public String toString() throws ArithmeticException {
        return "Employee's name is: " + name + ". Rate is: " + rate + ". Hours are: " +
                hours + ". Salary is: " + salary() + ". Bonuses are: " + bonuses(salary());
    }

    public static void main(String[] args) {
        try {
            Employee employee1 = new Employee("Oleg", 10, 160);
            Employee employee2 = new Employee("Pavlo", 12, 155);
            Employee employee3 = new Employee("Danylo", 14, 170);
            System.out.println(employee1);
            System.out.println(employee2);
            System.out.println(employee3);
            System.out.println("Total hours of all workers are: " + employee1.getTotalHours());
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.println(e.getMessage() + "\n");
        }
    }
}
