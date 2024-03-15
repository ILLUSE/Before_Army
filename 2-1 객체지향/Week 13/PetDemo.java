import java.io.*;
import java.util.Scanner;
import java.util.*;


//hw5-3
public class PetDemo {

	public static void main(String[] args) {

		ObjectInputStream iStream = null;
		ObjectOutputStream oStream = null;

		String fileName = null;

		Scanner keyboard = new Scanner(System.in);

		String again = "yes";

		while(again.equalsIgnoreCase("yes")) {  //사용자에게 입력받아 쓸것인지 읽을 것인지 결정
			System.out.println("Enter R to read / W to write :");

			char RorW;

			RorW =  keyboard.next().charAt(0);

			if(RorW == 'R' || RorW == 'r') { //파일이름을 입력받은 후 객체 생성
				System.out.println("Please type file name:");
				fileName = keyboard.next();

				try {
					iStream = new ObjectInputStream(new FileInputStream(fileName));
				}
				catch(IOException e) {
					System.out.println("Error opening file " + fileName);
					System.exit(0);
				}

				Pet pet = new Pet();

				try {
					while(true) { //파일에 있는 객체 출력
						pet = (Pet)iStream.readObject();
						System.out.println(pet);
						System.out.println();
						System.out.println("=========");
					}
				}
				catch(EOFException e) {
					System.out.println("EOF");
				}
				catch(IOException e) {
					System.out.println("Error reading file " + fileName);
					System.exit(0);
				}
				catch(ClassNotFoundException e){

					System.out.println("Error : Not found " + fileName);
					System.exit(0);

				}

				try{
					iStream.close(); 
				}

				catch(IOException e) {

					System.out.println("Error : closing file " + fileName);
					System.exit(0);

				}

				System.out.println("Read or write another file(yes or no): ");
				again = keyboard.next();

			}
			else if(RorW == 'W' || RorW == 'w') {

				System.out.println("Please type file name:"); //파일이름 입력받은 후 작성하기
				fileName = keyboard.next();

				try

				{

					oStream = new ObjectOutputStream(new FileOutputStream(fileName));

				}
				catch(IOException e)

				{

					System.out.println("Error opening " + fileName);
					System.exit(0);

				}

				char Again;

				
				do {
					Pet pet = new Pet();
					
					try
					{
						oStream.writeObject(pet); //펫을 파일에 입력
					}

					catch(IOException e)
					{
						System.out.println("Error writing to file " + fileName);
						System.exit(0);
					}

					System.out.println("Enter another PetRecord? (y or n)");

					Again = keyboard.next().charAt(0);

				}
				while(Again == 'y' || Again == 'Y');

				try {
					oStream.close();
				}
				catch(IOException e) {
					System.out.println("Error closing file " + fileName);
					System.exit(0);
				}

				System.out.println("Finished writing PetRecords to file.");

				System.out.println("Read or write another file? (y for yes)");

				again = keyboard.next();

			}

			else {

				System.out.println("Invalid input");
				again = "yes";

			}



		}

	}


}


