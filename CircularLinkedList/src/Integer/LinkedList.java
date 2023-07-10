package Integer;


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
			head.next=head;
			return;
		}
		else
		{
			Node move=head;
			while(move.next!=head)
				move=move.next;
			move.next=record;
			record.next=head;
		}
	}
	public void createLinkedList(int terms)
	{
		for(int i=1;i<=terms;i++)
			addEnd(i);
	}
	public void createIntegerLinkedList(int terms)
	{
		for(int i=1;i<=terms;i++)
		{
			Node record=new Node(i);
			if(head==null)
			{
				head=record;
				head.next=head;
			}
			else
			{
				Node move=head;
				while(move.next!=head)
					move=move.next;
				move.next=record;
				record.next=head;
			}
		}
	}
	public int count()
	{
			int c=0;
			Node move=head;
			while(move.next!=head)
				{
					c++;
					move=move.next;
				}
			c++;
			return c;
	}
	public void insert(int pos,int data)
	{
		Node record=new Node(data);
		Node move=head;
		if(head==null)
		{
			head=record;
			head.next=head;
		}
		else if(pos==1)
		{
			record.next=head;
			while(move.next!=head)
				move=move.next;
			head=record;
			move.next=head;
			
		}
		else if(pos>1 && pos<=count()+1)
		{
			for(int i=1;i<pos-1;i++)
				move=move.next;
			record.next=move.next;
			move.next=record;
		}
		else
			System.out.println("Out Of Bound.");
	}
	public void modify(int pos,int data)
	{
		Node move=head;
		for(int i=0;i<pos-1;i++)
		{
			move=move.next;
		}
		move.data=data;
		System.out.println("----After Update----");
		display();
	}
	public void deleteNode(int data)
	{
		Node del=null;
		Node record=new Node(data);
		if(head==null)
		{
			record=head;
			//return null;
		}
		else if(head.data==data)
		{
			del=head;
			Node move=head;
			while(move.next!=head)
				move=move.next;
			move.next=del.next;
			head=head.next;
			//return del;
		}
		Node move=head;
		while(move.next!=head)
			{
				if(move.next.data==data)
				{
					del=move.next;
					move.next=del.next;
					//return del;
				}
				move=move.next;
			}
			//return null;
		}
	public void split()
	{
		LinkedList e=new LinkedList();
		LinkedList o=new LinkedList();
		Node move=head;
		while(move.next!=head)
			{
				if(move.data%2==0)
					e.addEnd(move.data);
				else
					o.addEnd(move.data);
				move=move.next;
			}
		if(move.next==head)
		{
			if(move.data%2==0)
				e.addEnd(move.data);
			else
				o.addEnd(move.data);
		}
		e.display();
		o.display();
	}
	public void display()
	{
		Node move=head;
		while(move.next!=head)
			{
				System.out.print(move);
				move=move.next;
			}
		if(move.next==head)
			{
				System.out.print(move);
				move=move.next;
			}
		System.out.println();
	}

}
