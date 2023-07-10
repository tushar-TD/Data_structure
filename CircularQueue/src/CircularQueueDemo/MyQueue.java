package CircularQueueDemo;

public class MyQueue {
	int size,rear,front;
	int arr[];
	public MyQueue(int size)
	{
		this.size=size;
		this.front=this.rear=-1;
		arr=new int[size];
	}
	public boolean isEmpty()
	{
		if(rear==front && rear!=0)
			return true;
		else
			return false;
	}
	public boolean isFull()
	{
		if((rear+1)%size==front)
			return true;
		else
			return false;
	}
	public void enQueue(int ele)
	{
		if(!isFull())
		{
			if(front==-1)
				front=0;
			rear=(rear+1)%size;
			arr[rear]=ele;
		}
		else
			System.out.println("--------------Queue is Full-------------");
		System.out.println("----After Enqueue----");
		System.out.println("front="+front);
		System.out.println("rear="+rear);
	}
	public int deQueue()
	{
		int ele=-9999;
		if(!isEmpty())
		{
			ele=arr[front];
			if(front==rear)
				front=rear=-1;
			else
				front=(front+1)%size;
		}
		System.out.println("front= "+front);
		System.out.println("rear= "+rear);
		return ele;
	}
	public void display()
	{
		int i;
		System.out.println("<---");
		for(i=front;i!=rear;i=(i+1)%size)
			System.out.print(" "+arr[i]);
		if(i==rear)
			System.out.print(" "+arr[i]);
		System.out.println();
		System.out.println("--->");
	}

}
