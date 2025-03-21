package com.demo;

import java.util.Arrays;

public class StringManipulations {
	 public static void main(String args[]) {
	     String name="Dhanu";
	     String obj = new String("Dhanu");
	    
	     System.out.println(name==obj);     
	     System.out.println(name.equals(obj));  
	     System.out.println(name.toLowerCase());
	     System.out.println(name.toUpperCase());
	     char a = name.charAt(0);
	     System.out.println(name.charAt(0));
	     System.out.println(a);
	     System.out.println(name.indexOf(97));
	     System.out.println(name.lastIndexOf('a'));
	     System.out.println(name.substring(0,3));
	     System.out.println(name.toCharArray());
	     System.out.println(a);
	     System.out.println(name.split("a"));
	     String[] d = name.split("");
	     System.out.println(Arrays.toString(d));
	     System.out.println(name.trim());
	     System.out.println(name.isBlank());
	     System.out.println(name.isEmpty());
	     System.out.println(name.concat(" P"));
	     System.out.println(name.replace('a', ' '));
	     System.out.println(name.replaceAll("Dhanu","Manisha"));
	            }
	}


