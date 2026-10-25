package com.day2.com;

public class PrintFactorsOf30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;

        System.out.println("Factors of " + n + " are:");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
	}

}
