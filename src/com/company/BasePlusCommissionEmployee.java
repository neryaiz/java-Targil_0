package com.company;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    float baseSalary;

    public BasePlusCommissionEmployee (String firstName, String lastName, int id, float grossSales, float commision, float baseSalary){
        super(firstName, lastName, id, grossSales, commision);
        try {
            if (baseSalary >= 0)
                this.baseSalary = baseSalary;
            else throw new IllegalArgumentException("baseSalary wrong.\n");
        }
        catch (IllegalArgumentException ex){
            this.baseSalary = 0;
            System.out.print(this.firstName + " " +ex.getMessage());
        }
    }

    public BasePlusCommissionEmployee(){
        super();
        baseSalary = 0;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase Salary: " + baseSalary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return  true;
        if (obj == null)
            return false;
        if (this.getClass()!=obj.getClass())
            return  false;

        BasePlusCommissionEmployee basePlusCommissionEmployee = (BasePlusCommissionEmployee) obj;
        return basePlusCommissionEmployee.firstName == this.firstName &&
                basePlusCommissionEmployee.lastName == this.lastName &&
                basePlusCommissionEmployee.id == this.id &&
                basePlusCommissionEmployee.grossSales == this.grossSales &&
                basePlusCommissionEmployee.commision == this.commision &&
                basePlusCommissionEmployee.baseSalary == this.baseSalary;
    }

    @Override
    public float earnings() {
        return super.earnings() + baseSalary;
    }
}