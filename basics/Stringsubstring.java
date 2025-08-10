package basics;

import java.util.Arrays;

public class Stringsubstring {
	String rev(String st) {
		String res="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			res=ch+res;
		}
		return res;
	}
	String revLastWord(String st) {
		int i;
		char ch;
		for(i=st.length()-1;i>=0;i--) {
			ch=st.charAt(i);
			if(ch==' ') {
				break;
			}
		}
		String s=st.substring(0,i)+" "+rev(st.substring(i+1));
		return s;
	}
	public static void main(String[] args) {
		String st="Java is a good programming language";
		Stringsubstring r=new Stringsubstring();
		System.out.println(r.revLastWord(st));
	}
}
