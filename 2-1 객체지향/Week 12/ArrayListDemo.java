import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<String> aList = new ArrayList<String>();
		
		String str;
		String YorN;
		boolean YesorNo = true;
		
		System.out.println("Enter items for the list,when prompted.");
		
		while(YesorNo) {
			System.out.println("Type an entry:");
			str = keyboard.nextLine();
			
			aList.add(str);
			
			System.out.println("More items for the list? ");
			YorN = keyboard.nextLine();
			
			if(YorN.equalsIgnoreCase("yes"))YesorNo = true;
			else YesorNo = false;
			
		}

		System.out.println("The list contains:");
		for(int i = 0;i<aList.size();i++) {
			System.out.println(aList.get(i));
		}
		
		/*
		 for(String element : aList){
		 System.out.println(element);
		 }
		 */
		
	}

}
