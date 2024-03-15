
public class Employee extends Person{
	int employeeID; //employeeID와 department 
	String department;
	
	public Employee() { //생성자
		super();
		employeeID = 0;
		department = "";
	}
	public Employee(String name,String department,int employeeID ) { 
		super(name);
		this.department = department;
		this.employeeID = employeeID;
	}
	
	public void reset(String newName , String newdepartment,int newEmployeeID) { //reset
		setName(newName);
		department = newdepartment;
		employeeID = newEmployeeID;
	}
	public void setEmployeeID(int newEmployeeID) { //생성자
		employeeID = newEmployeeID;
	}
	public int getEmployeeID() { //접근자
		return employeeID;
	}
	public void setDepartment(String newDepartment) { //생성자
		department = newDepartment;
	}
	public String getDepartment() { //접근자
		return department;
	}
	public void writeOutput() { //정보 출력
		super.writeOutput();
		System.out.println("Employee ID is " + employeeID);
		System.out.println("Department is " + department);
	}
	public boolean equals(Employee otherEmployee) { //equals
		
		return (super.equals(otherEmployee) && (employeeID == otherEmployee.employeeID) &&
				(department.equals(otherEmployee.department)));
	}
}

