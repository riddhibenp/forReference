package com.cybage;

public class Manager extends Employee{
	//name will be inherited
	private int allowance;

	public Manager(String n) {
		super(n);
		
	}

	public Manager(String name, int allowance) {
		super(name);
		this.allowance = allowance;
	}

	


	@Override
	public int calculateSalary() {
		return this.allowance;
	}
	
}
