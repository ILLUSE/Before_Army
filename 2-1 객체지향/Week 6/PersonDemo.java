
public class PersonDemo {

	public static void main(String[] args) {
		 Person y = new Person();
		 System.out.println("Testing the default constructor");
		 System.out.println("Oject has name " + y.getName() + " and age " + y.getAge());
		 
		 System.out.println("\nCreating each of the specialized instances");
		 
		 Person x;
		 
		 x = Person.createToddler();
		 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
		 
		 x = Person.createPreschooler();
		 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
		
		 x = Person.createAdolescent();
		 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
		 
		 x = Person.createTeenager();
		 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
		 
		 x = Person.createAdult();
		 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
		 
		 System.out.println("\nTesting set - Name should be Bobby with age 10");
		 x.setName("Bobby");
		 x.setAge(10);
		 System.out.println("Oject has name " + x.getName() + " and age " + x.getAge());
		 
		 
		 System.out.println("\nTesting the alternate set method - name change to Jane Doe");
		 x.setName("Jane", "Doe");
		 x.setAge(10);
		 System.out.println("Oject has name " + x.getName() + " and age " + x.getAge());
		 }

}
