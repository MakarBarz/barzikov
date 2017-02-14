package com.company.Java4.OtherEmployees;

/**
 * Created by Документи on 12.02.2017.
 */
public class SalariedEmployee extends Employee implements Calculate {

    private int rateHour;
    private int hours;
    private String socialSecurityNumber;

    public SalariedEmployee(String name, String employeeId, int rateHour, int hours, String socialSecurityNumber)
            throws ArithmeticException {
        super(name, employeeId);
        if (rateHour <= 0 || hours < 0) throw new ArithmeticException("Rate for an hour has to have positive value and " +
                "hours of work has to be more than zero!");
        this.rateHour = rateHour;
        this.hours = hours;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return rateHour * hours;
    }
}
