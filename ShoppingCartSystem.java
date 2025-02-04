import java.util.*;
class ShoppingCartSystemClass{
    static int discount=10;
	String productName;
	int price;
	int quantity;
	final int productId;
	public ShoppingCartSystemClass(String productName,int price,int quantity,int productId)
	{
	   this.productName=productName;
	   this.price=price;
	   this.quantity=quantity;
	   this.productId=productId;
	   
	}
	public static void updateDiscount(int discnt)
	{
	   discount=discnt;
	}
	public void displayDetails()
	{
	     System.out.println(this.productName);
		 System.out.println(this.price);
		 System.out.println(this.quantity);
	}
}
public class ShoppingCartSystem{
      public static void main(String[] args)
	  {
	     ShoppingCartSystemClass obj=new ShoppingCartSystemClass("Soap",20,1,1);
	     if(obj instanceof ShoppingCartSystemClass)
		 {
		    
			obj.displayDetails();
		 }
	  }
}