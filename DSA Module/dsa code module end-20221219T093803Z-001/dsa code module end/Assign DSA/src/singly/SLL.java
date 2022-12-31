package singly;

import java.util.Iterator;
import java.util.Stack;

public class SLL {

	private Node head;

	public SLL() {
		head = null;

	}

	public boolean insert(int data) {
		Node newnode = new Node(data);

		if (head == null) {
			head = newnode;
			return true;
		}
		return true;
	}

	public boolean insertatbegin(int data) {
		Node newnode = new Node(data);

		newnode.setNext(head);
		head = newnode;
		return true;
	}

	public boolean insertatlast(int data) {
		Node newnode = new Node(data);

		if (head == null) {
			head = newnode;
			return true;
		}

		Node temp = head;
		// locate last node
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(newnode);

		return true;
	}

	public boolean insertbyposition(int data, int position) {
		Node newnode = new Node(data);

		if (head == null && position <= 0)
			return false;

		if (position == 1) {
			head = newnode;
			return true;
		}
//		pos>1
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}
		newnode.setNext(prev.getNext());
		prev.setNext(newnode);
		return true;
	}

	public void display() {

		Node currNode = head;

		while (currNode != null) {
			System.out.print(currNode.getData() + " ");
			currNode = currNode.getNext();
		}
	}

	public boolean deletebyposition(int position) {
		if (head == null && position <= 0) {
			return false;
		}

		Node prev = head;

		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
		}

		prev.setNext(prev.getNext().getNext());

		return true;
	}

	public boolean deletebyvalue(int data) {
		if (head == null)
			return false;

		Node prev = head, del = head;

		if (del.getData() == data) {
			head = head.getNext();
			return true;
		}
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
		}

		prev.setNext(del.getNext());

		return true;

	}

	public void reverse() {
		Stack<Node> stk = new Stack<Node>();

		Node temp = head;

		while (temp != null || !stk.isEmpty()) {
			while (temp != null) {
				stk.push(temp);
				temp = temp.getNext();
			}

			System.out.print(stk.pop().getData() + " ");
		}
	}

	int count = 0;

	public boolean findmiddle() {

		Node temp = head;

		while (temp != null) {
			temp = temp.getNext();
			count++;
		}
		temp = head;

		for (int i = 1; i < (count / 2); i++) {
			temp = temp.getNext();

		}

		System.out.println(temp.getData() + " ");

		return true;
	}

	public boolean sortlinked() {
		Node temp = head;

		while (temp != null) {
			count++;
			temp = temp.getNext();
			
		}
		int arr[] = new int[count];
		temp=head;
		for (int i = 0; i < count; i++) {
			arr[i] = temp.getData();
			temp = temp.getNext();
		}
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (arr[j] > arr[i]) {
					int tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}
			}
			
		}
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i]+ " ");
		}

		return true;
	}
}
