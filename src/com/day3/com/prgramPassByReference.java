package com.day3.com;

public class prgramPassByReference {
	static void decrease(int[] num) {
		num[0]=num[0]-10;
		System.out.println(num[0]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] digit= {100,200,300};
		
		decrease(digit);
		System.out.println(digit[0]);
		

	}


	

}
