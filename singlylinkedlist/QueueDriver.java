package singlylinkedlist;

public class QueueDriver {
	public static void main(String[] args) {
		QueueLL ql=new QueueLL();
		ql.enqueue(10);
		ql.enqueue(20);
		ql.enqueue(30);
		ql.enqueue(40);
		int val=ql.poll();
		System.out.println((val==Integer.MIN_VALUE)?"Underflow":val);
		val=ql.poll();
		System.out.println((val==Integer.MIN_VALUE)?"Underflow":val);
		val=ql.poll();
		System.out.println((val==Integer.MIN_VALUE)?"Underflow":val);
		val=ql.poll();
		System.out.println((val==Integer.MIN_VALUE)?"Underflow":val);
		val=ql.poll();
		System.out.println((val==Integer.MIN_VALUE)?"Underflow":val);
		val=ql.poll();
		System.out.println((val==Integer.MIN_VALUE)?"Underflow":val);
	}
}
