package assignment;

public class qus3 
{
    private int arr[];
    private int top,size;
    public qus3() 
    {
	size = 10;
	arr = new int [size];
	top = -1;
	}
    public qus3(int s)
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
		int i = 1 , binary = 0, rem;
		while(temp != 0)
		{
			rem = temp % 2;
			binary += i*rem; //concat here
			temp = temp / 2;
			i = i * 10;
		}
		return binary;
		
	   }
	   else return -999;
   }
    
   public static void main(String[] args)
   {
	   qus3 q = new qus3();	
	   q.push(5);
	  
	   System.out.println(q.pop());
	}
}
