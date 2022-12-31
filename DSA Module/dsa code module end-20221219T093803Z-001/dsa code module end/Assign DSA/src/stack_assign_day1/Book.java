package stack_assign_day1;

public class Book {
	private String name;
    private int ISBN;
    
    public Book() 
    {
		// TODO Auto-generated constructor stub
	ISBN = 0;
	name = "";
     }
    public Book(String name,int ISBN)
    {
        this.name = name;
    	this.ISBN = ISBN;
    
    }
    public void display()
    {
    	System.out.println("Name:-" + name +" ISBN number:- "+ ISBN);
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
    
}
