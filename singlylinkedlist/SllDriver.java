package singlylinkedlist;

public class SllDriver {
	public static void main(String[] args) {
		SinglyLL sll=new SinglyLL();
		sll.display();
		sll.inBegin(25);
		sll.inBegin(5);
		sll.display();
		sll.atEnd(7);
		sll.display();
		sll.inPos(10,2);
		sll.display();
		sll.delete(20);
		sll.display();
		sll.atPos(3);
		sll.display();
		
	}
}
