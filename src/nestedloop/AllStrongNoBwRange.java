package nestedloop;

public class AllStrongNoBwRange {
public static void main(String[]args) {
	for(int num=100;num<=1000000 ;num++) {
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
		System.out.println(num);
	}
}
}
}

