package com.company;

public class HourlyEmployee extends Employee {
    private  float hours;
    private  float wage;

    public HourlyEmployee(String firsName, String lastName, int id, float hours, float wage){
        super(firsName, lastName, id);
        try {
            if (hours >=0)
                this.hours = hours;
            else throw new IllegalArgumentException("hours not valid under Zero. \n");
            if (wage >=0)
                this.wage = wage;
            else throw new IllegalArgumentException("wage not valid under Zero. \n");
        }
        catch (IllegalArgumentException ex){
            if (hours < 0)
                this.hours = 0;
            if (wage < 0)
                this.wage = 0;
            System.out.print(this.firstName + " " +ex.getMessage());
        }
    }

    public HourlyEmployee(){
        super();
        hours = 0;
        wage = 0;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public float getHours() {
        return hours;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public float getWage() {
        return wage;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "\nHours: " + hours + "\nWage: " + wage + "\nearning: " + this.earnings());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return  true;
        if (obj == null)
            return false;
        if (this.getClass()!=obj.getClass())
            return  false;

        HourlyEmployee hourlyEmployee = (HourlyEmployee) obj;
        return hourlyEmployee.firstName == this.firstName &&
                hourlyEmployee.lastName == this.lastName &&
                hourlyEmployee.id == this.id &&
                hourlyEmployee.hours == this.hours &&
                hourlyEmployee.wage == this.wage;
    }

    @Override
    public float earnings() {
        return hours*wage;
    }
}
