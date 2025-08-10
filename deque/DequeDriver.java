package deque;

import java.util.Arrays;

public class DequeDriver {
	public static void main(String[] args) {
		CircularDeque cq=new CircularDeque();
		cq.add("Alagu kailash");
		cq.add("adithya");
		cq.addFirst("Chithirida");
		cq.addFirst("Mercy");
		cq.add("Akshaya");
		cq.add("Adharsha");
		String data=cq.poll();
		System.out.println((data==null)?"Underflow":data);
		data=cq.pollLast();
		System.out.println((data==null)?"Underflow":data);
		data=cq.pollLast();
		System.out.println((data==null)?"Underflow":data);
		data=cq.pollLast();
		System.out.println((data==null)?"Underflow":data);
		data=cq.poll();
		System.out.println((data==null)?"Underflow":data);
		data=cq.poll();
		System.out.println((data==null)?"Underflow":data);
	
		
	}
}
