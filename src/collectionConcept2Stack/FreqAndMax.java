package collectionConcept2Stack;
import java.util.LinkedHashMap;
public class FreqAndMax {
	static LinkedHashMap<Character,Integer>freqChar(String st){
		LinkedHashMap<Character,Integer> mp=new LinkedHashMap<>();
		for(char ch:st.toCharArray()) {
			if(mp.containsKey(ch)) {
				mp.put(ch,mp.get(ch)+1);
				
			}
			else {
				mp.put(ch, 1);
			}
		}
		return mp;
		}
	static char maxChar(String st) {
		LinkedHashMap<Character,Integer>op=freqChar(st);
		int max=0;
		char c='\0';
		for(char ch:op.keySet()) {
			int cVal=op.get(ch);
			if(cVal>max) {
				max=cVal;
				c=ch;
			}
		}
		return c;
	}
	public static void main(String[]args) {
		String st="malayalam";
		char op=maxChar(st);
		System.out.println(op);
		
	}
}
