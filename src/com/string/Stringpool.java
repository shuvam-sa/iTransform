package com.string;

public class Stringpool {

	public static void main(String[] args) {
		String str="Java String pool refer to collection of strings which are stored in heap memory";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace("a", "$"));
		System.out.println(str.contains("collection"));
		System.out.println(str.matches(str));
		System.out.println(str.compareTo(str));

	}

}



