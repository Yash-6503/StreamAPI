// Stream API Operations
// package com.classes;

import java.util.*;

public class StreamOperations{
    public static void main(String... args){

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Virat Kohli", 60000.23));

        System.out.println(empList);

    }
}

record Employee(Integer empId, String name, Double salary){}