// 2. Write a program to convert Given String onto uppercase and lowercase without using String Method
// Java Program to demonstrate
// Conversion of String from lowercase
// to uppercase without using
// built-in String functions

public class LowerUpperDemo {
        public static void main(String args[]) {
                String input = "INMAKES LEARNING HUB";
                System.out.println("Lower case string is : " + input);
                char newarray[] = input.toCharArray();
                for (int i = 0; i < newarray.length; i++) {
                        // here is the actual logic
                        if (newarray[i] >= 'A' && newarray[i] <= 'Z') {
                                newarray[i] = (char) ((int) newarray[i] + 32);
                        }
                }
                System.out.print("Upper case string is : ");
                // print the string array
                for (int i = 0; i < newarray.length; i++) {
                        System.out.print(newarray[i]);
                }
        }
}