package linkedlist;

public class Node {
	
	    private int data;//valutype
	    private Node next;//reference type

	    public Node(int data) {
	        this.data = data;
	        this.next = null; //Not needed
	    }

	    public int getData() {
	        return data;
	    }

	    public void setData(int data) {
	        this.data = data;
	    }

	    public Node getNext() {
	        return next;
	    }

	    public void setNext(Node next) {
	        this.next = next;
	    }
	

}
