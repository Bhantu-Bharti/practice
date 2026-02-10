package com.example.demo.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareApp {
    public static void main(String[] args) {
        getCustomers().stream()
                .sorted(Comparator.comparing(Customer::getName,Comparator.nullsFirst(Comparator.naturalOrder())))
                .toList()
                .forEach(System.out::println);
    }

    public static List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(14, null, 90, 3400.70),
                new Customer(14, null, 90, 3400.60),
                new Customer(12, "Zon", 32, 3400.50),
                new Customer(10, "Anil", 55, 3400.50),
                new Customer(13, "Rohan", 97, 3400.50),
                new Customer(11, "Mohan", 21, 3400.50),
                new Customer(15, "Sohan", 92, 3400.50)
        );
    }
}
