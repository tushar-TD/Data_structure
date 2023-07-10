package AdvanceAssignment;

public class Demo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList(5);
		l.addNodeEnd(0, 1);
		l.addNodeEnd(0, 3);
		//l.addNodeEnd(1, 1);
		//l.addNodeEnd(1, 2);
		//l.addNodeEnd(2, 1);
		//l.addNodeEnd(2, 2);
		l.addNodeEnd(3, 2);
		//l.addNodeEnd(3, 3);
		l.addNodeEnd(4, 1);
		l.display();
		/*l.addNodeEnd(1, 0);
		l.addNodeEnd(2, 0);
		l.addNodeEnd(2, 3);
		l.addNodeEnd(3, 1);
		l.display();*/
		
	}
}
