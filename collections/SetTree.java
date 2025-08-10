package collections;
import java.util.TreeSet;
public class SetTree {
	public static void main(String[] args) {
		TreeSet<String> s=new TreeSet<>();
		s.add("Aravindh");
		s.add("Balaji");
		s.add("Aravindh");
		s.add("Surendhar");
		s.add("Abdhul");
		System.out.println(s);
		System.out.println(s.remove("Surendhar"));
		System.out.println(s);
	}
}

