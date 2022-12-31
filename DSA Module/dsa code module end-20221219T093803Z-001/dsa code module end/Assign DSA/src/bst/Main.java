package bst;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bs=new BST();
		
		bs.insert(10);
		bs.insert(20);
		bs.insert(30);
		bs.insert(40);
//		bs.preorder(bs.getRoot());
		bs.preorder();

	}

}
