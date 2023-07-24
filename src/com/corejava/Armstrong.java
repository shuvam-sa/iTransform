package com.corejava;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int t=n;
		double r=0;
		double sum=0;
		while(n!=0) {
			r=n%10;
			sum=sum+Math.pow(r,3);
			n=n/10;
		}
		if(t==sum) {
			System.out.println(t+" is an Armstrong number");
		}
		else
		{
			System.out.println(t+" is not an Armstrong number");
		}
		
	}

}
