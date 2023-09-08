// Java program to count the number
// of occurrence of a word in
// the given string
import java.io.*;

class CountString{

static int countofString(String str, String word)
{
	// split the string by spaces in a
	String a[] = str.split(" ");

	// search for pattern in a
	int count = 0;
	for (int i = 0; i < a.length; i++)
	{
	// if match found increase count
	if (word.equals(a[i]))
		count++;
	}

	return count;
}


public static void main(String args[])
{
	String str = " inmakes infotech learning hub ";
	String word = "hub";
	System.out.println(countofString(str, word));
}
}

