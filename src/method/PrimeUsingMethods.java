package method;

public class PrimeUsingMethods {

	boolean subi(int num) {
		for(int i=2;i<=num/2;i++) {
		 if(num%i==0) {
			 return false;}}
			 return true;
		 }
		
	public static void main(String[]args) {
		PrimeUsingMethods p=new PrimeUsingMethods();
		System.out.println(p.subi(13)?"Prime":"not a Prime");
		System.out.println(p.subi(14)?"Prime":"not a Prime");
	}
}
