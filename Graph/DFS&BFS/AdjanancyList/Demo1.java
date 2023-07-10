package AdjanancyList;


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
class LinkedList
{
	//int vertex;
	Node head[];
	public LinkedList(int size)
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
			//System.out.print ("----> "+i+ " : ");
			for(Node move=head[i];move!=null;move=move.next)
				System.out.print("  "+move.data);
			System.out.println();	
		}
	}
}
class Graph
{
	LinkedList l1;
	int vertex;
	int graph[][];
	int visited[];
	public Graph(int size)
	{
		vertex=size;
		graph=new int[size][size];
		visited=new int[vertex];
		l1=new LinkedList(vertex);
	}
	
	public void addEdge(int start,int end)
	{
		graph[start][end]=1;
		graph[end][start]=1;
		l1.addNode(start, end);
		l1.addNode(end, start);
	}
	public void display1()
	{
		l1.display();
	}
	public void display()
	{
		System.out.println("Array ----->");
		for(int i=0;i<vertex;i++)
		{
			
			for(int j=0;j<vertex;j++)
				System.out.print(" "+graph[i][j]);
			System.out.println();
		}
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Graph g=new Graph(6);
		g.addEdge(0,1);
		g.addEdge(0,4);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(4,5);
		g.addEdge(3,5);
		System.out.println("--------Matrix----------");
		g.display();
		System.out.println("--------List----------");
		g.display1();
	}
}
