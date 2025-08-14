package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
	void BubbleSort(int arr[]) {
		boolean swap=true;
		while(swap) {
			swap=false;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					swap=true;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	    BubbleSort sorter = new BubbleSort();
	    sorter.BubbleSort(arr);
	    System.out.println(Arrays.toString(arr));
	}	
}
