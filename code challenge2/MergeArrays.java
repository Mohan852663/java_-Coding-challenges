//3. write a java program for merge two arrays
import java.util.A;
public class MergeArrays
{
	public static void main(String[]args)
	{
		int[] a={12,45,30};
		int[] b={3,67,8,10};int p=0;
		int []c= new int [a.length + b.length];
		//for loop for a
		for(int i=0;i<a.length;i++)
		{
			c[p]=a[i];
			p++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[p]=b[i];
			p++;
		}
		System.out.println(Array.toString(c));
	}
}