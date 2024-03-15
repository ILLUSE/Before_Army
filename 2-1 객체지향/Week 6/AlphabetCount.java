//센티넬 값 역할을 하는 마침표로 끝나는 텍스트 행을 읽는 프로그램을 작성합니다. 
//텍스트에서 각 문자가 발생하는 횟수와 함께 한 줄당 하나씩 알파벳 순으로 텍스트에서 발생하는 모든 문자를 표시합니다.
//인덱스 0의 요소가 a의 수를 포함하도록 기본 유형 26의 배열을 사용합니다.
//인덱스 1의 요소가 b의 수를 포함하도록 합니다.
//대문자와 소문자를 모두 입력으로 허용하되, 동일한 문자의 대문자와 소문자 버전은 동일한 것으로 간주합니다.
import java.util.Scanner;

public class AlphabetCount {

	public static void main(String[] args) {
	
		String line;
		while(true) { //.으로 끝나는 문장을 입력받기
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type a line of text that ends with a period: ");
		line = keyboard.nextLine();
		boolean endsWith = line.endsWith(".");
		if(endsWith) break;
		else System.out.println("Please type again(Line is not ends with period)");
		}
		
		line = line.toLowerCase(); //전부 소문자로 변경
		
		int[] alphabet = new int[26];
		
		char[] array = line.toCharArray(); //문자열을 문자형 배열로 변경
		
		int ascii = 97;
		char ch = (char)ascii;
		
		for(int i = 0;i<array.length;i++) { //알파벳의 갯수에 맞게 alphabet배열의 값 설정
			
			
			
			if(array[i] == 'a') alphabet[0]++;
			else if(array[i] == 'b') alphabet[1]++;
			else if(array[i] == 'c') alphabet[2]++;
			else if(array[i] == 'd') alphabet[3]++;
			else if(array[i] == 'e') alphabet[4]++;
			else if(array[i] == 'f') alphabet[5]++;
			else if(array[i] == 'g') alphabet[6]++;
			else if(array[i] == 'h') alphabet[7]++;
			else if(array[i] == 'i') alphabet[8]++;
			else if(array[i] == 'j') alphabet[9]++;
			else if(array[i] == 'k') alphabet[10]++;
			else if(array[i] == 'l') alphabet[11]++;
			else if(array[i] == 'm') alphabet[12]++;
			else if(array[i] == 'n') alphabet[13]++;
			else if(array[i] == 'o') alphabet[14]++;
			else if(array[i] == 'p') alphabet[15]++;
			else if(array[i] == 'q') alphabet[16]++;
			else if(array[i] == 'r') alphabet[17]++;
			else if(array[i] == 's') alphabet[18]++;
			else if(array[i] == 't') alphabet[19]++;
			else if(array[i] == 'u') alphabet[20]++;
			else if(array[i] == 'v') alphabet[21]++;
			else if(array[i] == 'w') alphabet[22]++;
			else if(array[i] == 'x') alphabet[23]++;
			else if(array[i] == 'y') alphabet[24]++;
			else if(array[i] == 'z') alphabet[25]++;
			
		}
		
		ascii = 97;  
		
		for(int i =0;i<alphabet.length;i++) {  //알파벳의 갯수가 0이상이면 해당 알파벳이 몇개 있는지 출력
		ch = (char) ascii;
			if(alphabet[i] != 0) System.out.println(ch + ": " + alphabet[i] + " time(s)");
		ascii = ascii + 1;
		}
		
	}

	
}
