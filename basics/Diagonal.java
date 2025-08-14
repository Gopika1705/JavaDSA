package basics;
import java.util.Scanner;
import java.util.Arrays;
public class Diagonal {
	boolean diagonalCheck(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if((i==j&&arr[i][j]!=1)||(i!=j)&&arr[i][j]!=0){
					return false;
			}
		}
	}
	return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]={{1,0,0,0},
				   {0,1,0,0},
				   {0,0,1,0},
				   {0,0,0,1}};	
		Diagonal r=new Diagonal();
		if(r.diagonalCheck(arr)) {
			System.out.println("Diagonal Elements");
		}
		else {
			System.out.println("No Diagonal Elements");
		}
	}
}
