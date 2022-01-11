package LoopAssignment;

public class QuestionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ques 3 Write a program that prompts the user to input a positive integer. It
		// should then output a message indicating whether the number is a prime number
		// or not.

		int num = 5;

		int countFactor = 0;

		if (num > 1) {

			for (int forCounter = 1; forCounter <= num; forCounter++) {
				if (num % forCounter == 0)
					countFactor++;
			}
				if (countFactor == 2) {
					System.out.println("num is a Prime Num");

				} else {
					System.out.println("not a Prime number");
				}
			}
		}
	}

