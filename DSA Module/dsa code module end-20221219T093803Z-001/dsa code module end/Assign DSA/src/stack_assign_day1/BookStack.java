package stack_assign_day1;

public class BookStack<T> {
	private T[] arr; // create generic array
	private int top, size;

	public BookStack() {
		size = 5; // by default stack of size 5 will be created
		top = -1;
		arr = (T[]) new Object[size]; // Warning of type cast can be ignored

	}

	public BookStack(int size) {
		this.size = size; // create stack of user specified size
		top = -1;
		arr = (T[]) new Object[size];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == (size - 1); // check full based on size ( ONLY for array implementation)
	}

	public boolean push(T data) {
		if (isFull()) {
			return false;
		}

		arr[++top] = data;
		return true;
	}

	public T pop() {
		if (isEmpty()) {
			return null;
		}

		return arr[top--];
	}

	public void push(String string, int i) {
		// TODO Auto-generated method stub

	}

}
