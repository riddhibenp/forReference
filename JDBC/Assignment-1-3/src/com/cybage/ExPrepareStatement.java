package com.cybage;

import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ExPrepareStatement {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Mahant1!");

			Scanner KB =new Scanner(System.in);

			//input employee id
			System.out.print("Enter Employee ID: ");
			int id=KB.nextInt();
			//input employee name
			System.out.print("Enter Employee Name: ");
			String name=KB.next();
			
			//creating object of PreparedStatement class and passing parameter (?)
			PreparedStatement smt=cn.prepareStatement("insert into employees values(?,?)");

			// set the values
			smt.setInt(1, id);
			smt.setString(2, name);
			

			//to execute update
			smt.executeUpdate();
			System.out.println("Record Submitted....");
			
			
			
			//display
			PreparedStatement smt1=cn.prepareStatement("select * from employees");
			ResultSet rs = smt1.executeQuery();
			while (rs.next()) {
				id=rs.getInt(1);
				name=rs.getString(2);
				System.out.println("id="+id+"    "+"name="+name);
			
			}
			
			//close the file
			cn.close();
		}
		catch(Exception e){
			System.out.println(e);
			
		}
	}
}
