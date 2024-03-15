
public class Student extends Person {

	int studentNumber = 0;
	
	public Student() { //생성자
		super ();
		studentNumber = 0;
	}
	public Student(String name,int studentNumber) {
		super (name);
		this.studentNumber = studentNumber;
	}
	
	public void reset(String newName,int newStudentNumber) { //reset
		setName(newName);
		studentNumber = newStudentNumber;
	}
	public int getStudentNumber() { //접근자
		return studentNumber;
	}
	public void setStudentNumber(int newStudentNumber) { //생성자
		studentNumber = newStudentNumber;
	}
	
	public void writeOutput() { //정보 출력
		System.out.println("Name is " + name);
		System.out.println("Student number is " + studentNumber);
	}
	public boolean equals(Student otherStudent) { //equals
		return this.name.equals(otherStudent.name) &&
				(this.studentNumber == otherStudent.studentNumber);
	}
	
}
