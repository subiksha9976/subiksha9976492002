package method;
import java.util.Scanner;
public class MethodIntroduction {
	void kavin() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a+b;
		System.out.println(res);
	}
public static void main(String[]args) {
	MethodIntroduction ob1=new MethodIntroduction();
	ob1.kavin();
}
}
