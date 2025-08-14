package sorting;
import java.util.Scanner;
import java.util.Arrays;
public class SelectionSort {
	void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
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
	    SelectionSort sorter = new SelectionSort();
	    sorter.selectionSort(arr);
	    System.out.println(Arrays.toString(arr));
	}	
}
