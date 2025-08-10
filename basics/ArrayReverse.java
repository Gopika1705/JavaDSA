package basics;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayReverse {
	public static void main(String[] args) {
		String row0[]= {"Mercy","Chithrida","Ajay","Sangeetha","Akshaya","Archana"};
			System.out.println(Arrays.toString(row0));
			String row1[]=new String[6];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter person name");
			for(int i=0;i<row1.length;i++) {
				row1[i]=sc.nextLine();
		}
			System.out.println(Arrays.toString(row1));
	}
}
