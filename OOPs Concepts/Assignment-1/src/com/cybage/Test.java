package com.cybage;

public class Test {

	public static void main(String[] args) {
		Manager m=new Manager("ABC",500);
		SalesManager s=new SalesManager("DEF",250);
		System.out.println("Name"+m.getName()+"Salary"+m.calculateSalary());
		System.out.println("Name"+s.getName()+"Salary"+s.calculateSalary());
		
	}

}
