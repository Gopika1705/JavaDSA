package doublylinkedlist;
class DoubleNode {
	int data;
	DoubleNode prev;
	DoubleNode next;
}
class process extends DoubleNode{
	DoubleNode head;
	DoubleNode tail;
	void insertBegin(int data) {
		DoubleNode newnode=new DoubleNode();
		newnode.data=data;
		newnode.next=null;
		newnode.prev=null;
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		else {
			 head.prev=newnode;
			 newnode.next=head;
			 head=newnode;
		}
	}
	void insertEnd(int data) {
		DoubleNode newnode=new DoubleNode();
		newnode.data=data;
		newnode.next=null;
		newnode.prev=null;
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		else {
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
		}
	}
	void insertPos(int data,int Pos) {
		DoubleNode newnode=new DoubleNode();
		newnode.data=data;
		newnode.next=null;
		newnode.prev=null;
		if(Pos==0) {
			insertBegin(data);
		}
		else {
			DoubleNode current=head;
			for(int i=1;i<=Pos-1;i++) {
				current=current.next;
			}
			current.next.prev=newnode;
			newnode.next=current.next;
			current.next=newnode;
		    newnode.prev=current;
			
		}
	}
	void deleteBegin() {
		DoubleNode temp=head;
		if(head==null) {
			System.out.println("Empty Linked List");
		}
		else {
			temp.next.prev=null;
			head=head.next;
		}
	}
	void deleteEnd() {
		DoubleNode temp=head;
		if(head==null) {
			System.out.println("Empty Linked List");
		}
		else {
			tail=tail.prev;
			tail.next.prev=null;
			tail.next=null;
			}
			
		}
	void deletePos(int Pos) {
		DoubleNode temp=head;
		DoubleNode pre=null;
		if(head==null) {
			System.out.println("Empty Liked List");
		}
		else {
			for(int i=1;i<=Pos;i++) {
				pre=temp;
				temp=temp.next;
			}
			temp.next.prev=pre;
			pre.next=temp.next;
			temp.next=null;
			temp.prev=null;		
		}
	}
	void search(int key) {
		DoubleNode temp=head;
		int pos=0;
		boolean found=false;
		while(temp!=null) {
			if(temp.data==key) {
				System.out.println("Element"+key+"found at position");
				found=true;
				break;
			}
			temp=temp.next;
			pos++;
		}
		if(!found) {
			System.out.println("Element"+key+"not found in the position");
		}
	}
		
	void display() {
		DoubleNode temp=new DoubleNode();
		temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void revdisplay() {
		DoubleNode temp=new DoubleNode();
		temp=tail;
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.prev;
		}
	}
}

public class Node extends process{
	public static void main(String[] args) {
		Node n=new Node();
		n.insertBegin(1);
		n.insertBegin(2);
		n.insertBegin(3);
		n.display();
		n.insertPos(5,1);
		n.display();
		n.deletePos(1);
		n.display();		
	}
}
