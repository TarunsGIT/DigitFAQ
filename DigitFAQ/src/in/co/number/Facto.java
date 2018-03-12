package in.co.number;

import java.util.Scanner;

public class Facto {

	public static void main(String[] args) {

		int input = 0;
		int fact = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Num..");
		input = in.nextInt();
		while (input >= 1) {
			fact = fact * input;
			input--;
		}

		System.out.println("Fact Of Num : " + fact);
		in.close();

	}

}
