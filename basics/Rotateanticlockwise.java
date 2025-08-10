package basics;
import java.util.Scanner;
import java.util.Arrays;
public class Rotateanticlockwise {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		System.out.println("Enter number of rotations:");
		int n=sc.nextInt();
		for(int r=0;r<n;r++) {
			int temp=arr[0];
			for(int i=0;i<arr.length-1;i++) {
			     arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
			}
		System.out.println(Arrays.toString(arr));
		}
		
	}

