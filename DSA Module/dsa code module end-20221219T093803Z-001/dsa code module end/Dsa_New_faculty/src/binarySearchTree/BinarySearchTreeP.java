package binarySearchTree;

import java.util.Stack;

public class BinarySearchTreeP {
	private Node root;
	
	public BinarySearchTreeP() {
		this.root=null;
	}
	
	public boolean insert(int data) {
		
		Node newNode=new Node(data);
		
		if (newNode==null) {
			return false;
		}
		
		if (root==null) {
			root=newNode;
			return true;
		}
		
		Node temp=root;
		while(true) {
		
		if(data==temp.getData()) {
			return false;
		}
		if(data<temp.getData()) {
			//insert to left but check left of temp must be null
			if(temp.getLeft()==null) {
				temp.setLeft(newNode);
				return true;
			}
			temp=temp.getLeft();	
		}
		else {//insert to right
			if(temp.getRight()==null) {
				temp.setRight(newNode);
				return true;
			}
			temp=temp.getRight();
		}
		
		
		}		
	}
		
	public Node getRoot() {
		return root;
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
}
