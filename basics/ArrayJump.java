package basics;
import java.util.Arrays;
public class ArrayJump {
	public static int minNoJumps(int len,int [] ar,int[] ra) {
		ra[0]=0;
		for(int i=0;i<len;i++) {
			for(int j=1;j<=ar[i] && i+j <len;j++) {
				ra[i+j]=Math.min(ra[i+j],ra[i]+1);
			}
		}
		if(ra[len-1]==Integer.MAX_VALUE) {
			return -1;
		}
		return ra[len-1];
	}
	public static void main(String[] args) {
		int arr[]= {3,2,5,1,2,1,1};
		int n=arr.length;
		int ra[]=new int[n];
		Arrays.fill(ra ,Integer.MAX_VALUE);
		int res=minNoJumps(n,arr,ra);
		System.out.println(res);
	}
}
