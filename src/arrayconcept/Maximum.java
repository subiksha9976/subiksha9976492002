package arrayconcept;

public class Maximum {
	public static void main(String[]args) {
		int arr[]= {20,40,45,78,99,30};
		int max=arr[4];
		for(int i=0;i<arr.length;i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
