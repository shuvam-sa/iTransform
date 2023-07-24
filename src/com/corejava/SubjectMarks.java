package com.corejava;

import java.util.Scanner;

public class SubjectMarks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter marks for Subject 1: ");
		int marks1 = scanner.nextInt();
		System.out.print("Enter marks for Subject 2: ");
		int marks2 = scanner.nextInt();
		System.out.print("Enter marks for Subject 3: ");
		int marks3 = scanner.nextInt();
		if (marks1 > 60 && marks2 > 60 && marks3 > 60) {
			System.out.println("Result: Passed");
		} else if ((marks1 > 60 && marks2 > 60) || (marks1 > 60 && marks3 > 60)
				|| (marks2 > 60 && marks3 > 60)) {
			System.out.println("Result: Promoted");
		} else if (marks1 > 60 || marks2 > 60 || marks3 > 60) {
			System.out.println("Result: Passed");
		} else {
			System.out.println("Result: Failed");
		}
	}
}
