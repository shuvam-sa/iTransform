package com.corejava;

import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your annual income (CTC): ");
		double ctc = scanner.nextDouble();

		double taxAmount = 0.0;

		if (ctc <= 180000) {
			taxAmount = 0.0;
		} else if (ctc <= 300000) {
			taxAmount = ctc * 0.10;
		} else if (ctc <= 500000) {
			taxAmount = ctc * 0.20;
		} else if (ctc <= 1000000) {
			taxAmount = ctc * 0.30;
		}

		System.out.println("Income Tax Amount: " + taxAmount);

	}
}
