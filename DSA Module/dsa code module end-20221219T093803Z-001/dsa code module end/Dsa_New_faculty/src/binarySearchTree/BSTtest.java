package binarySearchTree;

public class BSTtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeP bst=new BinarySearchTreeP();
		bst.insert(50);
		bst.insert(60);
		bst.insert(70);
		bst.insert(100);
		bst.insert(80);
		bst.insert(30);
		
		bst.preorder();
	}

}
