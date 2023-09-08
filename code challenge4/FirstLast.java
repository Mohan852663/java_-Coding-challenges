// 7.Java program to remove the first and last character of the given String

//Write a Java Program to Remove first and last character of a string in Java
class FirstLast
{
	public static String removeFirstandLast(String str)
	{
		// Removing first and last character
		// of a string using substring() method
		str = str.substring(1, str.length() - 1);
		// Return the modified string
		return str;
	}
	
	public static void main(String args[])
	{
		// Given String str
		String str = "Inmakes Learning Hub";

		// Print the removed string
		System.out.print(removeFirstandLast(str));
	}
}
