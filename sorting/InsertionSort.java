package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
	void insertionSort(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
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
	    InsertionSort sorter = new InsertionSort();
	    sorter.insertionSort(arr);
	    System.out.println(Arrays.toString(arr));
	}	
}
