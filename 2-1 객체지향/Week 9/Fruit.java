
public class Fruit implements Comparable{
private String fruitName;

public Fruit() {
	fruitName = "";
}

public Fruit(String name) {
	fruitName = name;
}

public void setName(String name) {
	fruitName = name;
}
public String getName() {
	return fruitName;
}

public int compareTo(Object o) {
	if((o != null) && (o instanceof Fruit)) {
		Fruit otherFruit = (Fruit) o;
		return (fruitName.compareTo(otherFruit.fruitName));
	}
	return -1;
}

/*
 * 
 *compareTo를 길이로 해보기

*/
}
