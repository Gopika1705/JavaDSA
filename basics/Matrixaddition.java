package basics;
import java.util.Arrays;
public class Matrixaddition {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int b[][]= {{3,2,1},
				{6,8,9},
				{2,9,4}};
		int res[][]=new int[a.length][a[0].length];
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				res[row][col]=a[row][col]+b[row][col];
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(Arrays.toString(res[i]));
		}
		
	}
}
