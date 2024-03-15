
public class Faculty extends Employee{

	String title;
	
	public Faculty() { //������
		super();
		title = "";
	}
	public Faculty(String name, String department , int employeeID , String title) {
		super(name,department,employeeID);
		this.title = title;
	}
	
	public void setTitle(String title) { //������
		this.title = title;
	}
	public String getTitle() { //������
		return title;
	}
	public void reset(String newName,String newDepartment,int newEmployeeID,String newTitle) { //reset
		super.reset(newName, newDepartment, newEmployeeID);
		title = newTitle;
	}
	public void writeOutput() { //�������
		super.writeOutput();
		System.out.println("Title is " + title);
	}
	public boolean equals(Faculty otherFaculty) {//equals
		return (super.equals(otherFaculty) && (title == otherFaculty.title)); 
	}
	
}
