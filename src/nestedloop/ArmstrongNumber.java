package nestedloop;

public class ArmstrongNumber {
	public static void main(String[]args) {
    int num=371;
	int temp=num;
	int len=0;
	while(num!=0) {
		len++;
		num/=10;}
	num=temp;
	int sum=0;
	while(num!=0) {
		int last=num%10;
		int pow=1;
		for(int i=1;i<=len;i++) {
			pow=pow*last;
		}
		sum=sum+pow;
		num=num/10;}
		if(sum==temp) {
			System.out.println(temp+"is an Armstrong Number.");
		}
		else {
			System.out.println(temp+"is not an Armstrong Number.");
		}
	}
}


