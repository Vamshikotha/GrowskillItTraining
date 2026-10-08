package com.day2.com;

public class swapNumbersWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 10;
		 int num2=20;
		 
		 num1= num1+num2;
		 num2=num1-num2;
		 num1=num1-num2;
		 
		 System.out.println("value of num1 and num2 after swapping "+ num1);
		 System.out.println("value of num1 and num2 after swapping "+ num2);
	}

}
