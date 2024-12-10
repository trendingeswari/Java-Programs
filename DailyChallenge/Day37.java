/*
Length of Largest Substring


The program must accept a string S containing only alphabets as the input. The program must print the length of the longest alternating "sr" substring.
Note: At least one substring "sr" is always present in the string S.
Boundary Condition(s):
2 <= Length of S <= 100
Input Format:
The first line contains S.
Output Format:
The first line contains the length of the longest alternating "sr" substring.

Example Input/Output 1:
Input:
sksrillsrsrsrsrsrskillrack
Output:
10
Explanation:
In the given string "sksrillsrsrsrsrsrskillrack", the longest substring sr is srsrsrsrsr. So the length of the longest substring is 10.
Hence the output is 10
Example Input/Output 2:
Input:
SrsrsrAsrsrBsrcsrdsr
Output:
4
Example Input/Output 3:
Input:
CLsrOUSAD
Output:
2
 */
import java.util.Scanner;

public class Day37 {
     public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String to_chk = "srsr";
	int len = 2;
	while(true)
	{ if(str.contains(to_chk))
	  { to_chk += "sr";
	    len += 2;
	  }
	  else
	  { break;}
	}  
	System.out.print(len);
    sc.close();
	}
}
