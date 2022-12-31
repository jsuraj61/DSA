package doubly;

public class DLL {
	
	private Node head;
	
	public DLL() {
		head=null;
	}

	public boolean insert(int data) {
		Node newnode =new Node(data);
		
		if(head==null) {
			head=newnode;
			return true;
		}
		
		if(newnode==null)
			return false;
		
//		loacte last node
		
		Node last=head;
		
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		last.setNext(newnode);
		newnode.setPrev(last);
		
		
		return true;
	}

	public boolean insertbyposition(int data,int position) {
		Node newnode=new Node(data);
		if(head==null && position <=0)
			return false;
		
		if(position==1) {
			newnode.setNext(head);
			head.setPrev(newnode);
			head=newnode;
			return true;
		}
//		pos>1
		Node temp=head;
		
		for(int i=1 ; i<position-1;i++) {
			temp=temp.getNext();
		}
		
		newnode.setPrev(temp);
		if (temp.getNext()!=null) {
			newnode.setNext(temp.getNext());
			temp.getNext().setPrev(newnode);
		}
		temp.setNext(newnode);
		
		return true;
	}

	public boolean deletebyposition(int position) {
		if (head==null && position <=0) {
			return false;
		}
		 if (position ==1) {
			head=head.getNext();
			return true;
		}
		
//		 pos>1
		 
		 Node del=head;
		 
		 for (int i = 1; i < position; i++) {
			del=del.getNext();
		}
		 
		 del.getPrev().setNext(del.getNext());
		 if (del.getNext()!=null) {
			del.getNext().setPrev(del.getPrev());
		}
		
		
		return true;
	}

	public boolean deletebyvalue(int data) {
		if (head==null) {
			return false;
		}
		 if (head.getData()==data) {
			head=head.getNext();
			return true;
		}
		
		 Node del=head;
		 
		while(del.getData()!=data) {
			del=del.getNext();
		}
		 
		 del.getPrev().setNext(del.getNext());
		 if (del.getNext()!=null) {
			del.getNext().setPrev(del.getPrev());
		}
		
		
		return true;
	}
	public void display() {
		
		Node curnode=head;
		
		while(curnode!=null) {
			System.out.print(curnode.getData()+" ");
			curnode=curnode.getNext();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Node getHead() {
		return head;
	}

}
