import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		
		int index = 0;
		
		
		
		Scanner keyboard = new Scanner(System.in); //������ �Է¹��� Ƚ�� ����
		System.out.println("How many numbers will you enter? ");
		index = keyboard.nextInt();
	
		int[] array = new int[index]; //������ ������ �迭�� %�� ������ �迭
		double[] array_percentage = new double[index]; 
		
		System.out.println("Enter " + index + " integers,on per line");
		
		for(int i = 0;i<index;i++) { //������ Ƚ����ŭ �Է¹ޱ�
			array[i] = keyboard.nextInt();
		}
		
		
		
		for(int i = 0;i<index;i++) { //% ����
			
			array_percentage[i] = (double) array[i] / sum(array) * 100;
			array_percentage[i] = Math.round(array_percentage[i] *10000) / 10000.0; 
		}
		
		System.out.println("The sum is " + sum(array));
		System.out.println("The numbers are:");
		
		for(int i=0;i<index;i++) { 
			System.out.println(array[i] + ",which is " + array_percentage[i] + "% of the sum");
		}
		
		
	}

	private static int sum(int[] array) { //���� ���ϱ����� �޼ҵ�
		
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum = sum + array[i];
		}
		return sum;
	}

}
