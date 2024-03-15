import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class TextfileInputDemo2 {

	public static void main(String[] args) {
		
		String fileName = "Transactions.txt";
		Scanner inputStream = null;
		
		try {
			inputStream = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file " + fileName);
		}
		
		String line = inputStream.nextLine();
		double total = 0.0;
		while(inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			//System.out.println(line);
			String[] ary = line.split(",");
			System.out.println("Sold " + ary[1] + " of " + ary[3] + " (SKU: " + ary[0] + ") at $ " + ary[2] + " each");
			total = total + Double.parseDouble(ary[1]) * Double.parseDouble(ary[2]);
			
		}
		System.out.println("Total is " + total);
		inputStream.close();
		
		

	}

}
