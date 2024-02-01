package com.java.basics;

import java.util.Scanner;

public class HellowWorld {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num =sc.nextInt();
	int rev=0;
	int rem;
	int temp=num;
	for(int i=num;i>0;) {
		rem=i%10;
		rev=rev*10+rem;
		i=i/10;
	}
	System.out.println("Reverce number is:"+rev);
	if(temp==rev) {
		System.out.println("Is a palindrome");	
	}else {
		System.out.println("is not a palindrome");
	}

	}

}
