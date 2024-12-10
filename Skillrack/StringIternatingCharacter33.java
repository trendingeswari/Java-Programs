/*
 String - Iterating characters
The below program iterates over characters in the input String and prints only the digits (0-9).
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String input = sc.nextLine();
 char[] characters = input.toCharArray();
 for (char ch : characters) {
 if (Character.isDigit(ch)) {
 System.out.print(ch);
 }
 }
 }
}
ProgramID- 29 SKILLRACK
String - Count the number digits.
In the below Java program, count the number of digits (0-9) in the input String.
Hint: Use Character.isDigit(ch) when iterating the characters and if the character is a number digit(0-9) 
increment the counter.
Finally print the value of the counter.
Example Input/Output:
If the input is ui47y9ji the output should be 3 (as there are three number digits 4,7,9)
 */

import java.util.Scanner;

public class StringIternatingCharacter33 {
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        AbbrevationMatching input = sc.nextLine();
        char[] characters = input.toCharArray();
        int counter=0;
        for(char esh : characters)
        {
            if(Character.isDigit(esh))
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
