package recursion;
public class Printnum {
	void forward(int n) {
		if(n<1) {
			return;
		}
		System.out.print(n+" ");
		forward(n-1);
	}
	public static void main(String[] args) {
		Printnum p=new Printnum();
		p.forward(10);
	}
}
