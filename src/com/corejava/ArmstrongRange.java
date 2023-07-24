package com.corejava;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongRange {

	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>();
		for(int i=100;i<999;i++) {
			int n=i;
			double sum=0.0;
			while(n!=0) {
				double r=n%10;
				sum=sum+Math.pow(r, 3);
				n=n/10;
			}
			if(sum==i) {		
				ls.add(i);
			}
			
		}
		for(int l:ls) {
			System.out.print(l+" ");
		}
		
	}

}
