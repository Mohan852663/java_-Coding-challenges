//diamond pattern
public class Diamondpattern
{
	public static void main(String []args)
	{
		int n=5;
		// hill pattern for the top of the diamond
		for(int i=1;i<n;i++){						//condition changed into > i<=n to i<n
			for(int j=i;j<=n;j++){
				System.out.print("  ");
			}
			for(int j=1;j<i;j++){
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
			}
		//reverse hill pattern for the bottom of the diamond
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("  ");
			}
			for(int j=i;j<n;j++){
				System.out.print("* ");
			}
			for(int j=i;j<=n;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}