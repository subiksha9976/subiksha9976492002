package collectionConcept2Stack;
import java.util.Queue;
import java.util.PriorityQueue;
public class PrioriteeQueue {
public static void main(String[]args) {
		Queue<Character> q=new PriorityQueue<>();

		PriorityQueue<Character> pq=new PriorityQueue<>((a,b) -> b-a);//manual comparation

		q.add('x');

		q.add('1');

		q.offer('c');

		q.add('6');

		q.add('h');

		pq.addAll(q);

		System.out.println(q);

		System.out.println(q.poll());

		System.out.println(q.poll());

		System.out.println(pq);

		System.out.println(pq.poll());

		System.out.println(pq.poll());

	}
}


