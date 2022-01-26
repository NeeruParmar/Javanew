package Method;

public class PayStub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question 1	Create a class Employee. Set the first Name, last name and hourly rate and print the first name,
//last name and rate . Use get and set method to update and retrieve values. Also add a method which will calculate
//the weekly salary of the person by taking no of hours worked as an input and multiplying it to hourly rate and print it.	
		
		Employee employee = new Employee ();
		String newFirstName = employee.getFirstName ();
		String newLastName = employee.getLastName ();
		double newHourlyrate=employee.getHourlyPay();
		double newNoOfHoursPerDay=employee.getnoOfHoursPerDay();
		double newnoOfhoursPerWeek =employee.getNoOfHoursPerWeek();
		
		
		newFirstName= "Kavya";
		newLastName = "Pathak";
		newHourlyrate= 30.0;
		double NewNoOfHoursPerDay = 10.0;
		double newNoOfhoursPerWeek= 50;
		
		
		employee.setFirstName(newFirstName);
		employee.setLastName(newLastName);
		employee.setHourlyPay(newHourlyrate);
		employee.setnoOfHoursPerDay(NewNoOfHoursPerDay);
		employee.setNoOfHoursPerWeeks(newNoOfhoursPerWeek);
		employee.totalWeeklyEarnings(10, 50);
			
		
	System.out.println("Employee First Name "+ newFirstName );
	System.out.println("Employee Last Name "+ newLastName );
	System.out.println("Employee Hourly Pay Rate "+ newHourlyrate );
	System.out.println("Employee total worked Hours"+ NewNoOfHoursPerDay);
	
	
		
		

	}

}
