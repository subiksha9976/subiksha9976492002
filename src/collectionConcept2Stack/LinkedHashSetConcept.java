package collectionConcept2Stack;
import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHashSetConcept {
	public static void main(String[]args) {
		Set<String> st=new LinkedHashSet<>();
		st.add("Harshini");
		st.add("Subi");
		st.add("Suthi");
		st.add("Rithan");
		st.add("Oovi");
		st.add("Subi");
		System.out.println(st);
		System.out.println("Size:"+st.size());
		System.out.println("Contains:"+st.contains("Subi"));
		System.out.println("Empty:"+st.isEmpty());
		st.clear();
		System.out.println(st);
	}
	
}
