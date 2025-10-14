package arrayconcept;

public class SecondMaximum {
public static void main(String[]args) {
	int arr[]= {110,98,111,400};
    int firstmax=arr[0];
    int secmax=arr[1];
    for (int i=0;i<arr.length;i++){
    	if(firstmax<arr[i]) {
    		secmax=firstmax;
    		firstmax=arr[i];
    		}
    	}
    System.out.println("First Maximum value:"+firstmax);
    System.out.println("Second Maximum value:"+secmax);
    }
}


