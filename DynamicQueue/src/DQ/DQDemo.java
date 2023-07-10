package DQ;

import java.util.Scanner;

class Node
{
	int data;
	Node next;
	public Node(int data)
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
	public void enQueue(int data)
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
	public int deQueue()
	{
		if(front==null)
			return -9999;
		else
		{
			Node del=front;
			front=front.next;
			int d=del.data;
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
public class DQDemo {
	public static void main(String[] args) {
		int data,ch;
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
				System.out.println(" Enter Data ");
				data=sc.nextInt();
				q.enQueue(data);
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
