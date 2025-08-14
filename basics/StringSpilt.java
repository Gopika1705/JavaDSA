package basics;
import java.util.Arrays;
public class StringSpilt {
	String rev(String st) {
		String res="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			res=ch+res;
		}
		return res;
	}
	String revWord(String st) {
		String stArr[]=st.split(" ");
		System.out.println(Arrays.toString(stArr));
		String ret="";
		for(String s:stArr) {
			ret=ret+rev(s)+" ";
		}
		return ret.trim();
	}
	public static void main(String[] args) {
		String st="Java Is a GooD Programming Language";
		StringSpilt r=new StringSpilt();
		System.out.println(r.revWord(st));
	}
}
