//��Ƽ�� �� ������ �ϴ� ��ħǥ�� ������ �ؽ�Ʈ ���� �д� ���α׷��� �ۼ��մϴ�. 
//�ؽ�Ʈ���� �� ���ڰ� �߻��ϴ� Ƚ���� �Բ� �� �ٴ� �ϳ��� ���ĺ� ������ �ؽ�Ʈ���� �߻��ϴ� ��� ���ڸ� ǥ���մϴ�.
//�ε��� 0�� ��Ұ� a�� ���� �����ϵ��� �⺻ ���� 26�� �迭�� ����մϴ�.
//�ε��� 1�� ��Ұ� b�� ���� �����ϵ��� �մϴ�.
//�빮�ڿ� �ҹ��ڸ� ��� �Է����� ����ϵ�, ������ ������ �빮�ڿ� �ҹ��� ������ ������ ������ �����մϴ�.
import java.util.Scanner;

public class AlphabetCount {

	public static void main(String[] args) {
	
		String line;
		while(true) { //.���� ������ ������ �Է¹ޱ�
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type a line of text that ends with a period: ");
		line = keyboard.nextLine();
		boolean endsWith = line.endsWith(".");
		if(endsWith) break;
		else System.out.println("Please type again(Line is not ends with period)");
		}
		
		line = line.toLowerCase(); //���� �ҹ��ڷ� ����
		
		int[] alphabet = new int[26];
		
		char[] array = line.toCharArray(); //���ڿ��� ������ �迭�� ����
		
		int ascii = 97;
		char ch = (char)ascii;
		
		for(int i = 0;i<array.length;i++) { //���ĺ��� ������ �°� alphabet�迭�� �� ����
			
			
			
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
		
		for(int i =0;i<alphabet.length;i++) {  //���ĺ��� ������ 0�̻��̸� �ش� ���ĺ��� � �ִ��� ���
		ch = (char) ascii;
			if(alphabet[i] != 0) System.out.println(ch + ": " + alphabet[i] + " time(s)");
		ascii = ascii + 1;
		}
		
	}

	
}
