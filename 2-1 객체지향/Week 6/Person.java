
public class Person {

	String name;
	int age = 0;
	
	
	
	public Person() { //name을 "No name yet" / age를 0으로 설정하는 생성자
		name = "No name yet";
		age = 0;
	}
	public Person(String name,int age) { // name과 age를 매개변수로 받아 설정하는 생성자
		this.name = name;
		this.age = age;
	}
	
	public String getName() { //name을 리턴
		return name;
		
			
	}
	
	public int getAge() {//age를 리턴
		return age;
		
	}
	
	public void setName(String first,String last) { //주어진 두 문자열 first 와 last로 name을 설정
		name = first + " " + last;
	}
	public void setName(String name) { //주어진 한줄의 문자열로 name을 설정
		this.name = name;
	}
	
	public void setAge(int age) { //주어진 age로 age 설정
		this.age = age;
	}
	
	public static Person createToddler() { //toddler 설정 name = A toddler / age = 2
		Person person = new Person();
		person.setName("A toddler");
		person.setAge(2);
		return person;
	}
	public static Person createPreschooler() { //Preschooler 설정 name = A preschooler / age = 5
		Person person = new Person();
		person.setName("A Preschooler");
		person.setAge(5);
		return person;
	}
	public static Person createAdolescent() { //Adolescent 설정 name = A adolescent / age = 9
		Person person = new Person();
		person.setName("A Adolescent");
		person.setAge(9);
		return person;
	}
	public static Person createTeenager() { //Teenager 설정 name = A teenager / age = 15
		Person person = new Person();
		person.setName("A Teenager");
		person.setAge(15);
		return person;
	}
	public static Person createAdult() { //Adult 설정 name = An adult / age = 21
		Person person = new Person();
		person.setName("An adult");
		person.setAge(21);
		return person;
	}
	
}
