//right sided triangle star pattern in java
/* 
       *
	  **
     ***
    ****
   *****
*/
public class RSstarpattern
{
	public static void main(String[] args)
	{											//increasing > j= i to n
		int n=5;								//decreasing > j= i to n
		for(int i=1;i<=5;i++){					//rs > 1 to i
			for(int j=i;j<=5;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}