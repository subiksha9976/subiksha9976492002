package nestedloop;

public class StrongNumber {
public static void main(String[]args) {
	int num=145;
	int temp=num;
	int sum=0;
	while(temp!=0) {
		int last=temp%10;
		int fact=1;
		for (int i=1;i<=last;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		temp=temp/10;
	}
	if(num==sum) {
		System.out.println(num+ "  is a Strong Number.");
	}
	else {
		System.out.println(num +" is not a Strong Number");
	}
}
}

