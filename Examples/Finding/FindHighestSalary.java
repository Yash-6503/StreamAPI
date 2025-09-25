/*
 * Find Highest Salary of an Employee using Stream API.
*/

package com.classes;

import java.util.*;


public class FindHighestSalary {
    public static void main(String[] args) {
        
        List<Employee> empList = Arrays.asList(

            new Employee(101, "Vishal Pagere", 80000.99),
            new Employee(102, "Virat Kohli", 39000.99),
            new Employee(103, "Rohit Sharma", 70000.99),
            new Employee(104, "Sachin Tendulkar", 95000.99),
            new Employee(105, "Harsh Jadhav", 60000.99)

        );

        System.out.println("List of All Employees...");
        empList.stream().forEach(System.out::println);

        //now finding employee whose salary is highest among all employees.
        Employee emp = empList.stream().sorted((emp1, emp2) -> emp2.salary().compareTo(emp1.salary())).findFirst()
        .get();
        System.out.println("\nEmployee Whose salary is highest among all: \n"+emp);
        
        //now finding employee whose salary is lowest among all employees.
        emp = empList.stream().sorted((emp1, emp2) -> emp1.salary().compareTo(emp2.salary())).findFirst().get();
        System.out.println("\nEmployee Whose salary is lowest among all: \n"+emp);

    }
}

record Employee(Integer empId, String name, Double salary) {
}

/* Output:
 * List of All Employees...
 * Employee[empId=101, name=Vishal Pagere, salary=80000.99]
 * Employee[empId=102, name=Virat Kohli, salary=39000.99]
 * Employee[empId=103, name=Rohit Sharma, salary=70000.99]
 * Employee[empId=104, name=Sachin Tendulkar, salary=95000.99]
 * Employee[empId=105, name=Harsh Jadhav, salary=60000.99]
 * 
 * Employee Whose salary is highest among all:
 * Employee[empId=104, name=Sachin Tendulkar, salary=95000.99]
 * 
 * Employee Whose salary is lowest among all:
 * Employee[empId=102, name=Virat Kohli, salary=39000.99]
 */