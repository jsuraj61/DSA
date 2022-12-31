package copycode;

import java.util.Stack;

public class BST {

	private Node root;

	public BST() {
		this.root = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return true;
		}

		Node temp = root;

		while (true) {
			if (data == temp.getData()) {
				return false;
			}
			if (data < temp.getData()) {

				// insert to left
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			} else {
				// insert to right
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}

		}
	}

	public Node getRoot() {
		return root;
	}

	public void preOrder() {
		Stack<Node> stack = new Stack<>();
		Node temp = root;

		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				stack.push(temp);
				temp = temp.getLeft();
			}

//	            temp = stack.pop().getRight();
			temp = stack.pop();
			temp = temp.getRight();
		}
		System.out.println();

	}

	public void preorderRec(Node root) {
		// Root Left Right
		if (root == null) {
			return;
		}

		System.out.print(root.getData() + " ");
		preorderRec(root.getLeft());
		preorderRec(root.getRight());

	}
}
