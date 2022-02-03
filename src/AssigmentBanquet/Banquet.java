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

	double calculateTax(int totalBaseCost) {
		//tax percentage =20%
		totalTax = totalBaseCost * 0.20;
		return totalTax;

	}

	double calculateCess(int numberOfGuest, int totalBaseCost) {

		if (numberOfGuest <= 40) {
			double totalCess = 0.04 * totalBaseCost;
		} else if (numberOfGuest <= 80) {

			double totalCess = 0.08 * totalBaseCost;
		}

		else if (numberOfGuest <= 150) {
			double totalCess = 0.10 * totalBaseCost;
		}

		else {
			double totalCess = 0.125 * totalBaseCost;
		}

		return totalCess;

	}

	double calculateTheTotalCost(int totalBaseCost, double totalTax, double totalCess) {
		theTotalCost = totalBaseCost + totalTax + totalCess;
		return theTotalCost;
	}

}
