package com.cybage;

public class Task extends Thread{
	@Override
	public void run(){
		System.out.println("I am performing large task"+currentThread().getName()+"_"+currentThread().getId());
		for(int i=0;i<10;i++){
			
			int sum =i+10;
			System.out.println("sum"+sum);
			
		}
	}
}