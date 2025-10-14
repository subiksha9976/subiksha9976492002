package arrayconcept;

public class ArraySortedOrNot {
public static void main(String[]args) {
	int arr[]= {30,56,78,98,1};
	for(int i=0;i<arr.length-1;i++) {
		if(arr[0]>arr[i+1]) {
			System.out.println("The array is  UnSorted");
			return;
		}
	}
			System.out.println("The array is Sortrd");
		}
	  }


