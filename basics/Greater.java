package basics;
public class Greater {
	public static void main(String[] args) {
		        int n=120;
		        int max=0;
		        while(n!=0){
		            int rem=n%10;
		            if(max<rem){
		                max=rem;
		            }
		            n=n/10;
		        }
		        System.out.println("max "+max);
			}		
}

