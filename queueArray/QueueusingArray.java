package queueArray;
public class QueueusingArray {
	int capacity=5;
	int front=-1;
	int rear=-1;
	String q[]=new String[capacity];
	void add(String data) {
		if(rear==capacity) {
			System.out.println("Queue overflow");
			return;
		}
		if(rear==-1) {
			front=rear=0;
	    }
		q[rear++]=data;
		return;
}
	String poll() {
		if(front==-1) {
			return null;
		}
		String ret=q[front];
		if(front==rear) {
			front=rear=-1;
		}
		front++;
		return ret;
	}
}
