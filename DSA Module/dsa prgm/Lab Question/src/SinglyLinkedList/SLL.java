package SinglyLinkedList;

import java.util.Stack;

public class SLL {

	private Node head;

	public SLL() {
		head = null;
	}

//	Q1.insert by position

	public boolean insertbyPosition(int data, int position) {

		if (head == null || position <= 0)
			return false;

		Node newNode = new Node(data);
		Node prev = head;

		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null)
				return false;
		}
//			
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);

		return true;
	}

//	Q2.insert by data
	public boolean insertbydata(int data) {
		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		if (head == null) {
			head = newNode;
			return true;
		}

		// locate last node
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}

		// make newnode next of last node
		last.setNext(newNode);
		return true;
	}

//	3
	public void display() {

		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.getData() + " ");
			currNode = currNode.getNext();
		}

		System.out.println();
	}

//	 Q3.delete by Position
	public boolean deleteByPosition(int pos) {
		Node prev = head;
		if (head == null || pos <= 0) {
			return false;
		}
		// Node newNode=new Node();
		if(pos==1) {
			head=head.getNext();
			return true;
		}

		for (int i = 1; i < pos - 1; i++) {

			prev = prev.getNext();
			if (prev == null)
				return false;
		}
		Node del = prev.getNext();
		prev.setNext(del.getNext());

		return true;

	}

	// search element
	public void search(int ele) {

		Node temp = head;
		while (temp != null) {
			if (ele == temp.getData()) {
				System.out.println(temp.getData() + " ");

			}
			temp = temp.getNext();

		}
		System.out.println("not found");

	}

	public void displayRev() {
		Stack<Node> stk = new Stack<>();

		Node temp = head;
		while (temp != null) {
			stk.push(temp);
			temp = temp.getNext();
		}

		while (!stk.isEmpty()) {
			System.out.print(stk.pop().getData() + " ");

		}
		System.out.println();
	}

	public void middleEle() {
		Node t1 = head;
		Node t2 = head;
		while (t2.getNext().getNext() != null) {
			t2 = t2.getNext().getNext();
			t1 = t1.getNext();
		}

		System.out.print("Middle Ele " + t1.getData());

	}
}
