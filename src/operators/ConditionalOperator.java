package operators;

public class ConditionalOperator {
	public static void main(String[]args)
	{
		int mark=-1;
		String op=(mark>=0&&mark<=100)?((mark>49)?"Pass":"Fail"):"Invalid mark";
		System.out.println(op);
	}

}
