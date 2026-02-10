package com.example.demo.generics;

import com.example.demo.comparator.Customer;

public class CommonUse<T> {
    T obj;

    public CommonUse(T obj1) {
        this.obj = obj1;
    }

    public T getObject() {
        return this.obj;
    }

    public static void main(String[] args) {
        CommonUse<Integer> num = new CommonUse<>(13);
        System.out.println(num.getObject());

        CommonUse<Customer> customerCommonUse = new CommonUse<>(new Customer(33,"bhantu",34,5600.90));
        System.out.println(customerCommonUse.getObject());

    }
}
