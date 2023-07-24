package com.corejava;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		final String validUsername = "shuvam";
		final String validPassword = "pass456";
		int maxLoginAttempts = 3;
		int loginAttempts = 0;

		Scanner sc = new Scanner(System.in);

		while (loginAttempts < maxLoginAttempts) {
			System.out.print("Enter your login name: ");
			String username = sc.nextLine();

			System.out.print("Enter your password: ");
			String password = sc.nextLine();

			if (username.equals(validUsername) && password.equals(validPassword)) {
				System.out.println("Welcome, " + validUsername + "!");
				break;
			} else {
				loginAttempts++;
				System.out.println("Invalid login credentials. Attempts left: " + (maxLoginAttempts - loginAttempts));
			}
		}

		if (loginAttempts >= maxLoginAttempts) {
			System.out.println("Contact Admin");
		}

	}
}
