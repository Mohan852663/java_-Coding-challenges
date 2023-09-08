//star pyamid pattern
public class starpattern
{
	public static void main(String[]args)
	{
		int n=5;
		for(int i=1;i<=n;i++){			//outer loop determines the row
			for(int j=1;j<=n;j++){		//inner loopm ditermines the column
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}