package collectionConcept1LinkedList;
import java.util.LinkedList;
import java.util.Collections;
public class LinkedListConcept {
public static void main(String[]args) {
	LinkedList<Integer> ll=new LinkedList<>();
	ll.add(2);
	ll.add(3);
	ll.add(4);
	ll.add(5);
	ll.add(2);
	ll.addFirst(0);
	ll.addLast(10);
	ll.add(1,1);
	System.out.println(ll);
	ll.remove();
	System.out.println(ll);
	ll.removeLast();
	System.out.println(ll);
	ll.remove(2);
	System.out.println(ll);
	ll.removeFirstOccurrence(2);
	System.out.println(ll);
	ll.removeLastOccurrence(2);
	System.out.println(ll);
	System.out.println("size:"+ll.size());
	System.out.println("is empty:"+ll.isEmpty());
	System.out.println("index of:"+ll.indexOf(5));
	ll.clear();
	System.out.println(ll);
	
	
}
}
