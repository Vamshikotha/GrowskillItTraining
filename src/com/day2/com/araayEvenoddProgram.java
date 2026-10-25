package com.day2.com;

public class araayEvenoddProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {11,24,35,46,57,68,70,82};
		
		int eveCount=0;
		
		int oddCount=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				eveCount++;
				
			}else {
				oddCount++;
			}
			System.out.println("Even"+ eveCount);
			System.out.println("odd"+ oddCount);
			
					
		}

	}

}
