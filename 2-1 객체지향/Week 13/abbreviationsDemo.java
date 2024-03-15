import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

//hw5-1
public class abbreviationsDemo {

	public static void main(String[] args) {
		
		//abbreviation.txt�� ���� ����
		String fileName = "1-abbreviations.txt";
		Scanner inputStream = null;
		
		try
		{
			inputStream = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file " + fileName);
		}
		
		
		
		//�о�帱 ������ �ؽ�Ʈ ���� beforeMarkded.txt�� ���� ����
		String fileName2 = "beforeMarked.txt";
		Scanner inputStream2 = null;
		
		try
		{
			inputStream2 = new Scanner(new File(fileName2));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file " + fileName2);
		}
		
		int i=0; //beforeMarked�� ������ ���� ������ arraylist�� ����
		ArrayList<String> list = new ArrayList<String>();
		while(inputStream2.hasNext()) {
			String word = inputStream2.next();
			String reword = word.replaceAll("[,]","");
			list.add(i,reword);
			i++;
			
		}
		//System.out.println(list); //list�� �� ������ Ȯ�ο�
		
		//<>ó���� ��� ���� ���¸� �����ϱ� ���� afterMarked.txt�� ���� ����
		String fileName3 = "afterMarked.txt";
		PrintWriter outputStream = null;
		
		try
		{
			outputStream = new PrintWriter(fileName3);
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file " + fileName3);
		}
		
	
		String slang = new String("");
		while(inputStream.hasNextLine()) { 
			
			slang = inputStream.nextLine(); //abbreviation.txt�� �ִ� ���Ӹ��� slang�� ����
			
			//System.out.println(slang); //slang�� �� ������ Ȯ�ο�
			
			for(int j =0;j<list.size();j++) { //list�� �ִ� �ܾ���� slang�� ��ġ�Ұ�� <>���̱�
				
				if(list.get(j).equalsIgnoreCase(slang)) {
					list.set(j, "<" + list.get(j) + ">");
				}
				
				
				
			}
			
		}
		//System.out.println(list); //�� �ٲ������ Ȯ�ο�
		
		for(int j =0;j<list.size();j++) {  //<>�� ���� �� ���ο� ���Ͽ� ����
		outputStream.print(list.get(j)+" ");
		}
		
		inputStream.close();
		inputStream2.close();
		outputStream.close();
	}

	

}
