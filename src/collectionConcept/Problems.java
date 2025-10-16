package collectionConcept;
import java.util.Scanner;
import java.util.ArrayList;
public class Problems {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> arr=new ArrayList<>();
	arr.add("ECE");
	arr.add("CSE");
	arr.add("IT");
	arr.add("EEE");
	int size=arr.size();
	if(arr.isEmpty()) {
		for(int i=0;i<4;i++) {
			System.out.println("Enter the String:");
			String st=sc.nextLine();
			arr.add(st);
		}
		System.out.println(arr);
	}
	else if(arr.size()%2==0) {
		for(int i=0;i<size;i++) {
			System.out.println("Enter the String:");
			String st=sc.nextLine();
			arr.add(st);
		}
		System.out.println(arr);
	}
	else {
		System.out.println(arr);
	}
}
}
