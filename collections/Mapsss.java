package collections;
import java.util.HashMap;
public class Mapsss {
	public static void main(String[] args) {
        HashMap<Integer,String> s=new HashMap<>();
        s.put(22,"Mercy");
        s.put(18,"Chithrida");
        s.put(4,"Alagu");
        s.put(1, "Adithya");
        s.put(4,"Alagu Kailash");
        System.out.println(s);
        System.out.println(s.get(1));
        System.out.println(s.get(28));
        System.out.println(s.getOrDefault(18,"Not Available"));
        System.out.println(s.getOrDefault(28,"Not Available"));
        System.out.println(s.keySet());
        System.out.println(s.values());

}
}
