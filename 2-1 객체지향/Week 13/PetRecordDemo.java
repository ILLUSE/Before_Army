import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//hw5-4
public class PetRecordDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		ArrayList<PetRecord> PetList = new ArrayList<PetRecord>();
		
		while(true) { //루프를 돌며 펫에 대한 객체 생성하여 arraylist에 넣기
			System.out.println("Yes:Make another Pet class / No:exit");
			String YorNo = keyboard.nextLine();
			
			if(YorNo.equalsIgnoreCase("Yes")) { //펫의 정보 입력받기
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
		
		if(PetList.size()>1) { //arraylist 출력
			 Collections.sort(PetList);
			 
			System.out.println(PetList);
			
		}
		else System.out.println(PetList);

	}
	
	
		
	
}
