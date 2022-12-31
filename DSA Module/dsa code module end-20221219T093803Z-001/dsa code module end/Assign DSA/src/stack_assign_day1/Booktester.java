package stack_assign_day1;

public class Booktester {

	public static void main(String[] args) {
     BookStack<Book> stackE = new BookStack<Book>(4);
     stackE.push(new Book());
     stackE.push(new Book("Suraj",12));
     stackE.push(new Book("Book2",14));
     stackE.push(new Book("Book3",13));
     //stackE.push(new Book("Suraj",12));
    Book b1 = stackE.pop();
    b1.display();
    b1 = stackE.pop();
    b1.display();
	
	
	
	}

}
