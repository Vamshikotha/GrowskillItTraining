package com.day2.com;

public class ProgramIfElseInForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		for(i=0; i<=10; i++) {
			
			if((3*i)%2==0) {
				
			
			System.out.println("Hello Welcome");
			}
			else if((3*i)%5==0) {
				System.out.println("Bye");
			}
			
			else {
				System.out.println(3*i);
			}
			
		}
	}

}
