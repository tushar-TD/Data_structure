package AdjanancyList1;
class Node
{
	//int vertex;
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Graph
{
	//int vertex;
	Node head[];
	public Graph(int size)
	{
		head=new Node[size];
		for(int i=0;i<size;i++)
			head[i]=new Node(i);
	}
	
	public void addNode(int start,int end)
	{
		Node record=new Node(end);
		Node record1=new Node(start);
		if(head[start]==null)
		{
			head[start]=record;
		}
		else
		{
			Node move=head[start];
			while(move.next!=null)
				move=move.next;
			move.next=record;
		}
		if(head[end]==null)
		{
			head[end]=record1;
		}
		else
		{
			Node move=head[end];
			while(move.next!=null)
				move=move.next;
			move.next=record1;
		}
	}
	void display()
	{
		for(int i=0;i<head.length;i++)
		{
			System.out.print ("----> "+i+ " : ");
			for(Node move=head[i];move!=null;move=move.next)
				System.out.print("  "+move.data);
			System.out.println();	
		}
	}
}
public class ALDemo {
	public static void main(String[] args) {
		Graph g=new Graph(6);
		g.addNode(0,1);
		g.addNode(0,4);
		g.addNode(1,2);
		g.addNode(2,3);
		g.addNode(3,4);
		g.addNode(4,5);
		g.addNode(3,5);
		g.display();
	}
}