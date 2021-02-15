package com.cybage;

public class Account {
	private int id;
	private String name;
	private long account_no;
	public Account()//non-parameterized constructor
	{
		System.out.println("empty object created");
		this.id = 1;
		this.name = "abcd";
		this.account_no = 12345678;
	}
	public Account(int id, String name, long account_no)//parameterized-constructor
	{	//local variable
		System.out.println("object with values created");
		this.id = id;
		this.name = name;
		this.account_no = account_no;
	}
	
	
	public void display(){
		System.out.println("Id="+id+"_"+"Name="+name+"_"+"Account-no="+account_no);
	}

}
