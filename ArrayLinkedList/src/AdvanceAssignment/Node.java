package AdvanceAssignment;

public class Node {
	int data;
	Node next;
	public Node()
	{
		this.data=0;
		this.next=null;
	}
	public Node(int i)
	{
		this.data=i;
		next=null;
	}
	public String toString()
	{
		return " "+data;
	}

}
