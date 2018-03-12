package in.co.number;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		int a, b;
		String option;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter First Num");
		a = in.nextInt();
		System.out.println("Enter Second Num");
		b = in.nextInt();
		System.out.println("Enter Operation");
		option = in.next();

		if (option.trim().equals("+")) {
			System.out.println("Addtion= " + (a + b));

		}
		if (option.trim().equals("-")) {
			System.out.println("Subtraction= " + (a - b));
		}
		if (option.trim().equals("/")) {
			System.out.println("Division= " + (a / b));

		}
		if (option.trim().equals("*")) {
			System.out.println("Multiplication= " + (a * b));

		} else if (!option.trim().equals("+") && !option.trim().equals("-")
				&& !option.trim().equals("/") && !option.trim().equals("*")) {
			System.out.println("This option will be made for you!!!!");
		}
		in.close();

	}

}
