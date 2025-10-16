package collectionConcept;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListConcept {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> arr=new ArrayList<>();
	for (int i=0;i<5;i++) {
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		arr.add(str);
	}
	System.out.println(arr);
}
}
