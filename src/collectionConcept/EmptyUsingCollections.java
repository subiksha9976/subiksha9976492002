package collectionConcept;
import java.util.ArrayList;
import java.util.Collections;
public class EmptyUsingCollections {
public static void main(String[]args) {
	ArrayList<String> arr=new ArrayList<>();
	arr.add("IT");
	arr.add("CSE");
	arr.add("ECE");
	System.out.println(arr.isEmpty());
	arr.clear();
	System.out.println(arr);
}
}
