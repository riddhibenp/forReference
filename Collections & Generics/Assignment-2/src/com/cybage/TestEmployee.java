package com.cybage;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

 
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "aTestName", "dLastName", 34);
        Employee e2 = new Employee(2, "nTestName", "pLastName", 30);
        Employee e3 = new Employee(3, "kTestName", "sLastName", 31);
        Employee e4 = new Employee(4, "dTestName", "zLastName", 25);
 
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e2);
        employees.add(e3);
        employees.add(e1);
        employees.add(e4);
        //1
        // UnSorted List
        
        System.out.println(employees);
 
        employees.sort((Employee s1, Employee s2)->s1.getFirstName().compareTo(s2.getFirstName()));
 
        // Sorting by employee id
        System.out.println("Sorting By Name:");
        System.out.println(employees);
        
        //2
        System.out.println("Enter Name to find:");
        Scanner s=new Scanner(System.in);
        String abc=s.next();
        abc
        try {
        	if(employees.contains(abc))
        	{
        	System.out.println("Name Found!!!");
        	}
        	
        	
        }catch(NoSuchElementException e){
        	 System.out.println("Element absent");
       }
        
        
        
      }
    }