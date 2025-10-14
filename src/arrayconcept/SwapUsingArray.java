package arrayconcept;

public class SwapUsingArray {
	public static void main(String[]args) {
		int a[]= {11,34,29,54,86};
		int temp=a[1];
		a[1]=a[2];
		a[2]=temp;
		for (int i=0;i<a.length;i++) {
			System.out.println(i+":"+a[i]);
			}
		System.out.println("For each loop");
		for(int n:a) {
		System.out.println(n);	
		}
		}

}
