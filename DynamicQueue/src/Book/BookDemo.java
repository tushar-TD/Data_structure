package Book;

import java.util.Scanner;


class Book
{
	int id;
	String name;
	public Book(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
}
class Node
{
	Book data;
	Node next;
	public Node(Book data)
	{
		this.data=data;
		next=null;
	}
	@Override
	public String toString() {
		return " "+data;
	}
}
class DynamicQueue
{
	Node rear,front;
	public DynamicQueue()
	{
		rear=front=null;
	}
	public void enQueue(Book data)
	{
		Node record=new Node(data);
		if(front==null)
			front=rear=record;
		else
		{
			rear.next=record;
			rear=record;
		}
	}
	public Book deQueue()
	{
		if(front==null)
			return null;
		else
		{
			Node del=front;
			front=front.next;
			Book d=del.data;
			del=null;
			return d;
		}
	}
	public void display()
	{
		if(front==null)
		{
			System.out.println("Queue Is Empty.");
			return;
		}
		Node move=front;
		while(move!=rear)
		{
			System.out.print(" "+move.data);
			move=move.next;
		}
		if(move==rear)
			System.out.print(" "+move.data);
		System.out.println();
	}
}
public class BookDemo {
	public static void main(String[] args) {
		Book data;
		int id;
		String name;
		int ch;
		DynamicQueue q=new DynamicQueue();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.EnQueue");
			System.out.println("2.DeQueue");
			System.out.println("3.Display");
			System.out.println("0.Exit");
			System.out.println("Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" Enter id and name: ");
				id=sc.nextInt();
				name=sc.next();
				Book b=new Book(id, name);
				q.enQueue(b);
				break;
			case 2:
				data=q.deQueue();
				System.out.println(" Delete Data Is "+data);
				break;
			case 3:
				q.display();
				break;
			}
		}while(ch!=0);
	
	}

}
