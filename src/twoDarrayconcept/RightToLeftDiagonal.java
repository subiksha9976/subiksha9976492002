package twoDarrayconcept;

public class RightToLeftDiagonal {
public static void main(String[]args) {
	int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if((i+j)==arr.length-1) {
				System.out.println(arr[i][j]+" ");
			}
			else {
				System.out.println(" ");
			}
		}
	}System.out.println();
}
}
