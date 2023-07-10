package String;

public class Node {
	String data;
	Node next;
	public Node()
	{
		this.data=null;
		this.next=null;
	}
	public Node(String data)
	{
		this.data=data;
		next=null;
	}
	public String toString()
	{
		return " "+data;
	}

}
