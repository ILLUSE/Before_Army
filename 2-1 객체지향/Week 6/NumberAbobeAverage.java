//�µ��� ��պ��� ���� �� ���� ���� ���α׷��� �ۼ��մϴ�.
//Ű���忡�� 10���� �µ��� �а� �迭�� ��ġ�մϴ�. ��� �µ��� ����� ���� �µ��� ��պ��� ���Ҵ� �� ���� ī��Ʈ�ϰ� ǥ���մϴ�.
import java.util.Scanner;

public class NumberAbobeAverage { 

	public static void main(String[] args) { 
		double[] temperature = new double[10];
		double sum = 0.0;
		double average = 0.0;
		
		for(int i=0;i<10;i++) { //Ű����κ��� 10���� �µ��� �Է¹ް� ���� ���
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Type temperature: ");
			temperature[i] = keyboard.nextDouble();
			sum = sum + temperature[i];
		}
		
		average = sum / temperature.length; //��� ���
		
		int count = 0;
		for(int i = 0;i<10;i++) { //��պ��� ���� �µ��� ������ ����
			if(temperature[i] > average) count = count +1;
			
		}
		System.out.println("Average is " + average);  
		System.out.println("Number of days on which the temperature was above average is " + count);
		
	}

}
