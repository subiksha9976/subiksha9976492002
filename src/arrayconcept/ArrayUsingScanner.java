package arrayconcept;

import java.util.Scanner;

public class ArrayUsingScanner {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int num[]=new int[5];
	num[0]=sc.nextInt();
	int i=0;
	for(;i<num.length;i++){
		num[i]=sc.nextInt();
		
	}
	for(;i<num.length;i++) {
		System.out.println(num[i]);
	}
}
}
