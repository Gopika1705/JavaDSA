package basics;
import java.util.Arrays;
public class Uniqueelements {
	public static void main(String[] args) {
		int arr[]= {5,7,12,11,10,9,7,12,7,1,1};
		int res[]=new int[arr.length];
		int ind=0;
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]!=arr[i-1]&&arr[i]!=arr[i+1]) {
				res[ind++]=arr[i];
			}
		}
		if(arr[arr.length-1]!=arr[arr.length-2]) {
				res[ind++]=arr[arr.length-1];
		}
		for(int i=0;i<ind;i++) {
			System.out.print(res[i]+" ");
		}
		System.out.println("\n"+ind+" Unique elements are there");
	
		}
		
	}

