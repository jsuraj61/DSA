package doubly;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL dl=new DLL();
		
		dl.insert(10);
		dl.insert(20);
		dl.insert(30);
		dl.insert(40);
		dl.insertbyposition(15, 1);
		
		dl.display();
		System.out.println();
//		dl.insertbyposition(50,6);
//		dl.deletebyposition(5);
		dl.deletebyvalue(40);
		dl.display();
	}

}
