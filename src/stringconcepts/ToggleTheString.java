package stringconcepts;

public class ToggleTheString {
public static void main(String[]args) {
	String st="SuBiKsHa AhSkIbUs";
	String res="";
	for(int i=0;i<st.length();i++) {
		char ch=st.charAt(i);
		if(ch>='a'&&ch<='z') {
			ch=(char)(ch-32);
		}
		else if(ch>='A'&&ch<='Z') {
			ch=(char)(ch+32);
		}
		res=res+ch;
	}
	System.out.println(res);
}
}
