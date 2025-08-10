package collections;
import java.util.*;
public class FreqOfCharacters {
	 public static void main(String[] args) {
         String st = "Gopika";
         Map<Character, Integer> freqMap = new HashMap<>();
         for (char ch : st.toCharArray()) {
             freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
         }
         System.out.println("Uppercase letters:");
         for (char ch = 'A'; ch <= 'Z'; ch++) {
             if (freqMap.containsKey(ch)) {
                 System.out.println(ch + " : " + freqMap.get(ch));
             }
         }           
         System.out.println("\nLowercase letters:");
         for (char ch = 'a'; ch <= 'z'; ch++) {
             if (freqMap.containsKey(ch)) {
                 System.out.println(ch + " : " + freqMap.get(ch));
             }
         }

         }
    
}


	
