package queueArray;

public class QueueDriver {
	public static void main(String[] args) {
		QueueusingArray qa=new QueueusingArray();
		String res=qa.poll();
		System.out.println((res==null)?"Underflow":res);
		qa.add("Aravind");
		qa.add("Adithya Varma");
		qa.add("Surendar");
		qa.add("Ashwin");
		qa.add("Abdul");
		qa.add("Shreyas");
		res=qa.poll();
		System.out.println((res==null)?"Underflow":res);
		res=qa.poll();
		System.out.println((res==null)?"Underflow":res);
		res=qa.poll();
		System.out.println((res==null)?"Underflow":res);
		res=qa.poll();
		System.out.println((res==null)?"Underflow":res);
		res=qa.poll();
		System.out.println((res==null)?"Underflow":res);
		
		
	}
}
