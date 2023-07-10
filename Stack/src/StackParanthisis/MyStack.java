package StackParanthisis;

public class MyStack {
		int arr[];
		int size,top;
		public MyStack(int size)
		{
			this.size=size;
			this.top=-1;
			arr=new int[size];
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
		public void push(int ele) {
			if(isFull())
				System.out.println("Stack is Full.");
			else
				arr[++top]=ele;
		}
		public int pop() {
			int ele=-9999;
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

