package com.demo;

public class SampleClass 
{
    public static void main(String args[])
    {
    	int a = 1234,sum=0;
    	while(a>0) {
    		sum+=a%10;
    		a/=10;
    	}
    	System.out.println("sumofdigits"+sum);
 
    	
    }
}
	 