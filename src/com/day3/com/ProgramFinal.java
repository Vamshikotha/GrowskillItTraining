package com.day3.com;

public class ProgramFinal {
	
	
	final class TestK{
		
		String testName="maths Test";
		final int code= 100;
		
		final String schoolName= "ABC Public School";
		
		
		void setCode(int code1) {
			
			code = code1;
			testName= "science Test";
		}
		
		final void print() {
			System.out.println("hello");
		}
		
		
		void print (int num ) {
			
		}
		
		
		
	}
	
	
	class TestM extends TestK{
		 void print (int num) {
			 
		 }
		 
		 void print () {
			 System.out.println("Bye");
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestK obj = new TestK();
		System.out.println(obj.code);
		
		obj.code=102;

	}

}
