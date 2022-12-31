package stack_assign_day1;

public class OperatorTest {

	public static void main(String[] args) throws Exception {

		Operator opt=new Operator();
		opt.push('-');
		opt.push('+');
		opt.push('*');

		System.out.println("calling peek");
	     opt.peek();
	 	System.out.println("calling pop");
	 	char element = opt.pop();
		System.out.println("Poped element is ->"+ element);
		System.out.println(opt.isEmpty());
		System.out.println(opt.isFull());
	}

}
