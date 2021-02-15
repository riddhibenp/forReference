package com.cybage;

public class SalesManager extends Employee{
	//id, name, address inherited
	private int commission;

	public SalesManager(String n) {
		super(n);
	}

	public SalesManager(String name, int commission) {
		super(name);
		this.commission = commission;		
	}


	@Override
	public int calculateSalary() {
		return this.commission;
	}	
}