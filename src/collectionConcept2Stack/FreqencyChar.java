package collectionConcept2Stack;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;
public class FreqencyChar {
	public static void main(String[]args) {
		String str="malayalam";
	LinkedHashMap<Character,Integer> mp=new LinkedHashMap<>();
	for(char ch:str.toCharArray()) {
		if(mp.containsKey(ch)) {
			mp.put(ch,mp.get(ch)+1);
			
		}
		else {
			mp.put(ch, 1);
		}
		System.out.println(mp);
	}
	
	
	

}
}
