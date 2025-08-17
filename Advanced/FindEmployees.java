// Find Employees based on given conditions.

package com.classes;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;


public class FindEmployees {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "James Smith", 50000.32D);
        Employee emp2 = new Employee(2, "Alex Miller", 35000.55D);
        Employee emp3 = new Employee(3, "Jenny Shoff", 90000.98D);

        List<Employee> empList = Arrays.asList(emp1, emp2, emp3);
        System.out.println("All Employees List: ");
        empList.forEach(System.out::println);

        System.out.println("\nEmployee whose salary greater than 40000: ");
        empList.stream().filter(emp -> emp.salary() > 40000).forEach(System.out::println);
        ;

        System.out.println("\nEmployees in ascending order of salary: ");
        empList.stream().sorted((e1,e2) -> e1.salary().compareTo(e2.salary())).forEach(System.out::println);

        System.out.println("\nEmployees in descending order of salary: ");
        empList.stream().sorted((e1,e2) -> e2.salary().compareTo(e1.salary())).forEach(System.out::println);
    }
}

record Employee(Integer empId, String empName, Double salary){}

/* Output:
 * All Employees List:
 * Employee[empId=1, empName=James Smith, salary=50000.32]
 * Employee[empId=2, empName=Alex Miller, salary=35000.55]
 * Employee[empId=3, empName=Jenny Shoff, salary=90000.98]
 * 
 * Employee whose salary greater than 40000:
 * Employee[empId=1, empName=James Smith, salary=50000.32]
 * Employee[empId=3, empName=Jenny Shoff, salary=90000.98]
 * 
 * Employees in ascending order of salary:
 * Employee[empId=2, empName=Alex Miller, salary=35000.55]
 * Employee[empId=1, empName=James Smith, salary=50000.32]
 * Employee[empId=3, empName=Jenny Shoff, salary=90000.98]
 * 
 * Employees in descending order of salary:
 * Employee[empId=3, empName=Jenny Shoff, salary=90000.98]
 * Employee[empId=1, empName=James Smith, salary=50000.32]
 * Employee[empId=2, empName=Alex Miller, salary=35000.55]
 */