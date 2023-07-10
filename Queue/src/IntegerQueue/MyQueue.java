package IntegerQueue;


public class MyQueue {
	int size;
	int front,rear;
	int arr[];
	public MyQueue(int size)
	{
		this.size=size;
		front=rear=-1;
		arr=new int[size];
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
		if(isFull())
			throw new QueueException("Queue is Full");
		else
		{
			if(front==-1)
				front=0;
		//	rear++;
			arr[++rear]=ele;
		}
	}
	public int deQueue()
	{
		int ele;
		if(isEmpty())
			throw new QueueException("Queue is Empty");
		ele=arr[front];
		if(front==rear)
			front=rear=-1;
		else
			front++;
		return ele;
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
