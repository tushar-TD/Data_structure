package IntegerDoubly;

import java.util.Scanner;

public class LinkedList {
	Node head;
	public LinkedList()
	{
		head=null;
	}
	public void addEnd(int data)
	{
		Node record=new Node(data);
		if(head==null)
		{
			head=record;
			//return;
		}
		else
		{
			Node move=head;
			while(move.getNext()!=null)
				move=move.getNext();
			move.setNext(record);
			record.setPrev(move);
		}
	 }
	/*public void createLinkedList(int terms)
	{
		int no;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=terms;i++)
		{
			System.out.println("Enter Data:");
			no=sc.nextInt();
			addEnd(no);
		}
	}*/
	public void createLinkedList(int terms)
	{
		for(int i=1;i<=terms;i++)
			addEnd(i);
	}
	public void display()
	{
		Node move=head;
		while(move!=null)
			{
				System.out.print(move);
				move=move.getNext();
			}
		System.out.println();
	}
	public void addNode(int pos, int no)
	{
		Node record=new Node(no);
		if(pos==1)
		{
			head.setPrev(record);
			record.setPrev(head);
			head=record;
			return;
		}
		Node move=head;
		for(int i=1;i<pos-1;i++)
			move=move.getNext();
		record.setNext(move.getNext());
		if(record.getNext()!=null)
			record.getNext().setPrev(record);
		record.setPrev(move);
		move.setNext(record);
	}
	public void insert(int pos,int data)
	{   
		Node record=new Node(data);
		int cnt=count();
		if(pos==1)
		{
			head.setPrev(record);
			record.setNext(head);
			head=record;
			return;
		}
		if(pos>1 && pos<=cnt+1)
		{
			Node move=head;
			for(int i=1;i<pos-1;i++)
				move=move.getNext();
			record.setNext(move.getNext());
			if(move.getNext()!=null)
				move.getNext().setPrev(record);
			record.setPrev(move);
			move.setNext(record);
		}
		else
			System.out.println(" Can not Insert Data ");
		
		
	}
	public void printReverse()
	{
		Node move=head;
		while(move.getNext()!=null)
			move=move.getNext();
		while(move!=null)
		{
			System.out.print(move);
			move=move.getPrev();
		}
		System.out.println();
	}
	
	public void delete(int no)
	{
		//boolean flag=true;
		Node move=head;
		if(head==null)
		{
			System.out.println("Empty.");
			return;
		}
		if(head.getData()==no)
		{
			head.getNext().setPrev(null);
			head=head.getNext();
			//flag=true;
			return;
		}
		else
		{
			while(move.getNext().getData()!=no)
				move=move.getNext();
			if(move.getNext().getNext()==null)
			{
				move.setNext(null);
			}
			else
			{
				move.setNext(move.getNext().getNext());
				move.getNext().setPrev(move);
			}
		}
	}
	public int count()
	{
		int cnt=0;
		Node move=head;
		while(move!=null)
		{
			cnt++;
			move=move.getNext();
		}
		return cnt;
	}
	public void split()
	{
		//Node move=head;
		LinkedList e=new LinkedList();
		LinkedList o=new LinkedList();
		for(Node move=head;move!=null;move=move.getNext())
		{
			//move=move.getNext();
			if(move.getData()%2==0)
				e.addEnd(move.getData());
			else
				o.addEnd(move.getData());
		}
		e.display();
		o.display();
	}
	//Not working to delete last element:
	/*public void delete(int pos)
	{
		Node move=head;
		if(head==null)
			System.out.println("Empty Doubly Linked List.");
		else if(pos==1)
		{
			move.getNext().setPrev(null);
			move=move.getNext();
			head=move;
		}
		else if(pos>1 && pos<count()+1)
		{
			for(int i=1;i<pos-1;i++)
				move=move.getNext();
			move.setNext(move.getNext().getNext());
			move.getNext().setPrev(move);
		}
	}*/
}
