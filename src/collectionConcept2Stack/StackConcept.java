package collectionConcept2Stack;
import java.util.Stack;
public class StackConcept {
public static void main(String[]args) {
	Stack<Integer>st=new Stack<>();
	st.push(25);
	st.push(17);
	st.push(22);
	st.push(3);
	st.push(88);
	System.out.println(st);
	st.pop();
	st.peek();
	System.out.println(st);
	System.out.println("Peek element:"+st.peek());
	System.out.println("Is Empty:"+st.empty());
	st.clear();
	System.out.println(st);
	System.out.println("Capacity:"+st.capacity());
}
}
