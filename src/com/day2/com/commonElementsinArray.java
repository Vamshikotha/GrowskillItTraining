package com.day2.com;

public class commonElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {10,20,30,40,60,80};
		
		int arr2[]= {20,40,60,90,88,70};
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					break;
				}
						
			}
		}
		
		
		
		
		}

	}


