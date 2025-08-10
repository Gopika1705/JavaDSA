package collections;
import java.util.HashSet;
public class HashProgram {
	public static void main(String[] args) {
        HashSet<String> s=new HashSet<>();
        s.add("Aravindh");
        s.add("Aravindh");
        s.add("Aravindh");
        s.add("Aravindh");
        s.add("Aravindh");
        System.out.println(s);
        System.out.println(s.remove("Surendhar"));
        System.out.println(s);
}
}
