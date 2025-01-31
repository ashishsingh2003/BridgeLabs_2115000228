class Book{
	private int price;
	private String author;
	private String title;
	public Book(String title,String author,int price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void display()
	{
		System.out.println("B00K"+"->"+title);
		System.out.println("Author"+"->"+author);
		System.out.println("Price"+"->"+price);
	}
	
}
public class BookDetails{
	public static void main(String[] args)
	{
		Book book=new Book("Hard things about hard things","Ashish Singh",2000);
		book.display();
	}
}