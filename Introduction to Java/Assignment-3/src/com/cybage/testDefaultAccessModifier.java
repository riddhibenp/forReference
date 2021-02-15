package com.cybage;
//if we try to use the DefaultAccesModifier class in another class outside of cybagePackage, we will get a compilation error.
public class testDefaultAccessModifier {

	public static void main(String[] args) {
		DefaultAccesModifier df=new DefaultAccesModifier();
		df.diplay();

	}

}
