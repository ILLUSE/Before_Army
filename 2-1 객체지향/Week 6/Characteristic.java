import java.util.Scanner;
public class Characteristic {

	int rating = -1;   
	String description;
	
	public Characteristic(String explanation) { //description�� �־��� ���ڿ��� �����ϰ� rating�� 0���� �����ϴ� ������
		
		description = explanation;
		rating = 0;
		
	}
	
	private boolean isValid(int aRating) { //�־��� rating�� �����ҽ� true�� ����
		
		if(aRating > 0 && aRating < 11 ) return true;
		else return false;
		
	}
	
	public void setRating(int aRating) { //�־��� aRating�� �����ҽ� rating = aRating 
		if(isValid(aRating))  rating = aRating;
	}
	public void setRating() {  //Ű���忡�� rating�� �Է¹���
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the rating(1~10): ");
		rating = keyboard.nextInt();
	}
	
	public String getDescription() { //description�� ����
		return description;
	}
	
	public int getRating() { //rating�� ����
		return rating;
	}
	
	public double getCompatibility(Characteristic otherRating) { //compatibility�� ����
		return getCompatibilityMeasure(otherRating);
	}
	
	private double getCompatibilityMeasure(Characteristic otherRating) { //Compatibility Measure�� ��� �� ����
		double measure = 0;
		if (isMatch(otherRating)) {
			
			if(rating != 0 && otherRating.rating != 0) {
				measure = 1 - Math.pow((rating - otherRating.rating),2) / 81;
			}
			
			else if (rating == 0 || otherRating.rating == 0) measure = 0;
		}
		return Math.round(measure * 1000) / 1000.0; //�� 0.209 �� �ƴ϶� 0.21?
	}
	
	private boolean isMatch(Characteristic otherRating) { //description�� ��ġ�ϸ� true����
		if( description.equals(otherRating.description)) return true;
		else return false;
		
	}
	
	
	
}
