import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//hw5-4
public class PetRecordDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		ArrayList<PetRecord> PetList = new ArrayList<PetRecord>();
		
		while(true) { //������ ���� �꿡 ���� ��ü �����Ͽ� arraylist�� �ֱ�
			System.out.println("Yes:Make another Pet class / No:exit");
			String YorNo = keyboard.nextLine();
			
			if(YorNo.equalsIgnoreCase("Yes")) { //���� ���� �Է¹ޱ�
				String name;
			    int age;       // in years
			    double weight; //in pounds
				System.out.println("Enter pet's name:"); 
		        name = keyboard.nextLine();
		        System.out.println("Enter pet's age:");
		        age = keyboard.nextInt();
		        if(age < 0)
		        {
		            System.out.println("Error: Age cannot be negative.");
		            System.exit(0);
		        }
		        System.out.println("Enter pet's weight:");
		        weight = keyboard.nextDouble();
		        if(weight < 0)
		        {
		            System.out.println("Error: Weight cannot be negative.");
		            System.exit(0);
		        }
				PetList.add(new PetRecord(name,age,weight));
				
			}
			else if(YorNo.equalsIgnoreCase("No")){
				break;
			}
		}
		
		if(PetList.size()>1) { //arraylist ���
			 Collections.sort(PetList);
			 
			System.out.println(PetList);
			
		}
		else System.out.println(PetList);

	}
	
	
		
	
}
