package com.demo;
import java.util.*;
public class task {
	public static void main(String args[]) {
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.next();
		System.out.println("Enter the character");
		char ch = scan.next().charAt(0);
        int n=0;//incrementing the ch
        char[] arr =str.toCharArray();
        for(int i=0;i<arr.length;i++){
        	if(arr[i]==ch)
        		n++;
        	
        	
        }
        
        
        System.out.println(n);
		
	}

}

































