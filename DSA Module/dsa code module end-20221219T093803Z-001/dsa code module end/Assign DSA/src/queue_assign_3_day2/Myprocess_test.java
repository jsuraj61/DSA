package queue_assign_3_day2;

import queue_assign_1_2_day2.Gene_CirQueue;

public class Myprocess_test {

	public static void main(String[] args) throws Exception {
		
		Gene_CirQueue<Myprocess> mp=new Gene_CirQueue<>();
		
		System.out.println("enqueue 5 process");
		mp.enqueue(new Myprocess(101, "Hemant", "Shinde"));
		mp.enqueue(new Myprocess(102, "Pritam", "Jhon"));
		mp.enqueue(new Myprocess(103, "Tushar", "Pawar"));
		mp.enqueue(new Myprocess(104, "Vipul", "Pawar"));
		mp.enqueue(new Myprocess(105, "Sagar", "Jacob"));
		
		System.out.println("dequeue 5 process");
		System.out.println("==================");
		System.out.println(mp.dequeue());
		System.out.println(mp.dequeue());
		System.out.println(mp.dequeue());
		System.out.println(mp.dequeue());
		System.out.println(mp.dequeue());
		
		
		
		System.out.println("enqueue 5 process again");
		System.out.println("==================");

		
		mp.enqueue(new Myprocess(101, "Hemant", "Shinde"));
		mp.enqueue(new Myprocess(102, "Pritam", "Jhon"));
		mp.enqueue(new Myprocess(103, "Tushar", "Pawar"));
		mp.enqueue(new Myprocess(104, "Vipul", "Pawar"));
		mp.enqueue(new Myprocess(105, "Sagar", "Jacob"));
		
		System.out.println("dequeue 5 process");
		System.out.println("==================");

		
		System.out.println(mp.dequeue());
		System.out.println(mp.dequeue());
		System.out.println(mp.dequeue());
		System.out.println(mp.dequeue());
		System.out.println(mp.dequeue());
	

	}

}
