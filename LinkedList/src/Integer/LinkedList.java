package Integer;

public class LinkedList {
	Node head;
	public LinkedList()
	{
		head=null;
	}
	public void createLinledList(int terms)
	{
		int no=1;
		for(int i=0;i<terms;i++)
		{
			Node record=new Node(no);
			if(head==null)
				head=record;
			else
			{
				Node move=head;
				while(move.next!=null)
					move=move.next;
				move.next=record;
			}
			no++;
		}
	}
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
	
		public void sort()
		{
			int data = 0;
			Node record=new Node(data);
			if(head==null)
			{
				head=record;
				return;
			}
			if(record.data<head.data)
			{
				record.next=head;
				head=record;
				return;
			}
			Node move=head;
			while(true)
			{
				if(move.next==null)
				{
					move.next=record;
					break;
				}
			if(move.data<=record.data && move.next.data>record.data)
			{
				record.next=move.next;
				move.next=record;
				return;
			}
			move=move.next;
			}
		}

}
