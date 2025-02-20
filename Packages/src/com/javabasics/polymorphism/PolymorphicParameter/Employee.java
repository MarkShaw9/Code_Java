package com.javabasics.polymorphism.PolymorphicParameter;

public class Employee {
    private String name;
    private double salary;

    public Employee() {

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //返回年工资方法
    public double getAnnual() {
        return salary * 12;
    }
}
