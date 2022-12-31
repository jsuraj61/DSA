package assignment;

public class qus8 
{
   private int[] arr;
   private int front = -1, rear = -1;
   
   public qus8() 
   {
	// TODO Auto-generated constructor stub
    arr =  new int[5] ;
    front = -1;
    rear = -1;
   }
   public qus8(int s)
   {
	   arr = new int [s];
	   front = -1;
	   rear = -1;
   }
   public boolean isEmpty()
   {
	if(front == -1 || front > rear) // front == -1 && rear == front is it not correct??
		return true;
	return false;
   }
   public boolean isFull()
   {
	   if(rear == (arr.length - 1))
	   return true;
	   return false;
   }
   public void enqueue(int data)
   {
	if(isFull() == false)
	{
		rear = rear + 1;
		arr[rear] = data;
		if(front == -1)
		{
		front = 0;	
		}
		System.out.println("Enqueue"+data+" front "+front+" rear"+ rear);
	}
	else
	{
		System.out.println("Queue is full !!!!!!");
	}
	
   }
   public int dequeue()
   {
	   if(isEmpty() == false)
	   {
		int temp = arr[front];
		front = front + 1;
     	return temp;
	   
	   }
	   return -999;
   }
   public static void main(String[] args) {
	
	   qus8 q8=new qus8();
	   System.out.println(q8.isEmpty());
	   q8.enqueue(10);
	   q8.enqueue(12);
}
}
