import java.util.*;
abstract class Product{
	protected int productId;
	protected String name;
	protected int price;
	abstract public double calaculateDiscount();
	
}
interface Taxable{
	public double calculateTax();
	public void getTaxDetails();
	
}
class Electronics extends Product implements Taxable{
	double tax;
	double discount;
    public Electronics(int productId,String name,int price)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		tax=(10*this.price)/100;
		discount=(10*this.price)/100;
	}
	public double calaculateDiscount()
	{   tax=(10*this.price)/100;
		return tax;
	}
	public void getTaxDetails()
	{
	   System.out.println(productId);
		System.out.println(name);
		System.out.println(price);
		System.out.println(tax);
		double finalPrice=(price+tax-discount);
		System.out.println("final price "+finalPrice);
	}
	public double calculateTax(){
	   tax=(10*this.price)/100;
       return tax;	
	}
}
class Clothing extends Product implements Taxable{
	double tax;
	double discount;
    public Clothing(int productId,String name,int price)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		tax=(10*this.price)/100;
		discount=(10*this.price)/100;
	}
	public double calaculateDiscount()
	{   tax=(10*this.price)/100;
		return tax;
	}
	public double calculateTax(){
	   tax=(10*this.price)/100;
       return tax;	
	}
	public void getTaxDetails()
	{
	   System.out.println(productId);
		System.out.println(name);
		System.out.println(price);
		System.out.println(tax);
		double finalPrice=(price+tax-discount);
		System.out.println("final price "+finalPrice);
	}
}
class Groceries extends Product implements Taxable{
    double tax;
	double discount;
    public Groceries(int productId,String name,int price)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		tax=(10*this.price)/100;
		discount=(10*this.price)/100;
	}
	public double calaculateDiscount()
	{   tax=(10*this.price)/100;
		return tax;
	}
	public double calculateTax(){
	   tax=(10*this.price)/100;
       return tax;	   
	}
	public void getTaxDetails()
	{
		System.out.println(productId);
		System.out.println(name);
		System.out.println(price);
		System.out.println(tax);
		double finalPrice=(price+tax-discount);
		System.out.println("final price "+finalPrice);
	}
}
public class ECommercePlatform{
	public static void main(String[] args)
	{
		Electronics product1=new Electronics(1,"TV",50000);
		product1.getTaxDetails();
	}
}

