package singly;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SLL sl = new SLL();

		sl.insert(10);
		sl.insertatlast(20);
		sl.insertatlast(50);
		sl.insertatlast(30);
		sl.insertbyposition(15, 3);
		sl.insertatbegin(40);
		sl.display();
//		sl.deletebyposition(4);
		System.out.println();
//		sl.deletebyvalue(20);
//		sl.display();
//		sl.reverse();
		System.out.println(sl.findmiddle());
		System.out.println(sl.sortlinked());

//		boolean exit = false;
//		while (!exit) {
//
//			Scanner sc = new Scanner(System.in);
//			System.out.print("Options: \n1.Insert node at end \n1.Insert node at begin \n1.Insert node at middle");
//			System.out.print("Enter your choice");
//			switch (sc.nextInt()) {
//			case 1:
//
//				break;
//			case 2:
//
//				break;
//			case 3:
//
//				break;
//			case 4:
//
//				break;
//			case 5:
//
//				break;
//			case 6:
//
//				break;
//			case 7:
//
//				break;
//			case 8:
//						exit=true;
//				break;
//
//			}
//		}
	}

}
