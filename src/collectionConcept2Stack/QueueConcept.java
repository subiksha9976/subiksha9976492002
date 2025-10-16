package collectionConcept2Stack;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
public class QueueConcept {
public static void main(String[]args) {
	Deque<String> q=new LinkedList<>();
	q.offer("Subi");
	q.add("Rithan");
	q.add("Oovi");
	q.add("kavi");
	q.add("Suthi");
	q.add("Pradeep");
	q.add("Logi");
	System.err.println(q);
	q.offerFirst("Raja");
	System.out.println(q);
	System.out.println("poll element:"+q.poll());
	System.out.println("peek element:"+q.peek());
	System.out.println("size:"+q.size());
	System.out.println("Empty:"+q.isEmpty());
	q.clear();
	System.out.println();
}
}
