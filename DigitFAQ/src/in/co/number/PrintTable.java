package in.co.number;

import java.util.Scanner;

public class PrintTable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number Whose table to be printed:");
		int N = in.nextInt();
		for (int i = 1; i <= 10; i++) {
			int mul = N * i;
			System.out.println(N + " x " + i + " = " + mul);

		}
		in.close();
	}

}
