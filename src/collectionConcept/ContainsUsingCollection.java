package collectionConcept;
import java.util.ArrayList;
import java.util.Collections;
public class ContainsUsingCollection {
public static void main(String[]args) {
	ArrayList<String> arr=new ArrayList<>();
	arr.add("IT");
	arr.add("CSE");
	arr.add("ECE");
	System.out.println(arr);
	System.out.println(arr.contains("IT"));
}
}
