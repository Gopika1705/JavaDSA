package basics;
public class Case {
	public static void main(String[] args) {
		String str="AbiNaYa Is a GooD GiRl";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90) {
				ch=(char)(ch+32);
				System.out.print(ch);
			}
			else {
				ch=(char)(ch-32);
				System.out.print(ch);
			}
		}
	}
}
