import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

//hw5-5
public class histogram {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> histogram = new HashMap<Integer,Integer>(); //hashMap 만들기
		System.out.println("Please type int: ");
		Scanner keyboard = new Scanner(System.in);
		Integer input = 0;
		while(true) {
			input = keyboard.nextInt();
			if(input == -1) break;
			else if(histogram.containsKey(input)) { //해쉬맵에 이미 있는 키라면 value 하나 늘리기
				histogram.put(input,histogram.get(input) + 1);
			}
			else if(histogram.containsKey(input) == false) {//해쉬맵에 없는 키라면 추가하기
				histogram.put(input,1);
			}
		}

		for(Integer key:histogram.keySet()) { //루프돌며 해쉬맵 출력
			System.out.println("The number "+key+" occurs "+histogram.get(key)+" times");
		}
		
	}

}
