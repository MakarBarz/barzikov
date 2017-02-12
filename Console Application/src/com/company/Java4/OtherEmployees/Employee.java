package com.company.Java4.OtherEmployees;

/**
 * Created by Документи on 12.02.2017.
 */
abstract public class Employee {

    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
