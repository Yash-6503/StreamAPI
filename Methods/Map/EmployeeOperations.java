package com.classes;


import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeOperations {
    public static void main(String[] args) {

        List<Employee> empList = List.of(
            new Employee(105, "Virat Kohli", "Sales", 25000.32),
            new Employee(101, "Rohit Sharma", "HR", 85000.32),
            new Employee(103, "MS Dhoni", "Development", 95000.32),
            new Employee(102, "Sachin Tendulkar", "Sales", 65000.32),
            new Employee(104, "Salman Khan", "Marketing", 35000.32)
        );

        System.out.println("\nAll Employee List : "); 
        empList.forEach(System.out::println);

        //sorted on id
        System.out.println("\nAll Employees sorted based on id : "); 
        empList.stream().sorted((e1,e2) -> e1.id().compareTo(e2.id())).forEach(System.out::println);


        //highest paid employee
        System.out.println("\nHighest paid Employee : ");
        empList.stream().sorted((emp1, emp2) -> emp2.salary().compareTo(emp1.salary())).limit(1)
                .forEach(System.out::println);
        
        //Lowest paid employee
        System.out.println("\nLowest paid Employee : ");
        empList.stream().sorted((emp1, emp2) -> emp1.salary().compareTo(emp2.salary())).limit(1)
                .forEach(System.out::println);

        
        //Highest paid Employee in a Department
        // Map<String, Employee> highDept = empList.stream().collect(Collectors.groupingBy(emp -> emp.dept(), Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::salary)), Optional::get)));
        Map<String, Employee> highDept = empList.stream().collect(
                Collectors.toMap(Employee::dept, e -> e, (e1, e2) -> e1.salary() > e2.salary() ? e1 : e2));
        
        System.out.println("\n");
        Set<Map.Entry<String, Employee>> data = highDept.entrySet();
        data.stream().forEach(System.out::println);
        
    }
}

record Employee(Integer id, String name, String dept, Double salary) {
}