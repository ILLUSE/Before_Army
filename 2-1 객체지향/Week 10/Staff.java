
public class Staff extends Employee{
	int grade;

	public Staff() { //생성자
		super();
		grade = 0;
	}
	public Staff(String name, String department , int employeeID ,int grade) {
		super(name,department,employeeID);
		this.grade = grade;
	}
	
	public void setGrade(int grade) { //생성자
		if(grade >= 1 && grade <= 20  )
		this.grade = grade;
		else {
			System.out.println("Illegal Grade!");
			System.exit(0);
		}
	}
	public int getgrade() { //접근자
		return grade;
	}
	public void reset(String newName,String newDepartment,int newEmployeeID,int newGrade) { //reset
		super.reset(newName, newDepartment, newEmployeeID);
		grade = newGrade;
	}
	public void writeOutput() { //정보 출력
		super.writeOutput();
		System.out.println("Grade is " + grade);
	}
	public boolean equals(Staff otherStaff) { //equals
		return (super.equals(otherStaff) && (grade == otherStaff.grade));
	}
}
