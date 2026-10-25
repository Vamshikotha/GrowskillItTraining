package com.day3.com;

public class EmployeeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(35, 30001, 4000f);
		
	
		
		Employee emp2= new Employee(36, 30002, 5000f);
		
		
		
		
		
		System.out.println(emp.age+":" + emp.id+ ":"+ emp.salary);
		
		emp2.increaseAge();
		
		System.out.println(emp2.age);
		
		
		
			
		
		

	}

}
