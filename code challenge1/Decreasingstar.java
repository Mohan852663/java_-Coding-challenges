//decreasing star pattern program
/*
	*****
	****
	***
	**
	*
*/
public class Decreasingstar
{
	public static void main(String[]args){
	int n=5;
	for(int i=1;i<=n;i++){						//decreasing i to n
		for(int j=i;j<=n;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}