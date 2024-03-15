import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		
		int index = 0;
		
		
		
		Scanner keyboard = new Scanner(System.in); //정수를 입력받을 횟수 설정
		System.out.println("How many numbers will you enter? ");
		index = keyboard.nextInt();
	
		int[] array = new int[index]; //정수를 저장할 배열과 %를 저장할 배열
		double[] array_percentage = new double[index]; 
		
		System.out.println("Enter " + index + " integers,on per line");
		
		for(int i = 0;i<index;i++) { //설정한 횟수만큼 입력받기
			array[i] = keyboard.nextInt();
		}
		
		
		
		for(int i = 0;i<index;i++) { //% 설정
			
			array_percentage[i] = (double) array[i] / sum(array) * 100;
			array_percentage[i] = Math.round(array_percentage[i] *10000) / 10000.0; 
		}
		
		System.out.println("The sum is " + sum(array));
		System.out.println("The numbers are:");
		
		for(int i=0;i<index;i++) { 
			System.out.println(array[i] + ",which is " + array_percentage[i] + "% of the sum");
		}
		
		
	}

	private static int sum(int[] array) { //합을 구하기위한 메소드
		
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum = sum + array[i];
		}
		return sum;
	}

}
