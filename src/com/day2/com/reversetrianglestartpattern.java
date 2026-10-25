package com.day2.com;

public class reversetrianglestartpattern {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++) {
			
			for(int spa=1; spa<=5-i; spa++) {
				System.out.print(" ");
			}
			
			for(int star=1; star<=i; star++) {
				System.out.print("*");
			}
			
			System.out.println( );
		}

	}

}
