package Integer;

public class Node {
		 Node prev;
		 Node next;
		 int data;
		public Node(int data)
		{
			this.data=data;
			prev=next=null;
		}
		public Node getPrev() {
			return prev;
		}
		public void setPrev(Node prev) {
			this.prev = prev;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		@Override
		public String toString() {
			return ""+data+" ";
		}
		

	}



