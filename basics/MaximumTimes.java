package basics;

import java.util.Arrays;

public class MaximumTimes {
	public static void main(String[] args) {
	int n=98455;
	int arr[] =new int[10];
	while(n!=0) {
		int rem=n%10;
		arr[rem]++;
		n=n/10;
	}
	System.out.println(Arrays.toString(arr));
	int max =arr[0];
	int ind=0;
	for(int i=1;i<arr.length;i++) {
		if(max<=arr[i]) {
			max=arr[i];
		}
	}
	System.out.println("Value Occured "+max+"times");
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==max) {
			System.out.println(i);
		}
	}
	
}
}