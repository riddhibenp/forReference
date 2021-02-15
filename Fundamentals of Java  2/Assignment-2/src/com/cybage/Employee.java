package com.cybage;

public class Employee{		
	private int id;
	private String name;
	private String address;
	
	private int generateId() {
		return (int) (Math.round(Math.random()*100000));
	}
	//constructor
	public Employee(){
		System.out.println("empty object created");
		this.id = generateId();
		this.name = null;
		this.address = null;
	}
	
	public int getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
	
	
	
	
	public static void main(String[] args) {
		Employee[] emp = new Employee[5];
		emp[0]=new Employee();
		emp[1]=new Employee();
		emp[2]=new Employee();
		
		
		System.out.println(emp.length);
		
//		e1.toString();
//		e1.setName("abcd");
//		e1.getName();
		
	}
	
	
}
