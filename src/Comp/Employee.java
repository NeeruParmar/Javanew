package Comp;

public class Employee {

	private String empName;
	private int empId;
	private String jobPosition;

	public Employee(String empName, int empId, String jobPosition) {

		this.empName = empName;
		this.empId = empId;
		this.jobPosition = jobPosition;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

}
