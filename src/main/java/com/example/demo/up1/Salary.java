package com.example.demo.up1;

public class Salary {
    private int id;
    private double payment;

    public Salary(int id, double payment) {
        this.id = id;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", payment=" + payment +
                '}';
    }
}
