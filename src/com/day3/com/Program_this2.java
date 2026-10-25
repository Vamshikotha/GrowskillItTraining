package com.day3.com;



class  TestD{
	int code;
	
	String testName;
	
	TestD(){
		this(101, "MathTest");
		System.out.println("Default Constructor");
	}
		
		TestD(int code, String testName){
			this.code=code;
			this.testName= testName;
			System.out.println("Paramterized constructor");
		}
			
	
}
public class Program_this2 {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestD obj= new TestD();
		
		System.out.println(obj.code+ ""+ obj.testName);
	}

}
