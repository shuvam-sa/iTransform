package com.corejava;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 64, 34, 25, 12, 22, 11, 90, 10, 15, 12, 35, 16, 98, 56, 34 };
		System.out.println("Enter the number to be found");
		int num = sc.nextInt();
		for (int i = 0; i < 15; i++) {
			if (arr[i] == num) {
				System.out.println(num + " is found");
			}
		}
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < 15; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
