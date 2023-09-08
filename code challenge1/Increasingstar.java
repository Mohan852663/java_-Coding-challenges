//increasing star pattern in java
/*
	*
	**
	***
	****
	*****
*/
public class Increasingstar
{
	public static void main(String[]args)
	{
		int n=5;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){				//increasing 1 to i
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}