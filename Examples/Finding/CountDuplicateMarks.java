package com.classes;

import java.util.*;
import java.util.stream.Collectors;

public class CountDuplicateMarks {
    public static void main(String... args) {

        List<Student> studentList = Arrays.asList(
                new Student(101, 420, 500, 82.00),
                new Student(102, 340, 500, 68.00),
                new Student(103, 420, 500, 82.00),
                new Student(104, 360, 500, 72.00),
                new Student(105, 440, 500, 89.00));

        // Group by percentage
        Map<Double, List<Student>> groupedByPercentage = studentList.stream()
                .collect(Collectors.groupingBy(Student::percentage));

        // Filter only percentages that appear more than once
        List<Student> duplicates = groupedByPercentage.values().stream()
                .filter(list -> list.size() > 1)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        // Print the result
        duplicates.forEach(System.out::println);
    }
}

record Student(Integer id, Integer marksObtained, Integer totalMarks, Double percentage) {
}


/*
 * Student[id=101, marksObtained=420, totalMarks=500, percentage=82.0]
 * Student[id=103, marksObtained=420, totalMarks=500, percentage=82.0]
*/