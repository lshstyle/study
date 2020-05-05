package com.example;

public class Test {
	
	public static void main(String[] args) {
		String a1 = "a" + "b";
		String b1 = "ab";
		b1 = "333";
		System.out.println(a1==b1);
		
		int[] a0 = {1,2,3};
		int[][] a = new int[3][];
		a[0] = a0;
	}

}
