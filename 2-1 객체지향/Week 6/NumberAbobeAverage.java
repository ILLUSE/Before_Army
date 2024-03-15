//온도가 평균보다 높은 일 수를 세는 프로그램을 작성합니다.
//키보드에서 10개의 온도를 읽고 배열에 배치합니다. 평균 온도를 계산한 다음 온도가 평균보다 높았던 일 수를 카운트하고 표시합니다.
import java.util.Scanner;

public class NumberAbobeAverage { 

	public static void main(String[] args) { 
		double[] temperature = new double[10];
		double sum = 0.0;
		double average = 0.0;
		
		for(int i=0;i<10;i++) { //키보드로부터 10개의 온도를 입력받고 합을 계산
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Type temperature: ");
			temperature[i] = keyboard.nextDouble();
			sum = sum + temperature[i];
		}
		
		average = sum / temperature.length; //평균 계산
		
		int count = 0;
		for(int i = 0;i<10;i++) { //평균보다 높은 온도의 갯수를 구함
			if(temperature[i] > average) count = count +1;
			
		}
		System.out.println("Average is " + average);  
		System.out.println("Number of days on which the temperature was above average is " + count);
		
	}

}
