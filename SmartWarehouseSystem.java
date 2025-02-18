import java.util.*;
abstract class WarehouseItem{
	abstract public String getName();
}
class Storage<T extends WarehouseItem>{
	List<T>l=new ArrayList<>();
	
	public void addItem(T item)
	{
		l.add(item);
	}
	public List<T> getItem()
	{
		return l;
	}
}
class Electronics extends WarehouseItem{
     String name;
	
	 Electronics(String name)
	 {
	  this.name=name;
	 }
	 public String getName()
	 {
		 return name;
	 }
}
class Groceries extends WarehouseItem{
     String name;
	 Groceries(String name)
	 {
	  this.name=name;
	 }
	  public String getName()
	 {
		 return name;
	 }
}
class Furniture extends WarehouseItem{
     String name;
	 Furniture(String name)
	 {
	  this.name=name;
	 }
	  public String getName()
	 {
		 return name;
	 }
}
public class SmartWarehouseSystem{
	public static void displayDetails(List<? extends WarehouseItem > l)
	{
		for(WarehouseItem data:l)
		{
			System.out.println(data.getName());
		}
	}
	public static void main(String[] args){
		Storage<Electronics>electronics=new Storage();
		electronics.addItem(new Electronics("heater"));
		electronics.addItem(new Electronics("battery"));
		displayDetails(electronics.getItem());
		
		Storage<Groceries>groceries=new Storage();
		groceries.addItem(new Groceries("tomato"));
		displayDetails(groceries.getItem());
	
	    Storage<Furniture>furniture=new Storage();
		furniture.addItem(new Furniture("Chair"));
		displayDetails(furniture.getItem());
		
	
	}
}
