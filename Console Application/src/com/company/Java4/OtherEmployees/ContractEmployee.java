package com.company.Java4.OtherEmployees;

/**
 * Created by Документи on 12.02.2017.
 */
public class ContractEmployee extends Employee implements Calculate {

    private int monthlyPayment;
    private String federalTaxIdmember;

    public ContractEmployee(String name, String employeeId, int monthlyPayment, String federalTaxIdmember)
            throws ArithmeticException {
        super(name, employeeId);
        if (monthlyPayment <= 0) throw new ArithmeticException("Salary has to be more than zero!");
        this.monthlyPayment = monthlyPayment;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public int calculatePay() {
        return monthlyPayment;
    }
}
