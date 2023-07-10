package MergeTwoLinkedList;

public class Demo {
	static LinkedList res;
	static LinkedList l1;
	static LinkedList l2;
	/*public static void mergeLinkedList(LinkedList l1,LinkedList l2)
	{
		res = new LinkedList();
		Node move1=l1.head;
		Node move2=l2.head;
		Node move=null;
		Node record=null;
		while(true)
		{
			if(move1==null && move2==null)
				break;
			else
			{
				if(move1!=null)
				{
					//int data;
					record=new Node(move1.data);
					move1 = move1.next;
				}
				else if(move2!=null)
				{
					record=new Node(move2.data);
					move2=move2.next;
				}
				if(res.head==null)
				{
					res.head=record;
				}
				else
				{
					move=res.head;
					while(move.next!=null)
						move=move.next;
					move.next=record;
				}
			}
		}
	}*/
	public void merge(LinkedList l2)
	{
		
	}

	public static void main(String[] args) {
		System.out.println("1st Linked List:");
		l1=new LinkedList();
		l1.createLinledList(5);
		l1.display();
		
		System.out.println("2nd Linked List:");
		l2=new LinkedList();
		l2.createLinledList(7);
		l2.display();
		
		/*System.out.println("Merged Linked List:");
		res = new LinkedList();
		mergeLinkedList(l1,l2);
		res.display();*/
		

	}

}
