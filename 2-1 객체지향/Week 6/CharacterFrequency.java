//��ȭ ��ȣ�� ���ڰ� ��Ÿ���� Ƚ���� ���� ���α׷��� �ۼ��մϴ�.
//���α׷��� 0���� 9������ �� �ڸ����� ������ ũ�� 10�� �迭�� ������ �մϴ�.
//Ű���忡�� ��ȭ ��ȣ�� ���ڿ��� �н��ϴ�.
//��ȭ ��ȣ�� �� ���ڸ� �˻��ϰ� �迭�� ������ ���� �ø��ϴ�.
//�迭�� ������ ǥ���մϴ�.
import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		
		int[] digit = new int[10];
		String phoneNumber; 
		
		Scanner keyboard = new Scanner(System.in); //��ȭ��ȣ �Է¹ޱ�
		System.out.println("Type phone number: ");
		phoneNumber = keyboard.nextLine();
		
		char[] array = new char[phoneNumber.length()]; //��ȭ��ȣ�� ������ �迭�� ����
		array = phoneNumber.toCharArray();
		
		
		
		
			for(int j = 0;j<array.length;j++) { //��ȭ��ȣ�� �� ���ڰ� ���Եȸ�ŭ digit�迭�� ���� ���� 
				
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
