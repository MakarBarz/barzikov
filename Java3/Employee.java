package com.company.Java3;

import java.util.Scanner;

/**
 * Created by Документи on 10.02.2017.
 */

public class Employee {
    private String name;
    private int salary;
    private DepartmentName departmentName;
    public enum DepartmentName {IT, MARKETING, FINANCIAL, SALES};
    public enum Continent {EUROPE, ASIA, NORTH_AMERICA, SOUTH_AMERICA, AFRICA, AUSTRALIA, ANTARCTICA};

    //constructors

    public Employee() {
    }

    public Employee(String name, int salary, DepartmentName departmentName) {
        this.name = name;
        this.salary = salary;
        this.departmentName = departmentName;
    }

    //getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public DepartmentName getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(DepartmentName departmentName) {
        this.departmentName = departmentName;
    }

    //other methods

    public static String cont(String country){
        Continent continent;
        switch (country){
            case "Ukraine":case "Poland":case "England":case "France":
                continent = Continent.EUROPE; break;
            case "China":case "Japane":case "Korea":case "India":
                continent = Continent.ASIA; break;
            case "Canada":case "USA":case "Mexico":case "Nikaragua":
                continent = Continent.NORTH_AMERICA; break;
            case "Brazilia":case "Argentina":case "Bolivia":case "Venezuela":
                continent = Continent.SOUTH_AMERICA; break;
            case "Egypt":case "Tunisia":case "Algeria":case "Nigeria":
                continent = Continent.AFRICA; break;
            case "Australia":case "New Zealand":case "Fijian":case "Samoa":
                continent = Continent.AUSTRALIA; break;
            case "Antarctica":
                continent = Continent.ANTARCTICA;
            default:
                continent = null;
                return "Nothing found";
        }
        return continent.name();
    }
    public static int biggest(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
    public static int sumPoz(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) sum += array[i];
        }
        return sum;
    }
    public static void amountPozNeg(int[] array){
        int amountPoz = 0;
        int amountNeg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) amountPoz++;
            if (array[i] < 0) amountNeg++;
        }
        String compare;
        if (amountNeg > amountPoz) compare = " less ";
        else if (amountNeg == amountPoz) compare = "egual";
        else compare = "more";
        System.out.println("The amount of positive values is " + amountPoz);
        System.out.println("The amount of negative values is " + amountNeg);
        System.out.println("The amount of positive values is " + compare + " than negative.");
    }
    public static void employeesOfDepartment(Employee[] array, String departmentName){
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (departmentName.equals(array[i].departmentName.toString())){
                System.out.println(array[i]);
                j++;
            }
        }
        if (j == 0) System.out.println("Nothing found");
    }

    public static Employee[] arrangeAscending(Employee[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j].salary < array[j - 1].salary){
                    Employee min = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = min;
                }
            }
        }
        return array;
    }
    public static Employee[] arrangeDescending(Employee[] array){
        array = arrangeAscending(array);
        Employee[] array1 = new Employee[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[array.length - 1 - i] = array[i];
        }
        return array1;
    }
    public static void toString(Employee[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    @Override
    public String toString(){
        return "Name: " + name + ". Salary: " + salary + ". Department: " + departmentName;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = result * prime + salary;
        result = prime * result + ((name == null) ? 0 : name.hashCode())
                + ((departmentName == null) ? 0 : departmentName.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null) return false;
        if (getClass() != object.getClass()) return false;

        Employee employee = (Employee) object;
        if (salary != employee.salary) return false;
        if (name == null){
            if (employee.name != null) return false;
        }
        else if (!name.equals(employee.name)) return false;
        return true;
    }
//main

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan", 700, DepartmentName.IT);
        employees[1] = new Employee("Petro", 400, DepartmentName.FINANCIAL);
        employees[2] = new Employee("Pavlo", 500, DepartmentName.MARKETING);
        employees[3] = new Employee("Dmytro", 300, DepartmentName.SALES);
        employees[4] = new Employee("Mykola", 600, DepartmentName.IT);

        System.out.println("Input the name of the country: ");
        System.out.println(Employee.cont(scanner.next()));

        System.out.println("Input ten numbers for array: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The biggest number is: " + Employee.biggest(numbers));

        System.out.println("The sum of positive values is: " + Employee.sumPoz(numbers));

        Employee.amountPozNeg(numbers);

        System.out.println("Input the department to sort of employees: ");
        Employee.employeesOfDepartment(employees, scanner.next());

        System.out.println("Arranged workers by the field \"salary\" in the ascending order:");
        Employee.toString(arrangeAscending(employees));
        System.out.println("Arranged workers by the field \"salary\" in the descending order:");
        Employee.toString(arrangeDescending(employees));
}
}
