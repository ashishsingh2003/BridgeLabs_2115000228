import java.util.*;
class Node{
   int rollNumber;
   String name;
   int age;
   String grade;
   Node next;
   public Node(int rollNumber,String name,int age,String grade)
   {
	  this.rollNumber=rollNumber;
	  this.name=name;
	  this.age=age;
	  this.grade=grade;
	  this.next=null;
   }
   public void displayDetails()
   {
		System.out.println(this.rollNumber);
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.grade);
		return;
   }
   
   
}
class LinkedList{
	Node head=null;
	public void addAthead(Node node)
	{
		if(this.head==null)
		{
			this.head=node;
			return;
		}
		node.next=head;
		this.head=node;
	}
	public void displayAllStudent()
	{
		Node temp=head;
		while(temp!=null)
		{
			temp.displayDetails();
			temp=temp.next;
		}
	}
	public void delete(Node node)
	{
		Node temp=head;
		Node prev=null;
		while(temp!=node)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==head)
		{
			head=head.next;
			return;
		}
		prev.next=temp.next;
		temp=null;
		
	}
	public void search(int rollNumber)
	{
		Node temp=head;
		while(temp.rollNumber!=rollNumber)
		{
			temp=temp.next;
		}
		System.out.println(temp.name);
	}
	public void updateGrade(int rollNumber,String grade)
	{
		Node temp=head;
		while(temp.rollNumber!=rollNumber)
		{
			temp=temp.next;
		}
		temp.grade=grade;
		
	}
}
public class StudentRecordManagement{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		Node node1=new Node(1,"Ashish Singh",21,"A");
		Node node2=new Node(2,"Ayan",21,"A");
		Node node3=new Node(3,"Sarthak",21,"A");
		l.addAthead(node1);
		l.addAthead(node2);
		l.addAthead(node3);
		l.delete(node2);
		l.search(1);
		l.updateGrade(3,"B");
		l.displayAllStudent();
	    
	}
}
