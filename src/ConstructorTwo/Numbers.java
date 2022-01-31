package ConstructorTwo;

public class Numbers {
	int num1;
	int num2;
	int num3;

	Numbers() {
System.out.println("List of numbers");
	}

	Numbers(int num1, int num2, int num3) {

		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	void MultiplicationOfThreeNumbers(int num1, int num2, int num3) {
		System.out.println("Multiplication result " + (num1 * num2 * num3));

	}
}
