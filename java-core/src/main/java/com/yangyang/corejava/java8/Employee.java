package com.yangyang.corejava.java8;

/**
 * Created by chenshunyang on 2017/1/11.
 */
public class Employee {
    private String name;
    private int salary;
    private String office;

    public Employee(String name, int salary, String office) {
        this.name = name;
        this.salary = salary;
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", office='" + office + '\'' +
                '}';
    }
}
