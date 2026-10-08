package com.day2.com;

public class NestedIf {

	public static void main(String[] args) {
	int age = 18;
	char gender ='F';
	
	if(age==18)
	{
		System.out.println(("Congrats on your first vote"));
			if(gender=='F'){
				System.out.println("the voter is a girl");
				
			}
			else {
				System.out.println("the voter is a boy");
			}
	}
	
	if(age >=18) {
		System.out.println("you are elgible to vote");
		
	}
	
	else {
		System.out.println("you are not elgible to vote");
	}
	}

}
