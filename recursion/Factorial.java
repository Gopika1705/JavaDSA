package recursion;
public class Factorial {
	int loop(int num) {
		int fact=1;
		for(int i=2;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	int rec(int num) {
		if(num==1 || num==0) {
			return 1;
		}
		return num*rec(num-1);
	}
	public static void main(String[] args) {
		Factorial f=new Factorial();
		int num=5;
		System.out.println("By Loop: "+f.loop(num));
		System.out.println("By recursion: "+f.rec(num));
	}
}
