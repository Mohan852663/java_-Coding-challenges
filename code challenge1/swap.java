//swap to number without assign a third variable
public class swap{
	public static void main(String []args){
		int a=6,b=8;
		System.out.println("before a="+a +"b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after a="+a + "b="+b);
	}
}