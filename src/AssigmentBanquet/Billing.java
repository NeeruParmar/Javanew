package AssigmentBanquet;

import java.util.Scanner;

public class Billing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		Banquet banquet = new Banquet();

		System.out.println("Please Enter Cost of Food");
		int costOfFood = scan.nextInt();
		
		System.out.println("Please Enter Cost of Beverages");
		int costOfBeverages=scan.nextInt();
		System.out.println(" Enter Amount of Tip");
		int tipCharge =scan.nextInt();
		int BaseCost = banquet.calculateBaseCost(costOfFood, costOfBeverages, tipCharge);
		double tax = banquet.calculateTax(BaseCost);
		System.out.println("Enter the number of Guest");
		int numOfGuest=scan.nextInt();
		double cess = banquet.calculateCess(numOfGuest, BaseCost);
		double totalCost = banquet.calculateTheTotalCost(BaseCost, tax, cess);

		System.out.println("Total bill Cost  " + totalCost);
		
		
	}
}
