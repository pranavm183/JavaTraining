package collectionFramework;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> linkHashSet = new LinkedHashSet<>();
		linkHashSet.add("hello");
		linkHashSet.add("hello");//only one will take if both are same 
		linkHashSet.add(null);//null take as a value,not a string
		linkHashSet.add("World");
		
		System.out.println(linkHashSet);
	}

}
