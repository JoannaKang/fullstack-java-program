package com;

public class ArrayMemoryExp {
	public static void main (String[] args) {
		int num[] = new int[10]; // num can hold 10 values starts from 0 to 9
		int temp = 100;
		
		for (int i=0; i<num.length; i++) {
			num[i] = temp++;
			System.out.println(num[i]);
		}
		
		System.out.println("display the value");
		
		for(int n:num) {
			System.out.println(n);
		}
		
		
	}

}
