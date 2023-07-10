package MergeTwoLinkedList;

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

}
