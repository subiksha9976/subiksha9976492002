package forloop;

public class Factor {
	public static void main(String[]args) {
		int num=14;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
				System.out.println(i);}
		}
		System.out.println("Factor count"+count);
	}

}
