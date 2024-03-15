import java.util.Scanner;
import java.io.*;

//hw5-2

public class TelephoneNumberDemo {

	public static void main(String[] args) throws InvalidTelephoneFormatException {
		
		TelephoneNumber[] array = new TelephoneNumber[10];
		Scanner keyboard = new Scanner(System.in);
		String yOrNo = "Yes"; 
		int i=0;
		String number = "0";
		while(true) {
			
			System.out.println("Write another number:( Yes / No )");  //사용자의 여부에 따라 전화번호 입력받기
			yOrNo = keyboard.nextLine();
			if(yOrNo.equalsIgnoreCase("yes")){
				
				System.out.println("Please type telephone number(XXX-XXX-XXXX) :");
				number = keyboard.nextLine();
				TelephoneNumber telephoneNumber = new TelephoneNumber(number);
				array[i] = telephoneNumber;
				i++;
			}
			else if (yOrNo.equalsIgnoreCase("no")) break;
		}
		
		String fileName = "BinaryFile.txt"; //binary 파일에 입력하기 위한 세팅
		try {
			FileOutputStream foStream = new FileOutputStream(fileName);
			ObjectOutputStream oStream = new ObjectOutputStream(foStream);
		
			oStream.writeObject(array);
		
			oStream.close();
		
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		TelephoneNumber[] anotherArray = null; 
		
		try { //다른 배열에 파일에서 읽어온 전화번호 입력
			FileInputStream fiStream = new FileInputStream(fileName);
			ObjectInputStream iStream = new ObjectInputStream(fiStream);
			
			anotherArray = (TelephoneNumber[])iStream.readObject();
			
			iStream.close();
		}
		catch(Exception e) {
			System.out.println("Error");
			System.exit(0);
		}
		
		System.out.println("The Array read from " + fileName);
		for(int j=0;j<anotherArray.length;j++) {
			if(anotherArray[j] != null)
			System.out.println(anotherArray[j]);
		}
		
		int choice=0;
		int index = 0;
		while(true) { //파일에서 읽은 후 사용자의 여부에 따라 전화번호 바꾸기
			System.out.println("What do you want to do?");
			System.out.println("1: change / 2: add / 3: delete / -1:exit");
			choice = keyboard.nextInt();
			if(choice == 1) {
				System.out.println("Which index do you want to change? :");
				index = keyboard.nextInt();
				System.out.println("Please type number you want to change :");
				number = keyboard.next();
				TelephoneNumber telephoneNumber = new TelephoneNumber(number);
				anotherArray[index] = telephoneNumber;
				System.out.println(index + "`s number changed");
			}
			else if(choice == 2) {
				System.out.println("Please type number you want to add :");
				number = keyboard.next();
				TelephoneNumber telephoneNumber = new TelephoneNumber(number);
				anotherArray[i] = telephoneNumber;
				System.out.println(i + "`s number add");
				i++;
				
			}
			else if(choice == 3) {
				System.out.println("Which index do you want to delete? :");
				index = keyboard.nextInt();
				anotherArray[index] = null;
				System.out.println(index + "`s number deleted");
			}
			else if(choice == -1) {
				break;
			}
			else System.out.println("Please type right choice!");
		}
		
		System.out.println("The Array after changed:  ");
		for(int j=0;j<anotherArray.length;j++) {
			if(anotherArray[j] != null)
			System.out.println(anotherArray[j]);
		}
		
		try { //사용자의 여부에 따라 바꾼 전화번호들을 바꾸기전의 번호들과 교체하여 넣기
			FileOutputStream foStream = new FileOutputStream(fileName);
			ObjectOutputStream oStream = new ObjectOutputStream(foStream);
		
			oStream.writeObject(anotherArray);
		
			oStream.close();
		
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
