//program for reverse a number
public class reversenumber{
	public static void main(String[]args){
		int num=12345,rev=0; 
		while(num!=0){
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("reverse of a given number is:"+rev);	
		}
}