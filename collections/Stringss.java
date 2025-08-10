package collections;

public class Stringss {
	 public static void main(String[] args) {
         String input = "Hello World";

         // Convert input to lowercase and remove non-letter characters
         input = input.toLowerCase();

         // Array to hold frequencies of letters a-z
         int[] freq = new int[26];

         for (int i = 0; i < input.length(); i++) {
             char c = input.charAt(i);
             if (c >= 'a' && c <= 'z') {
                 freq[c - 'a']++;
             }
         }

         // Print the frequencies
         for (int i = 0; i < 26; i++) {
             if (freq[i] > 0) {
                 System.out.println((char)(i + 'a') + ": " + freq[i]);
             }
         }
}
}


