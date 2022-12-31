package copycode;

public class MainPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bs=new BST();
		bs.insert(20);
		bs.insert(30);
		bs.insert(40);
		bs.insert(50);
		bs.insert(60);
		bs.insert(55);
		bs.insert(70);
		bs.preorderRec(bs.getRoot());
		System.out.println();
		bs.preOrder();
	}

}
