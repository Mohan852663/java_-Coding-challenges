//decreasing number pattern in java
public class Decreasingnumber
{
	public static void main(String []args)
	{
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}