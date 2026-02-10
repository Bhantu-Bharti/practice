package com.example.demo.up1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
       Map<Employee, Double> map =  getEmployees().stream()
                .collect(Collectors.toMap(Function.identity(),e->e.getSalaries()
                        .stream().mapToDouble(Salary::getPayment).average().orElse(0.0)));
       for (Map.Entry<Employee,Double> emp:map.entrySet()){
           System.out.println("Employee : "+emp.getKey()+" Avg salary: "+ emp.getValue());
       }

    }

    private static List<Employee> getEmployees(){
        Salary s1 = new Salary(1,10);
        Salary s11 = new Salary(11,110);
        Salary s111 = new Salary(111,111);
        Employee e1 = new Employee(100,"kamal",List.of(s1,s11,s111));

        Salary s2 = new Salary(2,20);
        Salary s22 = new Salary(22,220);
        Salary s222 = new Salary(222,210);
        Employee e2 = new Employee(102,"kamal",List.of(s2,s22,s222));

        Salary s3 = new Salary(3,30);
        Salary s33 = new Salary(33,310);
        Salary s333 = new Salary(333,130);
        Employee e3 = new Employee(103,"kamal",List.of(s3,s33,s333));

        return List.of(e1,e2,e3);
    }
}
