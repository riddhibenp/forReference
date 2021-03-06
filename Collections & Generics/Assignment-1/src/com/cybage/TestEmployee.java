package com.cybage;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
 
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(5, "aTestName", "dLastName", 34);
        Employee e2 = new Employee(1, "nTestName", "pLastName", 30);
        Employee e3 = new Employee(10, "kTestName", "sLastName", 31);
        Employee e4 = new Employee(4, "dTestName", "zLastName", 25);
 
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e2);
        employees.add(e3);
        employees.add(e1);
        employees.add(e4);
 
        // UnSorted List
        System.out.println(employees);
 
        TreeSet<Employee> ts = new TreeSet<Employee> ();
        ts.addAll(employees);
        // Sorting by employee id
        System.out.println(ts);
    }
}