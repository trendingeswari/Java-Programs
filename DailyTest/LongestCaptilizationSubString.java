/*
 The program must accept a string S containing only alphabets as the input. The program must print
the longest substring of minimum length 2 in S which contains the first alphabet in upper case and the
remaining alphabets in lower case. If more than one such substrings have occurred in S, the program
must print the first occurring substring as the output. If there is no such substring, the program must
print -1 as the output.
Boundary Condition(s):
3 <= Length of S <= 100
Input Format:
The first line contains S.
Output Format:
The first line contains the longest substring or -1 as per the given conditions.
Example Input/Output 1:
Input:
ThisIsSkillRack
Output:
Skill
Explanation:
The longest substring which contains the first alphabet in upper case and the remaining alphabets in
lower case is Skill.
Hence the output is Skill
Example Input/Output 2:
Input:
abcDeFghiJklMnopQrst
Output:
Fghi
Example Input/Output 3:
Input:
skillRACK
Output:
-1
 */

import java.util.Scanner;

public class LongestCaptilizationSubString {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s[] = sc.nextLine().split("(?=[A-Z])"),p="-1";
int len = 2;
sc.close();
for(String t:s) {
 if(t.length()>len && t.charAt(0)<97) {
 len = t.length();
 p = t;
 }
}
System.out.print(p);
}
}
