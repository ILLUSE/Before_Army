
public class Person {

	String name;
	int age = 0;
	
	
	
	public Person() { //name�� "No name yet" / age�� 0���� �����ϴ� ������
		name = "No name yet";
		age = 0;
	}
	public Person(String name,int age) { // name�� age�� �Ű������� �޾� �����ϴ� ������
		this.name = name;
		this.age = age;
	}
	
	public String getName() { //name�� ����
		return name;
		
			
	}
	
	public int getAge() {//age�� ����
		return age;
		
	}
	
	public void setName(String first,String last) { //�־��� �� ���ڿ� first �� last�� name�� ����
		name = first + " " + last;
	}
	public void setName(String name) { //�־��� ������ ���ڿ��� name�� ����
		this.name = name;
	}
	
	public void setAge(int age) { //�־��� age�� age ����
		this.age = age;
	}
	
	public static Person createToddler() { //toddler ���� name = A toddler / age = 2
		Person person = new Person();
		person.setName("A toddler");
		person.setAge(2);
		return person;
	}
	public static Person createPreschooler() { //Preschooler ���� name = A preschooler / age = 5
		Person person = new Person();
		person.setName("A Preschooler");
		person.setAge(5);
		return person;
	}
	public static Person createAdolescent() { //Adolescent ���� name = A adolescent / age = 9
		Person person = new Person();
		person.setName("A Adolescent");
		person.setAge(9);
		return person;
	}
	public static Person createTeenager() { //Teenager ���� name = A teenager / age = 15
		Person person = new Person();
		person.setName("A Teenager");
		person.setAge(15);
		return person;
	}
	public static Person createAdult() { //Adult ���� name = An adult / age = 21
		Person person = new Person();
		person.setName("An adult");
		person.setAge(21);
		return person;
	}
	
}
