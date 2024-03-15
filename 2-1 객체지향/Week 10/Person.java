
public class Person {

	String name = "";
	
	public Person() { //������
		name = "";
	}
	public Person(String name) {
		this.name = name;
	}
	
	public void setName(String newName) { //������
		name = newName;
	}
	public String getName() { //������
		return name;
	}
	public void writeOutput() { //���� ���
		System.out.println("Name is " + name);
	}
	public boolean equals(Person otherPerson) { 
		return(this.name.equalsIgnoreCase(otherPerson.name)); 
			
	}
	
}
