package com.cybage;

public class testPrivateAccessModifier {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		PrivateAccessModifier pf=new PrivateAccessModifier();
		//error due to private variable
		//System.out.println(pf.a);

	}

}
