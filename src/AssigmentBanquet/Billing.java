package AssigmentBanquet;

import java.util.Scanner;

public class Billing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		Banquet banquet = new Banquet(0.20, 0.10, 0.10);

		System.out.println("Welcome to  Blossom Banquet");
		System.out.println("these are following information before booking ");
		System.out.println("1. Base booking cost cannot be less than $100");
		System.out.println(
				"2. cost of food, beverage cannot be $0,0 but tip is optional, you can add tip vased on experience");
		System.out.println(
				"3. Banquet has maximum capacity of 500 guest  with minimum number of guest should be more than 30");
		System.out.println("4. Food and beverage  tax will be applicable in addition to the total tax");

		System.out.println("ENTER THE BASE COST: $ ");

		banquet.setbaseCost(scan.nextDouble());
		if (banquet.getBaseCost() >= 100) {
			System.out.println("ENTER THE FOOD COST: $");
			banquet.setCostOfFood(scan.nextDouble());

			if (banquet.getCostOfFood() > 0.0) {
				System.out.println("Enter BEVERAGE COST: $");
				banquet.setCostOfBeverages(scan.nextDouble());

				if (banquet.getCostOfBeverages() > 0.0) {
					System.out.println("Enter NUMBER OF GUEST: ");
					int numberOfGuest = scan.nextInt();
					if (numberOfGuest >= 30 && numberOfGuest <= 500) {
						System.out.println("Enter tip amt (optional): $");
						banquet.tipCharge = scan.nextDouble();

						double totalBaseCost = banquet.calculateBaseCost(banquet.getBaseCost(), banquet.getCostOfFood(),
								banquet.getCostOfBeverages());

						double finalAmtToBePaid = banquet.calculateTheTotalCost(totalBaseCost,
								banquet.getTotalTax(totalBaseCost), numberOfGuest,
								banquet.getCessTax(numberOfGuest, totalBaseCost));

						System.out.println("Billing Amt" + finalAmtToBePaid);
					} else {
						System.out.println("invalid number oF guest entered please enter correct number ");
					}

				} else {
					System.out.println("Invalid amt entered for beverage Cost, please follow instruction ");
				}

			} else {
				System.out.println("invalid amt entered for food Cost, please enter correct value");
			}
		} else {
			System.out.println("Invalid amount entered , base booking cost need to more than $100");
		}
	}
}
