package in.co.number;

public class BreakContinue {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				//continue;//Current iteration is skiped
				break;//All Iteration is ommited after break
			}
			System.out.println("VALUE" + " " + i);
		}
	}

}
