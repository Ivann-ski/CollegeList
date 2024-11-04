/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhnnn
 */
class Faculty extends Person {
    private double salary;
    private String department;
    private boolean isRegular;

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isRegular() {
        return isRegular;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setRegular(boolean isRegular) {
        this.isRegular = isRegular;
    }
}

