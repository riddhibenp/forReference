package com.cybage;

public class SingletonImpl {

	public static void main(String[] args) {
		SingletonClass s1=SingletonClass.getInstance();
		SingletonClass s2=SingletonClass.getInstance();
		System.out.println("Instance 1 hash:" + s1.hashCode());
		System.out.println("Instance 2 hash:" + s2.hashCode());

	}

}
