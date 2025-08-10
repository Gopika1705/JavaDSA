package collections;
import java.util.HashMap;
import java.util.Map;
public class Stringchar {
	public static void main(String[]args) {
        HashMap<Character,Integer> s=new HashMap<>();
        String st="Java is the best programminglanguage";
        for(char ch:st.toCharArray()) {
            s.put(ch,s.getOrDefault(ch, 0)+1);
        }
        System.out.println(s);
        
        for (char ch : s.keySet()) {
            if (s.get(ch) == 1) {
                System.out.print(ch+" ");
            }
        }
        System.out.println();
        int count=0;
        char mostRepeated='\0';
        for(char ch:s.keySet()) {
            if(count<s.get(ch)) {
                count=s.get(ch);
                mostRepeated=ch;
            }
        }
        System.out.println("Count:"+count);
        System.out.println("Most repeated :"+mostRepeated);

    }
}


