package AssigmentBanquet;

public class Banquet {

	int totalBaseCost;
	double totalTax;
	double totalCess;
	double theTotalCost;

	int calculateBaseCost(int costOfFood, int costOfBeverages, int tipCharge) {
		totalBaseCost = costOfFood + costOfBeverages + tipCharge;
		return totalBaseCost;

	}

	private double calculateTax(int totalBaseCost) {
		// tax percentage =20%
		totalTax = totalBaseCost * 0.20;
		return totalTax;

	}

	private double calculateCess(int numberOfGuest, int totalBaseCost) {

		if (numberOfGuest <= 40) {
			return totalCess = 0.04 * totalBaseCost;
		} else if (numberOfGuest <= 80) {

			return totalCess = 0.08 * totalBaseCost;
		}

		else if (numberOfGuest <= 150) {
			return totalCess = 0.10 * totalBaseCost;
		}

		else {
			return totalCess = 0.125 * totalBaseCost;
		}

	}

	double calculateTheTotalCost(int totalBaseCost, double totalTax, double totalCess, int numberOfGuest) {
		theTotalCost = totalBaseCost + calculateCess(numberOfGuest, totalBaseCost)
				+ calculateCess(numberOfGuest, totalBaseCost);
		return theTotalCost;
	}

}
