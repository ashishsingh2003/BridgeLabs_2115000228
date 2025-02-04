import java.util.*;
class LibraryManagementClass{
    static String libraryName="Maharana Pratap Library";
	String title;
	String author;
	final int isbn;
	public LibraryManagementClass(String title,String author,int isbn)
	{
	   this.title=title;
	   this.author=author;
	   this.isbn=isbn;
	}
	public static void displayLibraryName()
	{
	   System.out.println(libraryName);
	}
	public void displayDetails()
	{
	     System.out.println("Book is "+this.title);
		 System.out.println("Authorf book is "+this.author);
		 System.out.println("ISBN number is "+this.isbn);
	}
}
public class LibraryManagement{
      public static void main(String[] args)
	  {
	     LibraryManagementClass obj=new LibraryManagementClass("Wall Street","Peter Lynch",123847488);
	     if(obj instanceof LibraryManagementClass)
		 {
		    obj.displayLibraryName();
			obj.displayDetails();
		 }
	  }
}