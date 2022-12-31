package assignment;

//Write a program to convert the infix expression into its postfix form using stack.
//Accept infix string from user.

public class Ques5 {

	private char arr[];
	private int top, size;

	public Ques5() {
		size = 10;
		arr = new char[size];
		top = -1;
	}

	public Ques5(int s) {
		size = s;
		arr = new char[size];
		top = -1;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (top == (size - 1)) {
			return true;
		} else
			return false;
	}

	public boolean push(char ele) {

		if (isFull() == false) {
			top = top + 1;
			arr[top] = ele;
			return true;
		} else
			return false;
	}
	
	public char pop()
	{
		if(isEmpty()==false)
		{
		char temp = arr[top];
		top = top -1 ;
		while(temp != 0)
		{
		if(top == ')')
		{
		continue;
		}
		
		
		}
		}
		return 0;
		
	}
}
