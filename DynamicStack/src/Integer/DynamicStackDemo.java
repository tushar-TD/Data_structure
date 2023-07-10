package Integer;

import java.util.Scanner;

class Node {

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

class DynamicStack
{
	Node top;
	public DynamicStack()
	{
		top=null;
	}
	public boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
	public void push(int data)
	{
		Node record=new Node(data);
		if(isEmpty())
			top=record;
		else
		{
			record.next=top;
			top=record;
		}
	}
	public int pop()
	{
		int data=-9999;
		if(!isEmpty())
		{
			data=top.data;
			top=top.next;
		}
		return data;
	}
	public void display()
	{
		Node move=top;
		while(move!=null)
		{
			System.out.print(" "+move.data);
			move=move.next;
		}
		System.out.println();
	}
}
public class DynamicStackDemo {
	public static void main(String[] args) {
		int data,ch;
		DynamicStack s1=new DynamicStack();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("0.Exit");
			System.out.println("Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" Enter Data ");
				data=sc.nextInt();
				s1.push(data);
				break;
			case 2:
				data=s1.pop();
				System.out.println(" Delete Data Is "+data);
				break;
			case 3:
				s1.display();
			}
		}while(ch!=0);
	}

}
