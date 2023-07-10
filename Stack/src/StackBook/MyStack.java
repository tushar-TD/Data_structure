package StackBook;

public class MyStack {
	Book arr[];
	int size,top;
	public MyStack(int size)
	{
		this.size=size;
		this.top=-1;
		arr=new Book[size];
	}
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if(top==size-1)
			return true;
		else
			return false;
	}
	public void push(Book ele) {
		if(isFull())
			System.out.println("Stack is Full.");
		else
			arr[++top]=ele;
	}
	public Book pop() {
		Book ele=null;
		if(!isEmpty())
			ele=arr[top--];
		return ele;
	}
	public void display() {
		if(!isEmpty())
		{
			for(int i=top;i>=0;i--)
				System.out.print(" "+arr[i]);
			System.out.println();
		}
	}

}

