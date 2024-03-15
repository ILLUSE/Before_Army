
public class Circle implements Measurable{

	public double myRadius;
	
	
	public Circle(double radius) {
		myRadius = radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * myRadius;
	}
	
	public double getCircumference() {
		return getPerimeter();
	}
	
	public double getArea() {
		return myRadius * myRadius * Math.PI; 
	}
}
