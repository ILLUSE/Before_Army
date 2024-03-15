
public class Faculty extends Employee{

	String title;
	
	public Faculty() { //생성자
		super();
		title = "";
	}
	public Faculty(String name, String department , int employeeID , String title) {
		super(name,department,employeeID);
		this.title = title;
	}
	
	public void setTitle(String title) { //생성자
		this.title = title;
	}
	public String getTitle() { //접근자
		return title;
	}
	public void reset(String newName,String newDepartment,int newEmployeeID,String newTitle) { //reset
		super.reset(newName, newDepartment, newEmployeeID);
		title = newTitle;
	}
	public void writeOutput() { //정보출력
		super.writeOutput();
		System.out.println("Title is " + title);
	}
	public boolean equals(Faculty otherFaculty) {//equals
		return (super.equals(otherFaculty) && (title == otherFaculty.title)); 
	}
	
}
