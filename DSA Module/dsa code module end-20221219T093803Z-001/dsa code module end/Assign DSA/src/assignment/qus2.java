package assignment;

	public class qus2 
	{
     private String arr[];
     private int top,size;
     public qus2() 
     {
 	 size = 10;
 	 arr = new String[size];
 	 top= -1; //Stack is empty
     }
     public qus2(int s)
     {
     size = s;
     arr = new String[size];
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
     public boolean push(String ele)
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
     public String pop()
     {
     	 if(isEmpty() == false)
          {
              String temp = arr[top];		 
         	 top = top - 1;
         	 return temp;
         	 
          }
          else
         	 return "Not cool";
     }
     public void reverse()
     {
    	 if(isEmpty() == false)
    	 {
    		// for(int i= arr.length -1;i>=0;i--)
    		// return arr[i];
    		for(int i = 0;i<arr.length;i++)
    		{
    		push(arr[i]);	
    		}
    		for(int i = 0;i<arr.length;i++)
    		{
    		System.out.println(pop());
    		}
    	 }
    	 
    //	 return "Notcool";
     }
     
     public static void main(String[] args) 
     {
	 qus2 q = new qus2();
	 q.push("Ronaldo");
	 q.push("is");
	 q.push("goat");
	System.out.println(q.pop());
	System.out.println(q.pop());
	System.out.println(q.pop());
	}
     
	}
