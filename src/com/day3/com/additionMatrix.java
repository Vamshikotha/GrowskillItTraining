package com.day3.com;

public class additionMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrixA[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int matrixB[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int matrixC[][]= new int[3][3];
		
		for(int row=0; row<matrixA.length; row++) {
			
			for(int col=0; col<matrixA[row].length; col++)
			{
				matrixC[row][col]= matrixA[row][col]+ matrixB[row][col];
				
				System.out.print(matrixC[row][col]+ " ");
				
				
			}
			
			System.out.println();
				
		}
		
	}

}
