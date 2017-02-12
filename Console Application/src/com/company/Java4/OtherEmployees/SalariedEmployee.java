package com.company.Java4.OtherEmployees;

/**
 * Created by Документи on 12.02.2017.
 */
public class SalariedEmployee extends Employee implements Calculate {

    private int rateHour;
    private int hours;
    private String socialSecurityNumber;

    public SalariedEmployee(String name, String employeeId, int rateHour, int hours, String socialSecurityNumber) {
        super(name, employeeId);
        this.rateHour = rateHour;
        this.hours = hours;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return rateHour * hours;
    }
}
