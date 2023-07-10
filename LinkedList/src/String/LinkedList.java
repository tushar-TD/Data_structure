package String;

public class LinkedList {
	Node head;
	public LinkedList()
	{
		head=null;
	}
	/*public void createLinkedList(int terms)
	{
		//int no = 1;
		String str="";
		for(int i=0;i<terms;i++)
		{
			//str=Integer.toString(no);
			Node record=new Node(str);
			if(head==null)
				head=record;
			else
			{
				Node move=head;
				while(move.next!=null)
					move=move.next;
				move.next=record;
			}
			//no++;
		}
	}*/
	
	public void display()
	{
		Node move=head;
		while(move!=null)
		{
			System.out.print(" "+move.data);
			move=move.next;
		}
		System.out.println();
	}
	public void addNodeBeg(String str)
	{
		Node record=new Node(str);
		if(head==null)
		{
			head=record;
			return ;
		}
		record.next=head;
		head=record;
	}
	public void addNodeEnd(String str)
	{
		Node record=new Node(str);
		if(head==null)
		{
			head=record;
			return;
		}
		Node move=head;
		while(move.next!=null)
			move=move.next;
		move.next=record;
	}
	public void addNodeMid(String str,int pos)
	{
		Node record=new Node(str);
		if(head==null)
		{
			head=record;
			return;
		}
		Node move=head;
		for(int i=1;i<pos-1;i++)
			move=move.next;
		record.next=move.next;
		move.next=record;
	}
	public String deleteBeg()
	{
		Node temp=head;
		String a=head.data;
		head=head.next;
		temp=null;
		return a;
		
	}
	public String deleteEnd()
	{
		Node move=head;
		while(move.next.next!=null)
			move=move.next;
		String a=move.next.data;
		move.next=null;
		return a;
	}
	public void deleteMid(String str)
	{
		Node move=head;
		while(move.next!=null)
		{
		if(move.next.data.equalsIgnoreCase(str))
		{
			move.next=move.next.next;
			break;
		}
		move=move.next;
		}
	}
	public String showFirstNode()
	{
		Node temp=head;
		String a=head.data;
		return a;
	}
	public String showLastNode()
	{
		Node move=head;
		while(move.next!=null)
			move=move.next;
		String a=move.data;
		return a;
	}
	public String showNthData(int pos)
	{
		Node move=head;
		for(int i=1;i<pos-1;i++)
			move=move.next;
		String a=move.next.data;
		return a;
	}
	public int countNode()
	{
		int c=0;
		Node move=head;
		while(move.next!=null)
			{
				c++;
				move=move.next;
			}
		c++;
		return c;
	}
	public void modify(int pos,String str)
	{
		Node move=head;
		for(int i=0;i<pos-1;i++)
		{
			move=move.next;
		}
		move.data=str;
		System.out.println("----After Update----");
		display();
	}
	public void search(String str)
	{
		Node move=head;
		int c=1;
		int pos=0;
		while(move.next!=null)
		{
			if(move.data.equalsIgnoreCase(str))
			{
				pos=c;
				break;
			}
			move=move.next;
			c++;
		}
		if(pos==0)
			System.out.println("Not Found.");
		else
			System.out.println("Found At Position:"+pos);
	}
	public void printReverse(Node move)
	{
		if(move!=null)
		{
			printReverse(move.next);
			System.out.print(" "+move.data);
		}
	}
	public void reverse()
	{
		Node prev=head;
		Node curr=prev.next;
		Node nxt=curr.next;
		while(curr!=null)
		{
			curr.next=prev;
			prev=curr;
			curr=nxt;
			if(nxt!=null)
				nxt=nxt.next;
		}
		head.next=null;
		head=prev;
	}
}
