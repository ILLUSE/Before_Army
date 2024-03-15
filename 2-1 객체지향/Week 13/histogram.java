import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

//hw5-5
public class histogram {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> histogram = new HashMap<Integer,Integer>(); //hashMap �����
		System.out.println("Please type int: ");
		Scanner keyboard = new Scanner(System.in);
		Integer input = 0;
		while(true) {
			input = keyboard.nextInt();
			if(input == -1) break;
			else if(histogram.containsKey(input)) { //�ؽ��ʿ� �̹� �ִ� Ű��� value �ϳ� �ø���
				histogram.put(input,histogram.get(input) + 1);
			}
			else if(histogram.containsKey(input) == false) {//�ؽ��ʿ� ���� Ű��� �߰��ϱ�
				histogram.put(input,1);
			}
		}

		for(Integer key:histogram.keySet()) { //�������� �ؽ��� ���
			System.out.println("The number "+key+" occurs "+histogram.get(key)+" times");
		}
		
	}

}
