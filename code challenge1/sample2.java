//swap
public class sample2
{
	public static void main(String[]args)
	{
		int a=4;
		int b=8;
		System.out.println("before the a :"+a + "before the b :"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after the a :"+a + "after the b :"+b);
	}
}