package com.example.demo.up1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private List<Salary> salaries = new ArrayList<>();

    public Employee(int id, String name, List<Salary> salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salaries=" + salaries +
                '}';
    }
}
