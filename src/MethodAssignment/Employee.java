package MethodAssignment;

public class Employee {
	String firstName = "Mansi";
	String lastName = "Kaur";
	double hourlyPay = 40.0;
	
	double totalWeeklyEarnings = 0;

	String getFirstName() {
		return firstName;
	}

	void setFirstName(String initialName) {
		firstName = initialName;

	}

	String getLastName() {
		return lastName;

	}

	void setLastName(String name) {
		lastName = name;

	}

	double getHourlyPay() {
		return hourlyPay;
	}

	void setHourlyPay(Double pay) {
		hourlyPay = pay;

	}
	//hourly pay already declared 

	void totalWeeklyEarnings (double NoOfHoursPerWeek) {
		System.out.println("Total Weekly Earnings" + (NoOfHoursPerWeek * hourlyPay));
		
		
		
	}
}
