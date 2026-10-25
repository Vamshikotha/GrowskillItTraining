package com.day3.com;

public class Program_This {
	
	class ParentK{
		
		String Country;
		
	}
	
	class EmployeeK extends ParentK
	{
		int empId;
		
		String empName;
		
		String CompanyName;
	
	
	void setEmpId(int empId) {
		
		this.empId= empId;
	}
	
	EmployeeK(int empId, String empName, String companyName){
		this.CompanyName= companyName;
		
		this.empId= empId;
		
		this.empName= empName;
	}
	
	void print() {
		System.out.println(this.empId+ " "+this.CompanyName+ "" + this.empName+" "+ this.Country);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
