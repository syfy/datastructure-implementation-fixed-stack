
public class Stack {
	public static int stackSize = 100;
	int[] stackContainer = new int[stackSize];
	int topIndex = -1;

	public void push(int element) {
		if (topIndex < stackSize) {
			topIndex++;
			stackContainer[topIndex] = element;
		}

	}

	public int pop() throws IllegalAccessException {
		int returnValue = -1;
		if (topIndex >= 0) {
			returnValue = stackContainer[topIndex];
			topIndex--;
		} else {
			throw new IllegalAccessException();
		}
		return returnValue;
	}

	public int peek() throws IllegalAccessException {
		if (topIndex < 0) {
			throw new IllegalAccessException();

		} else {
			return stackContainer[topIndex];

		}
	}
}
