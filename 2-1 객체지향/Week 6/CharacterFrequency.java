//전화 번호에 숫자가 나타나는 횟수를 세는 프로그램을 작성합니다.
//프로그램은 0부터 9까지의 각 자릿수를 저장할 크기 10의 배열을 만들어야 합니다.
//키보드에서 전화 번호를 문자열로 읽습니다.
//전화 번호의 각 문자를 검사하고 배열의 적절한 수를 늘립니다.
//배열의 내용을 표시합니다.
import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		
		int[] digit = new int[10];
		String phoneNumber; 
		
		Scanner keyboard = new Scanner(System.in); //전화번호 입력받기
		System.out.println("Type phone number: ");
		phoneNumber = keyboard.nextLine();
		
		char[] array = new char[phoneNumber.length()]; //전화번호를 문자형 배열로 변경
		array = phoneNumber.toCharArray();
		
		
		
		
			for(int j = 0;j<array.length;j++) { //번화번호에 각 숫자가 포함된만큼 digit배열의 값을 변경 
				
				if(array[j] == '0') digit[0]++;
				else if (array[j] == '1') digit[1]++;
				else if (array[j] == '2') digit[2]++;
				else if (array[j] == '3') digit[3]++;
				else if (array[j] == '4') digit[4]++;
				else if (array[j] == '5') digit[5]++;
				else if (array[j] == '6') digit[6]++;
				else if (array[j] == '7') digit[7]++;
				else if (array[j] == '8') digit[8]++;
				else if (array[j] == '9') digit[9]++;
				
			}
			
		
		
		System.out.println("Digit | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |"); 
		System.out.println("Count   " + digit[0] + "   " + digit[1] + "   " + digit[2] + "   "+ digit[3] + "   "+ digit[4] + "   "+ digit[5] + "   "+ digit[6] + "   "+ digit[7] + "   "+ digit[8] + "   "+ digit[9]);
	}

}
