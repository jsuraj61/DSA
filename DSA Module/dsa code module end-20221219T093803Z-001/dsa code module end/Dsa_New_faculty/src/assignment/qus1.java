package assignment;

public class qus1 
{
   private int []arr;
   private int top,size;
   
    public qus1() 
    {
	 size = 10;
	 arr = new int[size];
	 top= -1; //Stack is empty
    }
    
    public qus1(int s)
    {
    size = s;
    arr = new int[size];
    top = -1;
    }
    
    public boolean isEmpty()
    {
    	if(top == -1)
    	return true;
    	else
    		return false;
    }
    public boolean isFull()
    {
    if(top == (size - 1))
    return true;
    else
    	return false;
    }
    public boolean push(int ele)
    {
     if(isFull() == false)
     {
    	 top = top + 1;
    	 arr[top] = ele;
    	 return true;
    	 
     }
     else
    	 return false;
    	 
    }
    public int pop()
    {
    	 if(isEmpty() == false)
         {
             int temp = arr[top];		 
        	 top = top - 1;
        	 return temp;
        	 
         }
         else
        	 return -99;
    }
    public int peek()
    {
    	if(isEmpty() == false)
    	{
       // for(int i=1;i<arr.length;i++)
        return arr[arr.length - 1];
    	}
    	return -999;
    }
   public static void main(String[] args) 
   {
	   qus1 q = new qus1(5);
	   q.push(12);
	   q.push(13);
	   q.push(14);
	   q.push(15);
	 q.push(16);
	   System.out.println(q.peek());
	   System.out.println(q.pop());
	   System.out.println(q.isEmpty());
	   System.out.println(q.isFull());
   } 
    
    
}
