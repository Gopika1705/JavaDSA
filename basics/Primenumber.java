package basics;
import java.util.Scanner;
public class Primenumber {
		static boolean isPrime(int num) {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					return false;
				}
		    }
			return true;
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int n=sc.nextInt();
			int num=2;
			while(n!=0) {
				if(isPrime(num)) {
					n--;
					// or while(n!=0){
					// if(isPrime(num)){
					// n--;
					// if(n==0){
					//break;
					//}
				}
				num++;
			}
			System.out.println(--num);
			
		}
}
