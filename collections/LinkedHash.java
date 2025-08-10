package collections;
import java.util.LinkedHashSet;
public class LinkedHash {
	 public static void main(String[] args) {
	        LinkedHashSet<String> s=new LinkedHashSet<>();
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