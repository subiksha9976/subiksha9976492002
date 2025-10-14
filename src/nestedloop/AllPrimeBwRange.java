package nestedloop;
import java.util.Scanner;
public class AllPrimeBwRange {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("starting no :");
		int start=sc.nextInt();
		System.out.println("ending no:");
		int end=sc.nextInt();
		int num=start;
		for(;num<=end;num++) {
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
		System.out.println(num);
		}
		}
}
}

