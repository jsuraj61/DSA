package queue_assign_3_day2;
/*Q3. Define Circular Queue of size 5 for storing object of MyProcess Class
MyProcess has attributes pid, pname, owner
a. Here enqueue 5 processes 
b. dequeue 5 processes and display their details one by one
c. Here enqueue 5 processes 
d. dequeue 5 processes and display their details one by one*/

public class Myprocess {
	private int pid;
	private String pname;
	private String owner;
	
	public Myprocess(int pid, String pname, String owner) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.owner = owner;
	}

	public String toString() {
		return "pid : "+pid+ " pname :"+pname+" owner :"+owner;
	}
	
	
	
	
}
