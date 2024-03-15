import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

//hw5-1
public class abbreviationsDemo {

	public static void main(String[] args) {
		
		//abbreviation.txt를 위한 세팅
		String fileName = "1-abbreviations.txt";
		Scanner inputStream = null;
		
		try
		{
			inputStream = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file " + fileName);
		}
		
		
		
		//읽어드릴 임의의 텍스트 파일 beforeMarkded.txt를 위한 세팅
		String fileName2 = "beforeMarked.txt";
		Scanner inputStream2 = null;
		
		try
		{
			inputStream2 = new Scanner(new File(fileName2));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file " + fileName2);
		}
		
		int i=0; //beforeMarked의 문장을 띄어쓰기 단위로 arraylist에 저장
		ArrayList<String> list = new ArrayList<String>();
		while(inputStream2.hasNext()) {
			String word = inputStream2.next();
			String reword = word.replaceAll("[,]","");
			list.add(i,reword);
			i++;
			
		}
		//System.out.println(list); //list에 잘 들어갔는지 확인용
		
		//<>처리가 모두 끝난 상태를 저장하기 위한 afterMarked.txt를 위한 세팅
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
			
			slang = inputStream.nextLine(); //abbreviation.txt에 있는 줄임말을 slang에 저장
			
			//System.out.println(slang); //slang에 잘 들어갔는지 확인용
			
			for(int j =0;j<list.size();j++) { //list에 있는 단어들이 slang과 일치할경우 <>붙이기
				
				if(list.get(j).equalsIgnoreCase(slang)) {
					list.set(j, "<" + list.get(j) + ">");
				}
				
				
				
			}
			
		}
		//System.out.println(list); //잘 바뀌었는지 확인용
		
		for(int j =0;j<list.size();j++) {  //<>로 감싼 후 새로운 파일에 저장
		outputStream.print(list.get(j)+" ");
		}
		
		inputStream.close();
		inputStream2.close();
		outputStream.close();
	}

	

}
