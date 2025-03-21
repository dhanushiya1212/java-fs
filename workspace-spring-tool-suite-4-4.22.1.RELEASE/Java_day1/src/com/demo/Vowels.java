package com.demo;

import java.util.Scanner;

public class Vowels {
	public static void main(String args[]) {
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		System.out.println("Enter the character");
		char[] ch = {'a','e','i','o','u'};
		int n=0;
		char ch = scan.next().charAt(0);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<str.length;i++) {
			if(arr[i]==ch[j])
				n++;
		}
		}
		System.out.println(n);
}
}
