import java.util.*;
class Node{
   String title;
   String director;
   int releaseYear;
   String rating;
   Node next;
   Node prev;
   public Node(String title,String director,int releaseYear,String rating)
   {
	  this.title=title;
	  this.director=director;
	  this.releaseYear=releaseYear;
	  this.rating=rating;
	  this.next=null;
	  this.prev=null;
   }
   public void displayDetails()
   {
		System.out.println(this.title);
		System.out.println(this.director);
		System.out.println(this.releaseYear);
		System.out.println(this.rating);
		return;
   }  
}
class DoublyLinkedList{
	Node head=null;
	public void addAthead(Node node)
	{
		if(this.head==null)
		{
			this.head=node;
			return;
		}
		node.next=head;
		head.prev=node;
		this.head=node;
	}
	public void delete(String title)
	{
		Node temp=head;
		Node prev=null;
		while(temp.title!=title)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==head)
		{
			head=head.next;
			head.prev=null;
			return;
		}
		prev.next=temp.next;
		temp.next.prev=prev;
		temp=null;
		
	}
	public void showAllRecords()
	{
		Node temp=head;
		Node reverse=null;
		while(temp!=null)
		{
			temp.displayDetails();
			reverse=temp;
			temp=temp.next;
		}
		temp=reverse;
		while(temp!=null)
		{
			temp.displayDetails();
			reverse=temp;
			temp=temp.prev;
		}
		
	}
	public void search(String rating)
	{
		Node temp=head;
		while(temp.rating!=rating)
		{
			temp=temp.next;
		}
		temp.displayDetails();
	}
	public void updateRating(String title,String rating)
	{
		Node temp=head;
		while(temp.title!=title)
		{
			temp=temp.next;
		}
		temp.rating=rating;
		
	}
	
}
public class MovieManagementSystem{
	public static void main(String[] args)
	{
		DoublyLinkedList l=new DoublyLinkedList();
		Node node1=new Node("Tanhaji","Ashish Singh",2018,"8.9");
		Node node2=new Node("Kerala Files","Shubham Pandey",2023,"8.5");
		Node node3=new Node("SitaRam","Prashant Rasali",2021,"8");
		l.addAthead(node1);
		l.addAthead(node2);
		l.addAthead(node3);
		l.delete("SitaRam");
		l.search("8.5");
		l.updateRating("Tanhaji","9");
		l.showAllRecords();
		
	    
	}
}


