package basics;
import java.util.Scanner;
public class Variables {
    public static void main(String[]args) {
    	Scanner Sc=new Scanner(System.in);
    	System.out.println("Enter the input");
    	int num=Sc.nextInt();
    	System.out.println("value"+num);
    	char ch=Sc.next().charAt(0);
    	System.out.println(ch);
    }
}


