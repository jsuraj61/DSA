package queue_assign_1_2_day2;

public class Generic_queue_test {

	public static void main(String[] args) throws Exception {

		Generic_queue<Integer> genque=new Generic_queue<>();
		
		genque.enqueue(12);
		genque.enqueue(22);
		genque.enqueue(23);
		genque.enqueue(24);
		
		
//		Generic_queue<Integer> gen=new Generic_queue<>();
		System.out.println("after dequeue elements");
		
		genque.dequeue();
		genque.dequeue();
		genque.dequeue();
		
		System.out.println("again enqueue elements");
		genque.enqueue(27);
		genque.enqueue(26);
		
		System.out.println("completed!!");	
	}

}
