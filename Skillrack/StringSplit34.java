/*
 String - Split
Let a String contain only alphabets. If we need to print all the vowels or consonants in it, we can use
split method of String.
The split method accepts a regular expression as input.
The below program prints all the consonants in a String (that is alphabets other than vowels)
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String input = sc.nextLine();
 String[] arr = input.split("[aeiouAEIOU]");
 for (String str : arr) {
 System.out.print(str);
 }
 }
}
ProgramID- 30 SKILLRACK
String split - Print only the vowels.
In the below Java program, print only the vowels in the input String.
Hint: Use the regular expression [^aeiouAEIOU] in the String's split method.
The ^ symbol means other than the following pattern.
Example Input/Output:
If the input is MYnamEisBILLa the output should be aEiIa
 */
package Skillrack;

import java.util.Scanner;

public class StringSplit34 {
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        AbbrevationMatching input = sc.nextLine();
        //Your Code Here
        AbbrevationMatching esh[] = input.split("[^aeiouAEIOU]");
        for(AbbrevationMatching eswari : esh)
        {
            System.out.print(eswari);
        }
    }
}
