package com.company;


public class Payroll {

    public static void main(String[] args) {
        try {
            Employee[] employees = new Employee[3];
            employees[0] = new HourlyEmployee("yacov", "cohen", 200117999, 100, 60);
            employees[1] = new CommissionEmployee("baruj", "cohen", 200227999, 1000, 50);
            employees[2] = new BasePlusCommissionEmployee("tsofia", "cohen", 123456789, 1000, 10, 300);
            for (int i = 0; i < 3; i++) {
                System.out.print(employees[i].toString() + "\n\n");
            }
        }
        catch (Exception ex){ //if any problem with the program
            System.out.print(ex.getMessage());
        }
    }
}