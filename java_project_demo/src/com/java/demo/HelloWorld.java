package com.java.demo;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
				
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a number :");
		int num1=scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num1+"X"+i+"="+num1*i);	
		}
		
		
	}

}
