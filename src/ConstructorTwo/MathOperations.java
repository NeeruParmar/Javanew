package ConstructorTwo;

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		Numbers obj1 = new Numbers();
		Numbers obj2 = new Numbers(88, 88, 90);

		System.out.println("Number1" + obj1.num1);
		System.out.println("Number2" + obj1.num2);
		System.out.println("Number2" + obj1.num2);

		System.out.println("New list of Numbers ");
		System.out.println("Number1 =" + obj2.num1);
		System.out.println("Number1 =" + obj2.num2);
		System.out.println("Number3 =" + obj2.num3);

		obj1.MultiplicationOfThreeNumbers(2, 2, 2);
		obj2.MultiplicationOfThreeNumbers(88, 88, 90);

	}

}
