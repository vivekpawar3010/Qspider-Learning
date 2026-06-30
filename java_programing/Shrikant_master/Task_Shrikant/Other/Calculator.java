import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {
		for (;;) {
			System.out.println("************ WEOCOME TO THE VIVEK CALCULTOR *************");
			Scanner sc = new Scanner(System.in);
			System.out.print("ENTER THE FIRST INPUT VALUE :- ");
			double op1 = sc.nextDouble();
			System.out.print("ENTER THE OPRATION YOU WANT TO PERFORM + OR - OR * OR / OR % :- ");
			char opration = sc.next().charAt(0);
			System.out.print("ENTER THE SECOND INPUT VALUE :- ");
			double op2 = sc.nextDouble();
			double output = 0;
			output = (opration == '+') ? (op1 + op2)
					: ((opration == '-') ? (op1 - op2)
							: ((opration == '*') ? (op1 * op2)
									: ((opration == '/') ? (op1 / op2)
											: ((opration == '%') ? (op1 % op2) : (Double.MAX_VALUE)))));

			System.out.println("3");
			if (output == Double.MAX_VALUE) {
				System.out.println("\n INVALID INPUT\n");

			} else {
				System.out.println(op1 + " " + opration + " " + op2 + " = " + String.format("%.3f", output));

			}

		}

	}
}