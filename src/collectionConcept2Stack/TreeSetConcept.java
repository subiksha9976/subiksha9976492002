package collectionConcept2Stack;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetConcept {
	public static void main(String[]args) {
		Set<String> st=new TreeSet<>();
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
