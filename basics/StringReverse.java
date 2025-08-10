package basics;

public class StringReverse {
	public static void main(String [] args) {
		String a="Abinaya";
		String b=" ";
		for(int i=a.length()-1;i>=0;i--) {
			b+=a.charAt(i);
		}
		System.out.println(b);
	}
}
// for(int i=0;i<arr.length-1;i++){
//char ch=st.charAt();
//res=ch+res;