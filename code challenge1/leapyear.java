//a given year is leap year or not
public class leapyear{
	public static void main(String[]args){
		int year=2020;
		//leap year has 366 days
		//if it is multiple of 400 or multiple of 4 but not  100
		if((year%400==0)||((year%4==0)&&(year%100!=0))){
			System.out.println("its a leap year");
		}
		else{
			System.out.println("its not a leap year");
		}
		
	}
}