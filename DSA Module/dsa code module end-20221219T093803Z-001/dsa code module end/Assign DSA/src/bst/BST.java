package bst;

import java.util.Stack;



public class BST {
	private Node root;
	
	public BST () {
		root=null;
	}

	public Node getRoot() {
		return root;
	}
	
	public boolean insert(int data) {
		Node newnode=new Node(data);
		
		if(root==null) {
			root=newnode;
			return true;
		}
		Node temp=root;
		
		while(true) {
			if(data==temp.getData()) {
				return false;
			}
			
		if(data < temp.getData()) {
			//insert to left
		if(temp.getLeft()==null) {
			temp.setLeft(newnode);
			return true;
		}
		temp=temp.getLeft();	
		}
		else {//insert to right
		
			if (temp.getRight()==null) {
				temp.setRight(newnode);
				return true;
			}
			temp=temp.getRight();
		}
		
//		return true;
		}
		
	}
	public void preorder() {
		Stack<Node> stk=new Stack<Node>();
		
		Node temp=root;
		while(temp!=null || !stk.isEmpty()) {
				while(temp!=null) {
					System.out.print(temp.getData()+" ");
					stk.push(temp);
					
					temp=temp.getLeft();
				}
			temp=stk.pop().getRight();
			
		}
		System.out.println();
	}
	
	public void preorder(Node root) {
		
		System.out.print(root.getData()+" ");
		preorder(root.getLeft());
		preorder(root.getRight());
	
	}
	
//	public void preorder(Node root) {
//		if(root==null) {
//			return;
//		}
//		System.out.print(root.getData()+" ");
//		preorder(root.getLeft());
//		preorder(root.getRight());
//	
//	}

}
