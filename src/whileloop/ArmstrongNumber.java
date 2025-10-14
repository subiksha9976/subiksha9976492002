package whileloop;

public class ArmstrongNumber {
	public static void main(String[]args) {
		int  number=153;
		int rem=0;
		int sum=0;
		int temp=number;
		while(temp>0) {
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(sum==number) {
			System.out.println(number+" is an Armstrong Number");
		}
		else {
			System.out.println(number+"is not an Armstrong Number");
		}
	}

}
