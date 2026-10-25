package com.day3.com;

public class programPolyMorphysm {
	

	static int sum(int num1, int num2) {
		return  num1+num2;
	}
	
	
	static int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	
	static float sum(float num1, float num2) {
		return num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum(2,3);
		
		System.out.println(result);
		System.out.println(sum(2,3,4));
		System.out.println(sum(2.3f,3.3f));

	}

}
