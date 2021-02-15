package com.cybage;

public class Account {
	 int balance= 5000;

	    public int getBal(){
	        return balance;
	    }

	    public void withdraw(int bal){
	        balance= balance-bal;
	    }

	    
}
