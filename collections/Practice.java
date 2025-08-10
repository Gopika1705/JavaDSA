package collections;

public class Practice {
	public static void main(String[] args) {
		//autoboxing
		int num=121;                       //Primitive
		Integer n=num;                     //Wrapping up the Primitive to NonPrimitive
		String st=Integer.toString(n);
		
		//unboxing
		Integer ret=Integer.parseInt(st);
		int res=ret.intValue();
		System.out.println(res);
	}

}
