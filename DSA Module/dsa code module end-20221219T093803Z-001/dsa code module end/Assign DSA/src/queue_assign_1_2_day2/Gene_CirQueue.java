package queue_assign_1_2_day2;

public class Gene_CirQueue<T> {
	private T [] arr;
	private int front, rear, count;
	public Gene_CirQueue() {
		arr = (T[]) new Object[6];
		front= rear=-1;
		count =0;
	}
	public Gene_CirQueue(int size) {
		arr = (T[]) new Object[size];
		front= rear=-1;
		count =0;
	}
	public void enqueue(T data) throws Exception {
		if(isFull() == false) {
		rear = (rear+1) % arr.length;
		arr[rear] = data;
		if(front==-1) {
			front=0;
		}
		count = count +1;
		System.out.println("Enqueue "+data);
		}
		else {
			throw new Exception("Q is full");
			// or throw exception
		}
	}
	public T dequeue() throws Exception {
		if(isEmpty() == false) {
			T temp = arr[front];
			front = (front + 1) % arr.length;
			count = count-1;
			return temp;
		}
		else {
			throw new Exception("Q is empty");
			
			// OR throw exception
		}
	}
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(count == arr.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
