package LoopAssignment;

import java.util.Scanner;

public class UserNameQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String originalUserName = "pivotAdmin";
		String originalPassword = "Admin123";

		String newPassword = "";
		String newUserName = "";
		
	
		for (int counterAttempt = 1; counterAttempt <= 3; counterAttempt++) {
			
			System.out.println("newUserName");
			newUserName = sc.next();
			System.out.println("newPassword");
			newPassword = sc.next();

			if ((newUserName.equals(originalUserName)) && (newPassword.equals(originalPassword))) {

				System.out.println("you are logged In");

				break;
			} else if (counterAttempt == 3) {
				System.out.println("Account locked");
			} else {
				System.out.println("incorrect User Id or passowrd Try again");
			}

		}
	}
}
