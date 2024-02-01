package com.java.basics;

import java.util.Scanner;

public class StringEqual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First  String name");
		String str1=sc.next();
		System.out.println("Enter the Second String name");
		String str2=sc.next();
		
		if(str1.equals(str2)) {
			System.out.println("both strings are equal");
		}else {
			System.out.println("Both Strings are not equal");
			
		}

	}
	}
