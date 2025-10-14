package twoDarrayconcept;
import java.util.Scanner;
public class Scanner2D {
public static void main(String[]args) {
	int arr[][]=new int[3][3];
	Scanner a=new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter the data:");
			arr[i][j]=a.nextInt();
		}
	
	}
	System.out.println();
}
}
