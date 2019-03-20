package com.company;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected int id;

    public Employee(String firstName, String lastName, int id){
        try {
            if (id > 100000000 && id < 999999999){
                this.firstName = firstName;
                this.lastName = lastName;
                this.id = id;
            }
            else {
                throw new IllegalArgumentException("id not correct.\n");
            }
        }
        catch (IllegalArgumentException ex){
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = 0;
            System.out.print(this.firstName + " " +ex.getMessage());
        }

    }

    public Employee(){
        firstName = "plony";
        lastName = "almony";
        id = 0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "First Name: " + getFirstName() + "\n Last Name: " + getLastName() + "\n Id: " + getId();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return  true;
        if (obj == null)
            return false;
        if (this.getClass()!=obj.getClass())
            return  false;

        Employee employee = (Employee) obj;
        return employee.firstName == this.firstName &&
                employee.lastName == this.lastName &&
                employee.id == this.id;
    }

    public abstract float earnings();
}
