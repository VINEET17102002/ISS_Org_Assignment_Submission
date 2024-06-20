package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class SortingExample {
    private static final Logger logger = LogManager.getLogger(SortingExample.class);

    public static void main(String[] args) {
        // List of integers
        List<Integer> intList = Arrays.asList(5, 3, 1, 4, 2);
        Collections.sort(intList);
        logger.info("Sorted List of Integers: {}", intList);

        // List of custom objects
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "John"));
        studentList.add(new Student(1, "Jane"));
        studentList.add(new Student(2, "Joe"));
        logger.info("List of Students: {}", studentList);

        // Sorting the list of students using Comparable
        Collections.sort(studentList);
        logger.info("Sorted List of Students by ID: {}", studentList);

        // Sorting the list of students using Comparator
        studentList.sort(Comparator.comparing(Student::getName));
        logger.info("Sorted List of Students by Name: {}", studentList);
    }
}

class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}
