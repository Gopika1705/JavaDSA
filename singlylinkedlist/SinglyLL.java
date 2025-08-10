package singlylinkedlist;
public class SinglyLL {
	Node head=null;
	
	//insert in beginning
	void inBegin(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	//insert at end
	void atEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
	}
	
	
	//at position
	void inPos(int data,int pos) {
		if(head==null || pos==0) {
			if(pos==0) {
				inBegin(data);
				return;
			}
			System.out.println(pos+" Index out of bound");
			return;
		}
		Node current=head;
		int cp=1;
		while(current!=null) {
			if(cp==pos) {
				Node newNode=new Node(data);
				newNode.next=current.next;
				current.next=newNode;
				return;
			}
			current=current.next;
			cp++;
		}
		System.out.println("Index Out of Bound");
	}
	//delete at position
	void atPos(int Pos) {
		if(head==null) {
			System.out.println("Empty linked list");
			return;
		}
		if(Pos==0) {
			head=head.next;
			return;
		}
		Node current=head;
		int cp=1;
		while(current.next!=null) {
			if(cp==Pos) {
			current.next=current.next.next;
		}
		current=current.next;
		cp++;
		}
	}
	//delete by value
	void delete(int val) {
		if(head==null) {
			System.out.println("Empty Linked List");
			return;
		}
		if(head.data==val) {
			head=head.next;
			return;
		}
		Node current=head;
		while(current.next!=null && current.next.data!=val) {
			current=current.next;
		}
		if(current.next!=null && current.next.data==val) {
			current.next=current.next.next;
			return;
		}
		System.out.println(val+" is not in the list");
		
	}
	//Searching
	void search(int val) {
		if(head==null) {
			System.out.println("Linked List is empty");
			return;
		}
		Node current=head;
		int pos=0;
		while(current!=null) {
			if(current.data==val) {
				   System.out.println(val+" in the position: "+pos);
		           return;
		       }
		       pos++;
		   }
		}
	//Sorting LL by bubble Sort
		void bubbleSort() {
			if(head==null) {
				return;
			}
			Node current=head;
			boolean flag=true;
			while(flag) {
				flag=false;
				while(current.next!=null) {
					if(current.data>current.next.data) {
						int temp=current.data;
						current.data=current.next.data;
						current.next.data=temp;
						flag=true;
					}
					current=current.next;
				}
				current=head;
			}
		}


	//print element
	void display() {
		if(head==null) {
			System.out.println("Empty Linked List");
		    return;
		}
		Node current=head;
		while(current.next!=null) {
			System.out.print(current.data+"--->");
			current=current.next;
		}
		System.out.println(current.data);	
	}
}
