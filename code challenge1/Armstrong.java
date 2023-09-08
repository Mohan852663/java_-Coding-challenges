//java program to chech the number is armstrong or not
public class Armstrong{
	public static void main(String[]args){
		int num=370;
		int temp=0;
		int check=0;
		int org_num=num;
		while(num>0){
			temp=num%10;
			check=check+(temp*temp*temp);
			num=num/10;
		}
		if(org_num==check){
			System.out.println("its a Armstrong number");
		}
		else{
			System.out.println("its not a Armstrong");
		}
	}
}
/* armstrong means cubic value of the each number 

370 = 3cube  7cube  0cube > 27 + 343 + 0 >  370

temp=num%10;
check= check+(temp*3);
num=num/10; 
*/