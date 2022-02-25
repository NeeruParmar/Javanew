package AssigmentBanquet;

public class Banquet {

	double baseCost;
	double costOfFood;
	double costOfBeverages;
	double tipCharge;
	double totalTax;
	double totalCess;
	double theTotalCost;

	double foodTax;
	double beverageTax;

	Banquet(double foodTax, double beverageTax, double totalTax) {
		this.foodTax = foodTax;
		this.beverageTax = beverageTax;
		this.totalTax = totalTax;
	}

	public double getBaseCost() {
		return baseCost;
	}

	public void setbaseCost(double baseCost) {
		this.baseCost = baseCost;
	}

	public double getCostOfFood() {
		return costOfFood;
	}

	public void setCostOfFood(double costOfFood) {
		this.costOfFood = costOfFood;
	}

	public double getCostOfBeverages() {
		return costOfBeverages;
	}

	public void setCostOfBeverages(double costOfBeverages) {
		this.costOfBeverages = costOfBeverages;
	}

	double calculateBaseCost(double baseCost, double costOfFood, double costOfBeverages) {
		double totalBaseCost = baseCost + (costOfFood + (costOfFood * foodTax))
				+ (costOfBeverages + (costOfBeverages * beverageTax)) + tipCharge;
		return totalBaseCost;

	}

	private double calculateTax(double totalBaseCost) {
		// tax percentage =20%
		totalTax = totalBaseCost * 0.20;
		return totalTax;
	}

	double getTotalTax(double totalBaseCost) {
		return calculateTax(totalBaseCost);

	}

	private double calculateCess(int numberOfGuest, double totalBaseCost) {

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

	double getCessTax(int guestCount, double totalBaseCost) {
		return calculateCess(guestCount, totalBaseCost);

	}

	double calculateTheTotalCost(double totalBaseCost, double totalTax, int numberOfGuest, double CessTax) {
		double theTotalCost = totalBaseCost + calculateTax(totalBaseCost) + calculateCess(numberOfGuest, totalBaseCost);

		return theTotalCost;
	}
	
	
	
	
	
}
