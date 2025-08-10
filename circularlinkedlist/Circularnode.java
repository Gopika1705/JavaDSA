package circularlinkedlist;
class cirNode{
	int data;
	cirNode next;
}
class code extends cirNode{
	cirNode head=null;
	void insertBegin(int data) {
		cirNode newnode=new cirNode();
		newnode.data=data;
		newnode.next=null;
		if(head==null) {
			head=newnode;
			newnode.next=head;
		}
		else {
			cirNode temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.next=head;
			head=newnode;
		}
	}
	void insertPos(int data,int Pos){
		cirNode temp=head;
		cirNode newNode=new cirNode();
		newNode.data=data;
		if(Pos==0) {
			insertBegin(data);
	
		}
		for(int i=1;i<Pos && temp.next!=head;i++) {
			temp=temp.next;
		}
		if(temp.next==head) {
			insertEnd(data);
		}else {
			newNode.next=temp.next;
			temp.next=newNode;
		}
	}
	void insertEnd(int data) {
		cirNode newNode=new cirNode();
		newNode.data=data;
		newNode.next=null;
		if(head==null) {
			head=newNode;
			newNode.next=head;
		}
		else {
			cirNode temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			newNode.next=head;
			temp.next=newNode;
		}
		
	}
	void deleteBegin() {
		if(head==null) {
			System.out.println("Empty linked list");
		}
		cirNode temp=head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		head=head.next;
		temp.next=head;
	}
	void deleteEnd() {
		if(head==null) {
			System.out.println("Empty linked list");
			return;
		}
		cirNode temp=head;
		while(temp.next.next!=head) {
			temp=temp.next;
		}temp.next=head;
	}
	void display() {
		cirNode temp=head;
		while(temp.next!=head) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print(temp.data+" ");
		System.out.println();
	
	}
}
public class Circularnode extends code{
	public static void main(String[] args) {
		Circularnode c1=new Circularnode();
		c1.insertBegin(1);
		c1.insertBegin(2);
		c1.insertBegin(3);
		c1.display();
		c1.insertEnd(6);
		c1.insertEnd(5);
		c1.display();
		c1.insertPos(4,3);
		c1.display();	
		c1.deleteBegin();
		c1.display();
		c1.deleteEnd();
		c1.display();
	}
}
