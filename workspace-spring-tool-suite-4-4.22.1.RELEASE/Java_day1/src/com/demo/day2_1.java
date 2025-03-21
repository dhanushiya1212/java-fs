package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class day2_1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int[] obj = new int[5];
		for(int i=0;i<obj.length;i++) {
			obj[i] = scan.nextInt();
		}
		int x = 1;
		for(int i=0;i<obj.length;i++) {
			x *=obj[i];
	}
		System.out.println(Arrays.toString(obj));
		System.out.println(x);
		
	}

}
