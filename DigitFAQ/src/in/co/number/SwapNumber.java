package in.co.number;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Value Of a..");
		a = in.nextInt();
		System.out.println("Enter Value Of b..");
		b = in.nextInt();

		/*
		 * a = a + b; b = a - b; a = a - b;
		 */

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("Value Of a: " + a);
		System.out.println("Value Of b: " + b);
		in.close();
	}

}
