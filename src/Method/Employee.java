package Method;

public class Employee {
	String firstName = "Mansi";
	String lastName = "Kaur";
	double hourlyPay = 40;
	double noOfHoursPerDay = 8.0;
	double noOfhoursPerWeek = 0 ;
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

	
	double getnoOfHoursPerDay() {
		return noOfHoursPerDay;
	}

	void setnoOfHoursPerDay(Double Hours) {
		noOfHoursPerDay = Hours;
	}
	
	
	double getNoOfHoursPerWeek() {
		return noOfhoursPerWeek;
	}
	
	
	void setNoOfHoursPerWeeks(Double weeklyhours) {
		noOfhoursPerWeek = weeklyhours;
	}
	

	void totalWeeklyEarnings (double NoOfHoursPerWeek,double hourlyPay) {
		System.out.println("Total Weekly Earnings" + NoOfHoursPerWeek * hourlyPay);
		
		
		
	}
}
