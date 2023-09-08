//palindrome checking program in java
public class palindrome{
	public static void main(String []args){
		int num=123421; 
		int rev=0;
		int org_num= num;
		
		while(num!=0){
			rev =rev*10 + num%10;
			num =num/10;
		}
		if(org_num==rev){
			System.out.println("given integer is palindrome");
		}
		else{
			System.out.println("given integer is not a palindrome");
		}
	}
}