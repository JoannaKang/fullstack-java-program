package com;

public class LoopingDemo {

	public static void main(String[] args) {
//		int i = 0 ;
//		int n = 10;
		
		// while(i <= n) {
		//	System.out.println("while" + i);
		//	i++;
		// }
		
//		do {
//			System.out.println("do while" + i);
//			i++;
//		} while(i<=n);
		
		for (int i=0, n=10; i<n; i++) {
			System.out.println("for loop" + i);
		}
		
		System.out.println("finish");

	}

}
