package Polymerpision;

public class Coursebook extends Book {
public static void printName() {
	System.out.println("this is ypur course book");
}
public  int issueBook(int n) {
	System.out.println("issuebook id"+n);
	return n;
	
	
}
public int issueBook() {
	return 0;
}
public void returnBook(int n)
{
	System.out.println("return book id1:"+n);
}
}
