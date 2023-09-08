//6 Java Program to Remove a Given Word from a String

// Java Program to Remove a Given Word From a String
 
// Importing input output classes
import java.io.*;
 
// Main class
class RemoveString
{
 
    // Main driver method
    public static void main(String[] args)
    {
        String str = "The Inmakes Learning Hub";
        // Desired word to be removed
        String word = "the";
        // Replace all words by "" string
        // using replaceAll() method
        str = str.replaceAll("The", "");
 
        // Trim the string using trim() method
        str = str.trim();
 
        // Printing the final string
        System.out.print(str);
    }
}