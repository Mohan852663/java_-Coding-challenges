// 5. Write a program to count number of vowels in a given String

public class  Vowels{

	public static void main(String[] args) {
		String s = "Inmakes Learning Hub";
		char[] c = s.toCharArray();			//conver to charArray
		int vowel=0;
		
		for (int i = 0; i < s.length(); i++)
		{ 
            if(s.charAt(i)=='a' 
			|| s.charAt(i)=='e' 
			|| s.charAt(i)=='i' 
			|| s.charAt(i)=='o' 
			|| s.charAt(i)=='u') 
                vowel++; 
		}
  
	System.out.println("Vowels: " + vowel);
    }
}