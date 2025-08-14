package basics;
import java.util.Arrays;
import java.util.Scanner;
public class Twodarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int row=0;row<arr.length;row++) {
			System.out.print("Enter elements in the row "+row+":");
			for(int col=0;col<arr.length;col++) {
				arr[row][col]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
