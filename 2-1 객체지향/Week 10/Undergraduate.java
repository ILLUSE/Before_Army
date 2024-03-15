
public class Undergraduate extends Student{
	int level;

	public Undergraduate() { //생성자
		super();
		level = 0;
	}
	public Undergraduate(String name,int studentNumber, int level) {
		super(name,studentNumber);
		this.level = level;
	}
	
	public int getlevel() { //접근자
		return level;
	}
	public void setlevel(int newlevel) { //생성자
		if((1<=newlevel) && (newlevel <= 4))
			level = newlevel;
		else System.out.println("Illegal level!");
		System.exit(0);
	}
	public void reset(String newName,int newStudentNumber,int newlevel) { //reset
		super.reset(newName, newStudentNumber);
		setlevel(newlevel);
	}
	public void writeOutput() { //정보 출력
		super.writeOutput();
		System.out.println("Strudent level is " + level);
	}
	public boolean equals(Undergraduate otherUndergraduate) { //equals
		return(super.equals(otherUndergraduate) && (this.level == otherUndergraduate.level));
	}
}
