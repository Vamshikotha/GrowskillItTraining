package com.day3.com;

public class Employee {

	int id;
	int age;
	
	float salary;
	
	
	Employee(int Age, int Id, float Salary ){
	    age= Age;
		
		id= Age;
		
		salary= Salary;
		
	}
	
	void increaseAge() {
		age++;
	}
	
	
	int getEmpId() {
		return id;

	}
	
	
	void setEmpId(int Id) {
		id= Id;
	}
	
	
	int getAge() {
		return age;
	}
	
	
	void setAge(int Age) {
		age= Age;
		
	}
	
	
	float getSalary() {
		
		return salary;
	}
	
	
	void setSalary(float sal) {
		salary= sal;
		
	}
	
	
	

}
