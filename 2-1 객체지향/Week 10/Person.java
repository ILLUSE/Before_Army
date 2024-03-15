
public class Person {

	String name = "";
	
	public Person() { //생성자
		name = "";
	}
	public Person(String name) {
		this.name = name;
	}
	
	public void setName(String newName) { //설정자
		name = newName;
	}
	public String getName() { //접근자
		return name;
	}
	public void writeOutput() { //정보 출력
		System.out.println("Name is " + name);
	}
	public boolean equals(Person otherPerson) { 
		return(this.name.equalsIgnoreCase(otherPerson.name)); 
			
	}
	
}
