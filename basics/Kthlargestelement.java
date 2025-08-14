package basics;
import java.util.Arrays;
import java.util.Scanner;
public class Kthlargestelement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(arr[n-2]);
		
	}
}


