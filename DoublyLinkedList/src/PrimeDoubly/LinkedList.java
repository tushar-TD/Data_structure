package PrimeDoubly;


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
	public void createLinkedList()
	{
		int cnt=0;int no=1;
			while(cnt<10)
			{
				boolean flag=true;
				for(int i=2;i<no;i++)
				{
					if(no%i==0)
					{
						flag=false;
						break;
					}
				}
				if(flag==true)
				{
					addEnd(no);
					cnt++;
				}
			no++;
		}
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
	
}
