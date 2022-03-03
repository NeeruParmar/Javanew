package hashmapAssignment;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numerator value x");

		int numx = sc.nextInt();

		System.out.println("Enter denominator value y");

		int numy = sc.nextInt();
		int divide = numx / numy;

		try {

			System.out.println("Result " + divide);

		} catch (Exception exception) {
			// System.out.println("Exception occurred");
			// syso statement can also be added but it will not print the specific exception

		} finally {

			sc.close();
		}

	}

}
