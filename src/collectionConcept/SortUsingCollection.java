package collectionConcept;
import java.util.ArrayList;
import java.util.Collections;
public class SortUsingCollection {
public static void main(String[]args) {
ArrayList<String> arr=new ArrayList<>();
arr.add("IT");
arr.add("CSE");
arr.add("ECE");
System.out.println("Before Sorting");
System.out.println(arr);
System.out.println("After Sorting");
Collections.sort(arr);
System.out.println(arr);
}
}
