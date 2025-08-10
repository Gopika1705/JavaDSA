package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class PracticeArray {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(30);
		System.out.println(al);
		al.remove(5);
		System.out.println(al);
		al.addFirst(90);
		System.out.println(al);
		al.set(3, -10);
		System.out.println(al);
		
		//Iterating list
		System.out.println(al.get(3));
		
		//By enhanced for loop
		for(Integer i:al) {
			System.out.println(i);
		}
		
		//Classical for loop
		System.out.println("Iterating by index");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		//Iterator class
		System.out.println("By Iterator class");
        Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		//lambda
		System.out.println("For each loop");
		al.forEach(num -> System.out.println(num));
				
	}
}
