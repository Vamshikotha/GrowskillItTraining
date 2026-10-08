package com.day2.com;

public class gradeProgramIFElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=87;
		
		if(marks>=90 && marks<=100)
		{
			System.out.println("Grade A");
		}
		
		else if(marks>=80 && marks<=89)
		{
			System.out.println("Grade B");
		}
		
		else if(marks>=70 && marks<=79)
		{
			System.out.println("Grade C");
		}
		
		else
		{
			System.out.println("Grade D");
		}
	}

}
