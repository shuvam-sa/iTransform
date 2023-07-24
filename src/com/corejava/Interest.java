package com.corejava;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		double principal = sc.nextDouble();
		System.out.print("Enter the rate of interest: ");
		double rate = sc.nextDouble();
		System.out.print("Enter the time : ");
		double time = sc.nextDouble();

		double simpleInterest = (principal * rate * time) / 100;
		double compoundInterest = principal * Math.pow(1 + rate / 100, time) - principal;

		System.out.println("Simple Interest (SI): " + simpleInterest);
		System.out.println("Compound Interest (CI): " + compoundInterest);
	}

}
