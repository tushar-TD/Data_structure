package IntegerQueue;

public class QueueException extends RuntimeException {
	String msg;
	public QueueException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}

}
