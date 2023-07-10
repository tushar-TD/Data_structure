package MergeTwoLinkedList;

public class Node {
	int data;
	Node next;
	public Node()
	{
		this.data=0;
		this.next=null;
	}
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
	public String toString()
	{
		return " "+data;
	}

}
