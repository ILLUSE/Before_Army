
public class Employee extends Person{
	int employeeID; //employeeID�� department 
	String department;
	
	public Employee() { //������
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
	public void setEmployeeID(int newEmployeeID) { //������
		employeeID = newEmployeeID;
	}
	public int getEmployeeID() { //������
		return employeeID;
	}
	public void setDepartment(String newDepartment) { //������
		department = newDepartment;
	}
	public String getDepartment() { //������
		return department;
	}
	public void writeOutput() { //���� ���
		super.writeOutput();
		System.out.println("Employee ID is " + employeeID);
		System.out.println("Department is " + department);
	}
	public boolean equals(Employee otherEmployee) { //equals
		
		return (super.equals(otherEmployee) && (employeeID == otherEmployee.employeeID) &&
				(department.equals(otherEmployee.department)));
	}
}

