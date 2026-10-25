package com.day2.com;

public class fibanacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter=10;
		
		int num1=0;
		
		int num2=1;
		
		for(int i=0; i<=counter-2;i++)
		{
			int num3= num1 + num2;
			
			System.out.println(num3 +" ");
			
			num1=num2;
			num2=num3;
		}

	}

}
