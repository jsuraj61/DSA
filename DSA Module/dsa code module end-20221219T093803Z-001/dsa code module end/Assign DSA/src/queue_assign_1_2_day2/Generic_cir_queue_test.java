package queue_assign_1_2_day2;

public class Generic_cir_queue_test {

	public static void main(String[] args) throws Exception {

		Gene_CirQueue<Integer> gen=new Gene_CirQueue<>();
//		Gene_CirQueue<Integer> gen= new Gene_CirQueue<>();
		
		gen.enqueue(12);
		gen.enqueue(22);
		gen.enqueue(23);
		gen.enqueue(24);
		
		
		System.out.println("after dequeue elements");
		
		gen.dequeue();
		gen.dequeue();
		gen.dequeue();
		
		System.out.println("again enqueue elements");
		gen.enqueue(27);
		gen.enqueue(26);
		
		System.out.println("completed!!");	
	}

}
