package queue_assign_1_2_day2;
//Q1. Create generic class for Queue

public class Generic_queue<T> {

	private T[] arr;
	private int front = -1;
	private int rear = -1, size;

	public Generic_queue() {
		front = -1;
		rear = -1;
		arr = (T[]) new Object[6];
	}

	public Generic_queue(int size) {
		this.size = size;
		front = -1;
		rear = -1;
		arr = (T[]) new Object[size];
	}

	public void enqueue(T data) throws Exception {
		if (isFull() == false) {
			rear = rear + 1;
			arr[rear] = data;
			// check front == -1
			if (front == -1) {
				front = 0;
			}
			System.out.println("Enqueue" + data + " front " + front + " rear" + rear);
		} else {
			// sysout q is full
			throw new Exception("Queue is Full!!");
			// OR throw exception
		}
	}

	public T dequeue() throws Exception {
		if (isEmpty() == false) {
			T temp = arr[front];
			front = front + 1;
			System.out.println("Dequeue" + temp + " front " + front + " rear" + rear);
			return temp;
		} else {
			// q is empty
			throw new Exception("q is empty");// System.out.println("q is empty");

			// OR throw an exception
		}
	}

	public boolean isFull() {
		if (rear == (arr.length - 1)) {
			// q is full
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if ((front == -1) || (front > rear)) {
			return true;
		} else
			return false;
	}

}
