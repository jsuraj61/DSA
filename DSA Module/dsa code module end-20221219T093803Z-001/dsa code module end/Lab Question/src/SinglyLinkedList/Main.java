package SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL ref=new SLL();
		
		ref.insertbydata(10);
		ref.display();
		ref.insertbydata(20);
		ref.display();
		ref.insertbydata(30);
		ref.display();
		ref.insertbydata(40);
		ref.display();
		ref.insertbydata(50);
		ref.display();
//		System.out.println(ref.insertbyPosition(60, 3));
//		ref.insertbyPosition(60, 4);
//		ref.insertbyPosition(70, 5);
		ref.display();
		System.out.println("++++++");
//		System.out.println(ref.deleteByPosition(2));
//		ref.display();
//		ref.search(100);
//		ref.displayRev();
		ref.middleEle();
	}

}
