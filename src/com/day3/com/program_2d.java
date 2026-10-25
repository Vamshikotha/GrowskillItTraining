package com.day3.com;

public class program_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marksArr[][]= {{68,69,70,89}, {71,72,73,87}};
		
		System.out.println(marksArr[0][1]);
		
		for(int rows=0; rows<=marksArr.length; rows++) {
			for(int col=0; col<=marksArr[rows].length; col++) {
				
				System.out.print(marksArr[rows][col]+ " ");
				System.out.println();
			}
		}
		
		
		
		
				
	}

}
