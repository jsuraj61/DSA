package stack_assign_day1;

public class Operator
{
   private char []arr;
   private int top, size;
   public Operator()
   {
   size = 10;
   arr = new char[size];
   top = -1;
   }
   public Operator(int s)
   {
	size=s;
	arr= new char[size];
	top = -1;
   }
   
   public boolean isEmpty() {
	   if(top == -1)
		   return true;
	   else
		   return false;
   }
   
   public boolean isFull() {
	   if(top ==(size-1))
		   return true;
	   else
		   return false;
   }
   
   public char peek() throws Exception {
	   if( isFull()==false && isEmpty()==false) {
	  char temp= arr[top] ; //top = ,top-1,top-2
	    System.out.println(temp);
	  return temp;
	   }
	   else
		  throw new Exception("fgfg");
	 //  System.out.println(arr[temp]);
   }
   public boolean push(char element) throws Exception
   {
	   if(isFull() == false)
	   {
		top = top + 1; 
		arr[top]=element;
		return true;
	   }
	   else
	   {
		   throw new Exception("Stack is fulllll");
	   }
     	   
   }
   public char pop() throws Exception {
	   
	   if(isEmpty()== false) {
		   char temp= arr[top];
		   top= top-1;
		   return temp;
		 
	   }
	   else
		throw new Exception("Stack is empty ");
	   
   }
   
}
