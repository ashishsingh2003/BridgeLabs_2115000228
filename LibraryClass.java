import java.util.*;
class Book{
   private String title;
   private String author;
   public Book(String title,String author)
   {
       this.title=title;
	 this.author=author;
   }
   public void displayDetails()
   {
      System.out.println("Title is "+title);
	System.out.println("Author is "+author);
	  return;
   }
   public String getBookName()
   {
      
	  return this.title;
	 
   }
}
class Library{
   String libraryName;
   private ArrayList<Book> listBooks;
   public Library(String libraryName)
   {
      this.libraryName=libraryName;
	this.listBooks=new ArrayList<Book>();
   }
   public void addBooks(Book book)
   {
     listBooks.add(book);return;
   }
   public void getBookList()
   {
       for(Book book:listBooks)
	   {
		   
           System.out.print(book.getBookName());
	    
	   }
	   return ;
   }
   
}
public class LibraryClass{
      public static void main(String[] args)
	  {
	     Book book1=new Book("The mountain","Ashish Singh");
		 
		 Library library=new Library("Maharana Pratap");
		 library.addBooks(book1);
		 library.getBookList();
		 
		 
	  }
}
