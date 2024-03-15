import java.util.Scanner;
public class Characteristic {

	int rating = -1;   
	String description;
	
	public Characteristic(String explanation) { //description을 주어진 문자열로 설정하고 rating을 0으로 설정하는 생성자
		
		description = explanation;
		rating = 0;
		
	}
	
	private boolean isValid(int aRating) { //주어진 rating이 적합할시 true를 리턴
		
		if(aRating > 0 && aRating < 11 ) return true;
		else return false;
		
	}
	
	public void setRating(int aRating) { //주어진 aRating이 적합할시 rating = aRating 
		if(isValid(aRating))  rating = aRating;
	}
	public void setRating() {  //키보드에서 rating을 입력받음
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the rating(1~10): ");
		rating = keyboard.nextInt();
	}
	
	public String getDescription() { //description을 리턴
		return description;
	}
	
	public int getRating() { //rating을 리턴
		return rating;
	}
	
	public double getCompatibility(Characteristic otherRating) { //compatibility를 리턴
		return getCompatibilityMeasure(otherRating);
	}
	
	private double getCompatibilityMeasure(Characteristic otherRating) { //Compatibility Measure를 계산 후 리턴
		double measure = 0;
		if (isMatch(otherRating)) {
			
			if(rating != 0 && otherRating.rating != 0) {
				measure = 1 - Math.pow((rating - otherRating.rating),2) / 81;
			}
			
			else if (rating == 0 || otherRating.rating == 0) measure = 0;
		}
		return Math.round(measure * 1000) / 1000.0; //왜 0.209 가 아니라 0.21?
	}
	
	private boolean isMatch(Characteristic otherRating) { //description이 일치하면 true리턴
		if( description.equals(otherRating.description)) return true;
		else return false;
		
	}
	
	
	
}
