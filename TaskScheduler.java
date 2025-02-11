import java.util.*;
class Node{
   int taskId;
   String taskName;
   int priority;
   String dueDate;
   Node next;
  
   public Node(int taskId,String taskName,int priority,String dueDate)
   {
	  this.taskId=taskId;
	  this.taskName=taskName;
	  this.priority=priority;
	  this.dueDate=dueDate;
	  this.next=null;
	 
   }
   public void displayDetails()
   {
		System.out.println(this.taskId);
		System.out.println(this.taskName);
		System.out.println(this.priority);
		System.out.println(this.dueDate);
		return;
   }  
}
class CircularLinkedList{
	Node head=null;
	Node tail=null;
	public void addAthead(Node node)
	{
		if(this.head==null)
		{
			this.head=node;
			this.tail=head;
			tail.next=head;
			return;
		}
		else{
		node.next=head;
		this.head=node;
		tail.next=head;}
	}
	public void delete(int taskId)
	{
		Node temp=head;
		Node prev=null;
		while(temp.taskId!=taskId)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==head)
		{
			
			head=head.next;
			tail.next=head;
			
			return;
		}
		prev.next=temp.next;
	    
		temp=null;
		
	} 
	public void search(int priority)
	{
		Node temp=head;
		while(temp.priority!=priority&&temp.next!=head)
		{
			temp=temp.next;
		}
		temp.displayDetails();
	}
	public void showAllTasks()
	{
		Node temp=head;
	
		while(temp.next!=head)
		{
			temp.displayDetails();
			temp=temp.next;
		}
		temp.displayDetails();
		
		
	}
}
public class TaskScheduler{
	public static void main(String[] args)
	{
		CircularLinkedList l=new CircularLinkedList();
		Node node1=new Node(1,"Addition",3,"25-02-2025");
		Node node2=new Node(5,"subtraction",2,"24-02-2025");
		Node node3=new Node(3,"division",1,"23-02-2025");
		l.addAthead(node1);
		l.addAthead(node2);
		l.addAthead(node3);
		l.delete(1);
		l.search(5);
		
		l.showAllTasks();
		
	    
	}
}


