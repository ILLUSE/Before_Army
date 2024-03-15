/*
  //2022-3-16 사용자로부터 3개의 문장을 받고 3개의 문장중 사전적으로 2번쨰에 위치한
  //문장 출력 
   
import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		String string1;
		String string2;
		String string3;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please type sentence 1:");
		string1 = keyboard.nextLine();
		
		System.out.println("Please type sentence 2:");
		string2 = keyboard.nextLine();

		System.out.println("Please type sentence 3:");
		string3 = keyboard.nextLine();
		
		String string_head = string1;
		String string_body = string2;
		String string_foot = string3;
		
		if(string_head.compareTo(string2) < 0) //제일 사전에서 앞서있는 문장 찾기
		{
			
		}
		else {
			string_head = string2;
		}
		
		if(string_head.compareTo(string3) < 0) {
			
		}
		else {
			string_head = string3;
		}
		
		if(string_head == string1) {             //제일 앞서있는 문장 찾았으니,나머지 2개중 더 앞서있는 문장 찾기
			if(string2.compareTo(string3) < 0) {
				string_body = string2;
				string_foot = string3;
			}
			else {
				string_body = string3;
				string_foot = string2;
			}
		}
		
		if(string_head == string2) {
			if(string1.compareTo(string3) < 0) {
				string_body = string1;
				string_foot = string3;
			}
			else {
				string_body = string3;
				string_foot = string1;
			}
		}
		
		if(string_head == string3) {
			if(string1.compareTo(string2) < 0) {
				string_body = string1;
				string_foot = string2;
			}
			else {
				string_body = string2;
				string_foot = string1;
			}
		}
		
		System.out.println("Sentence " + string_body + " is at second");
	}

}
*/

/*
 * 한 문장을 입력받고 그 문장의 마지막 인덱스가 ?,짝수면 yes
 * ?,홀수면 no
 * !면 Wow.
 * 나머진 you always say "문장"
 * 
import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		String input_string;
		
		Scanner keyboard = new Scanner(System.in);
				
		System.out.println("Please type string: ");
		input_string = keyboard.nextLine();
		
		int length_string = input_string.length();//짝홀 여부
		int last_string_question = input_string.lastIndexOf("?");
		int last_string_exclamation = input_string.lastIndexOf("!");
		
		//?로 끝나는지, 짝수개인지
		if(last_string_question == (length_string-1) && (length_string % 2) == 0 ) {
			System.out.println("Yes");
	}
		else if(last_string_question == (length_string-1) && (length_string % 2) == 1 ) {
			System.out.println("No");
	}
		else if(last_string_exclamation == (length_string-1)) {
			System.out.println("Wow.");
		}
		else System.out.println("You always say \"" + input_string + "\"");
	
	}
}
*/

/*
import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
	
		int degress;
		String F_or_C;
		
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Please type degress: ");
		degress = keyboard.nextInt();
		
		System.out.println("Please type F or C: ");
		F_or_C = keyboard.next();
		
		F_or_C = F_or_C.toUpperCase(); //F_or_C를 이용해 섭씨 화씨 구분
		
		String F = "F"; 
		String C = "C";
		
		//System.out.println(F_or_C); Testing value of F_or_C
		
		if(F_or_C.equals(F) && F_or_C.equals(C)) {  //만약 F_or_C가 F나 C가 아니라면 경고문과 프로그램 종료
			System.out.println("Please type F or C!");
			System.exit(0);
		}
		
		float degress_C = (degress - 32) / 9; //calculate degress
		float degress_F = (degress / 5) + 32;
		
		if(F_or_C.equals(F)) { //if F_or_C = F,print F -> C
			System.out.println(degress + F_or_C + " is " + degress_C +"C");
		}
		else if(F_or_C.equals(C)) { //if F_or_C = C,print C -> F
			System.out.println(degress + F_or_C + " is " + degress_F +"F");
		}
		
	}
	}

*/

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
	
		String str;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please type mm/dd/yyyy: ");
		str = keyboard.nextLine();
		
		String parts[] = str.split("/"); //split strings and put int to each variables
		
		int month = Integer.parseInt(parts[0]);
		int date = Integer.parseInt(parts[1]);
		int year = Integer.parseInt(parts[2]);
		
		System.out.println("Date is " + month + " / " + date + " / " + year); //print date
		
		boolean leap_year; //check year variable is leap or not
		if( year % 400 == 0) 
			leap_year = true;
		else if(year % 100 == 0)
			leap_year = false;
		else if(year % 4 == 0)
			leap_year = true;
		else leap_year = false;
		
				
		
		//1.Set up month`s range
		int month_range = 12;
		if(month < 1 || month > month_range) {
			System.out.println("The date is not valid.");
			System.out.println("The month should be between 1 and 12.");
			System.exit(0);
		}
		
		//2.Set up date`s range according to conditions
		int date_range = 31;
		
		//2-1.September, April, June, and November each have 30 days
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			date_range = 30;
		}
		
		//2-2.Set up Febuary`s range 
		if(month == 2 && leap_year == true) {
			date_range = 29;
			
		}
		else if(month == 2 && leap_year == false) {
			date_range = 28;
			
		}
		
		//print out sentences that are appropriate for different situations
		if(date < 1 || date > date_range) {
			System.out.println("The date is not valid.");
			
			if(date_range == 31 && date > date_range) {
				System.out.println("The ordinary month`s date should be between 1 and " + date_range);
				System.exit(0);
			}
			else if(date_range == 30 && date > date_range) {
				System.out.println("The September, April, June, and November`s date should be between 1 and " + date_range);
				System.exit(0);
			}
			else if(date_range == 28 && date > date_range) {
				System.out.println("The Febuary`s date should be between 1 and " + date_range);
				System.exit(0);
			}
			else if(date_range == 29 && date > date_range) {
				System.out.println("The leap year and Febuary`s date should be between 1 and " + date_range);
				System.exit(0);
			}
		}
		
		//3.Set up year`s range
			if(year < 1) {
				System.out.println("The year is not valid.");
				System.out.println("The month should be bigger than 1.");
				System.exit(0);
			}
			
		//All clear,date is valid
		System.out.println("The date is valid.");
		
	}
	
}
	

	

	