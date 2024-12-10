/*
 Fill in the blanks with code so that the program accepts two string values as the input. The program
must print YES if both the string values are equal (ignoring the case). Else the program must
print NO as the output.
Example Input/Output 1:
Input:
laptop
LAPTOP
Output:
YES
Example Input/Output 2:
Input:
Fruit
Juice
Output:
NO
 */

import java.util.Scanner;

public class StringCompareIgnoreCase {
    public static void main(AbbrevationMatching[] args) {
 Scanner sc = new Scanner(System.in);
 AbbrevationMatching str1 = sc.nextLine();
 AbbrevationMatching str2 = sc.nextLine();
 if (str1.equalsIgnoreCase(str2) ) {
 System.out.print("YES");
 }
 else {
 System.out.print("NO");
 }
 }
}
