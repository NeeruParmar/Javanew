package Comp;

import java.util.ArrayList;

public class MainEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee kavyaAcc = new Employee("Kavya", 1111, "PharmacyAssistant");
		Employee KetakiAcc = new Employee("Ketaki", 2222, "PharmacyManager");
		Employee krishnaAcc = new Employee("krishna", 3333, "PharmacyAssistant");

		// ArrayList<PersonAccount> accountList = new ArrayList<PersonAccount>();

		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		// adding
		employeeList.add(kavyaAcc);
		employeeList.add(KetakiAcc);
		employeeList.add(krishnaAcc);
		// adding new hired employee to existing list
		Employee karamAcc = new Employee("Karam", 4444, "Pharmacist");
		employeeList.add(karamAcc);

		// Retrieve emp Karam details

		String karamJobProfile = employeeList.get(employeeList.indexOf(karamAcc)).getJobPosition();
		int KaramEmpId = employeeList.get(employeeList.indexOf(karamAcc)).getEmpId();

		System.out.println(
				"New Employee Karam position   at Walmart  is  " + karamJobProfile + "  And Emp ID  is " + KaramEmpId);

		int ketakiEmpId = employeeList.get(employeeList.indexOf(KetakiAcc)).getEmpId();

		System.out.println("Existing Employee Ketaki Emp ID " + ketakiEmpId);

		// removing emp

		employeeList.remove(kavyaAcc);

		System.out.println("Current Position of Employee Krishna in list  " + employeeList.indexOf(krishnaAcc));

	}

}
