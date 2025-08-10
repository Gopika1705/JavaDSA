package singlylinkedlist;

public class QueueLL {
	Node front=null;
	Node tail=null;
	void enqueue(int data) {
		Node newnode=new Node(data);
		if(front==null && tail==null) {
			front=newnode;
			tail=newnode;
			return;
		}
		tail.next=newnode;
		tail=newnode;
}
int poll(){
	if(front==null) {
		return Integer.MIN_VALUE;
	}
	int ret=front.data;
	if(front==tail) {
		front=tail=null;
		return ret;
	}
	front=front.next;
	return ret;
}
}