package com.company;

public class CommissionEmployee extends Employee {
    protected float grossSales;
    protected float commision;

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, float commision){
        super(firstName, lastName, id);
        try {
            if (grossSales >=0)
                this.grossSales = grossSales;
            else throw new IllegalArgumentException("grossSales wrong.\n");
            if (commision >=0)
                this.commision = commision;
            else throw new IllegalArgumentException("commision wrong.\n");
        }
        catch (IllegalArgumentException ex){
            if (grossSales <0)
                this.grossSales = 0;
            if (commision <0)
                this.commision = 0;
            System.out.print(this.firstName + " " +ex.getMessage());
        }
    }

    public CommissionEmployee(){
        super();
        grossSales = 0;
        commision = 0;
    }

    public void setGrossSales(float grossSales) {
        this.grossSales = grossSales;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setCommision(float commision) {
        this.commision = commision;
    }

    public float getCommision() {
        return commision;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGross sales: " + grossSales + "\nCommission: " + commision + "\n earning: " + earnings();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return  true;
        if (obj == null)
            return false;
        if (this.getClass()!=obj.getClass())
            return  false;

        CommissionEmployee commissionEmployee = (CommissionEmployee) obj;
        return commissionEmployee.firstName == this.firstName &&
                commissionEmployee.lastName == this.lastName &&
                commissionEmployee.id == this.id &&
                commissionEmployee.grossSales == this.grossSales &&
                commissionEmployee.commision == this.commision;
    }

    @Override
    public float earnings() {
        return (commision/100)*grossSales;
    }
}
