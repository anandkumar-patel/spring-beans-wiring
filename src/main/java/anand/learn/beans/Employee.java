package anand.learn.beans;

public class Employee {
	private String fullName;
	
	private Department department;

	public Employee(Department department) {
		System.out.println("Employee class constructor called");
		this.department = department;
		System.out.println();
	}
	public Employee() {
		super();
		System.out.println("Employee class default constructor called");
	}

	public Department getDepartmentBean() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}