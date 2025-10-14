package whileloop;

public class MaximumNumber {
	public static void main(String[]args) {
		int num=2375;
		int max=num%10;
		while(num!=0) {
			int last=num%10;
			if(max<last) {
				max=last;
			}
			num=num/10;
		}
		System.out.println(max);	}

}
