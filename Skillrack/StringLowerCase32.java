/*
 String - Introduction
String is a sequence of characters.
The below program declares a String variable and assigns a value "Life is beautiful" to it.
public class Hello {
 public static void main(String[] args) {
 String str="Life is beautiful";
 }//end of main method
}//end of class
As String is a very important Class and widely used in Java, please read the String API documentation.
We see that there is a method called toUpperCase in the API documentation.
Let us use the same to convert the above String to upper case as in the program below.
public class Hello {
 public static void main(String[] args) {
 String str="Life is beautiful";
 System.out.println(str.toUpperCase());
 }//end of main method
}//end of class
The output will be "LIFE IS BEAUTIFUL"
ProgramID- 28 SKILLRACK
String - Lower case
In the below Java program, convert the first input to lower case and print the same.
Hint: Use the method toLowerCase()

to learn string : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 */

import java.util.Scanner;

public class StringLowerCase32 {
     public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        AbbrevationMatching firstInput = sc.nextLine();
        System.out.println(firstInput.toLowerCase());

    }
}
