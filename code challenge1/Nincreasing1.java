//number pattern in java //increasing same number
public class Nincreasing1
{
	public static void main(String []args)
	{
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");   //just change the condiditon i to print
			}
			System.out.println();
		}
	}
}