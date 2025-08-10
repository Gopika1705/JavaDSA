package stackArray;
public class StackDriver {
	public static void main(String[] args) {
		StackusingArray st=new StackusingArray();
		System.out.println(st.capacity);
		st.push("Aravind");
		st.push("Adithya Varma");
		st.push("Surendar");
		st.push("Ashwin");
		st.push("Abdul");
		st.push("Dharshan");
		System.out.println((st.peek()==null)?"Underflow":st.peek());
		String res=st.pop();
		System.out.println((res==null)?"Underflow":res);
		res=st.pop();
		System.out.println((res==null)?"Underflow":res);
		
	}
}
