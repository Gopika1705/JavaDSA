package recursion;
public class Factors {
	    public static void Fact(int num, int i) {
	       if (num % i == 0) {
	            System.out.print(i+" "); 
	        }
	        if (i > num) {
	            return;      
	        }
	        Fact(num, i + 1);  
	    }
	    public static void main(String[] args) {
	        int num= 12;
	        System.out.print("Factors of " + num + ": ");
	        Fact(num, 1);
	    }
	}

