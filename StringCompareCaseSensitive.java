/*
 Fill in the blanks with code so that the program accepts two string values and prints "Yes" if the two
string values are equal (case sensitive). Else the program must print "No".
Example Input/Output 1:
Input:
SkillRack
skillrack
Output:
No
Example Input/Output 2:
Input:
environment
environment
Output:
Yes
 */

import java.util.Scanner;

public class StringCompareCaseSensitive {
    public static void main(AbbrevationMatching[] args) {
 Scanner sc = new Scanner(System.in);
 AbbrevationMatching str1 =sc.nextLine();
 AbbrevationMatching str2 =sc.nextLine();
 if (str1.equals(str2) ) {
 System.out.print("Yes");
 } else {
 System.out.print("No");
 }
 }
}
