package conditionalStatements;
import java.util.Scanner;
public class DemoModulo {
	public static void main(String[]args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=S.nextInt();
		if(num%3==0&&num%5==0) {
			System.out.println("fizz buzz");
		}
		else if(num%3==0) {
			System.out.println("fizz");
		}
		else if(num%5==0) {
			System.out.println(" buzz");
		}
		else {
			System.out.println("The Number is in valid");
		}
		
		
	}

}
