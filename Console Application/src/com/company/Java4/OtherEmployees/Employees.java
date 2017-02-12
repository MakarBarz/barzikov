package com.company.Java4.OtherEmployees;

/**
 * Created by Документи on 12.02.2017.
 */
public class Employees {
    public static void main(String[] args) {
        Employee[] array = new Employee[5];
        array[0] = new SalariedEmployee("One", "ID000001",10, 160, "ID001");
        array[1] = new SalariedEmployee("Two", "ID000002",12, 165, "ID002");
        array[2] = new SalariedEmployee("Three", "ID000003",14, 155, "ID003");
        array[3] = new ContractEmployee("Four", "ID000004", 2000, "ID004");
        array[4] = new ContractEmployee("Five", "ID000005", 2500, "ID005");

        Employees.sortOfDescending(array);
    }
    public static void sortOfDescending(Employee[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                int salary1 = ((Calculate) array[j]).calculatePay();
                int salary2 = ((Calculate) array[j + 1]).calculatePay();
                if (salary1 < salary2){
                    Employee min = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = min;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            String s;
            s = "Employee ID: " + array[i].getEmployeeId() + ". Name is: " + array[i].getName() +
                    ". Salary is: " + ((Calculate) array[i]).calculatePay();
            System.out.println(s);
        }
    }
}
