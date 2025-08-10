package collections;

public class PracticePalindrome {
	public static void main(String[] args) {
		int num=123;
		Integer n=num;
		String st=Integer.toString(n);
		StringBuilder sb=new StringBuilder(st);
		sb.reverse();
		String res=sb.toString();
	    System.out.println(num + (st.equals(res) ? " is a palindrome." : " is not a palindrome."));

	}
}
