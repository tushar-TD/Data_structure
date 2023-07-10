package IntegerQueue;

public class FirstTenIntegerDemo {

	public static void main(String[] args) {
		MyQueue q=new MyQueue(10);
		for(int i=1;i<=10;i++)
		{
			q.enQueue(i);
		}
		q.display();

	}

}
