package test6.sub08;

public class Employee extends Person {
	
	protected String employeeId;
	protected String dept;
	protected int salary;
	
	
	
	public Employee(String name, String birth, String employeeId, String dept, int salary) {
		super(name, birth);
		this.employeeId = employeeId;
		this.dept = dept;
		this.salary = salary;
	}

	public void raiseSalary(int salary) {
		this.salary += salary;
	}
	
	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	public void printEmployeeInfo() {
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + birth);
		System.out.println("직원 아이디 : " + employeeId);
		System.out.println("부서" + dept);
		System.out.println("급여" + salary);
		
	}
	
	
	
	
	
	
}
