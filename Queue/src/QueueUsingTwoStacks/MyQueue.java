package QueueUsingTwoStacks;

public class MyQueue {
	MyStack s1,s2;
	int size;
	int front,rear;
	int arr[];
	public MyQueue(int size)
	{
		this.size=size;
		front=rear=-1;
		arr=new int[size];
		s1=new MyStack(size);
		s2=new MyStack(size);
	}
	public boolean isFull()
	{
		if(rear==size-1)
			return true;
		else
			return false;
	}
	public boolean isEmpty()
	{
		if(front==-1 && rear==-1)
			return true;
		else
			return false;
	}
	public void enQueue(int ele)
	{
		s1.push(ele);
	}
	public int deQueue()
	{
		if(isEmpty())
			throw new RuntimeException("Queue is Empty.");
		else if(s2.isEmpty())
		{
			while(!s1.isEmpty())
				s2.push(s1.pop());
		}
		return s2.pop();
	}
	public void display()
	{
		if(isEmpty())
			throw new QueueException("Can't Display As Queue is Empty");
		System.out.println("Queue===============>");
		for(int i=front;i<=rear;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
	}

}
