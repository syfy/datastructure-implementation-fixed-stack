
public class StackClientDemo {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("peek action:" + stack.peek());
		System.out.println("pop action:" + stack.pop());
		System.out.println("pop action:" + stack.pop());
		System.out.println("pop action:" + stack.pop());
		System.out.println("pop action:" + stack.pop()); // stack underflow

	}

}
