/*
 Arithmetic Progression - Terms

The program must accept the first term F and the common difference D of an arithmetic progression
as the input. The program also accepts the four integer values N, T, X and Y as the input to the
program. The program must print the output based on the following conditions.
- In the first line, the program must print the N
th
term in the arithmetic progression as the output.
- In the second line, if the given term T is present in the arithmetic progression then the program must
print the position of the term T. Else the program must print the string value "Not Found" as the
output.
- In the third line, the program must print the absolute difference between the Xth
term and the
Y
th
term in the arithmetic progression as the output.
Note: The common difference D is always non-zero.
Boundary Condition(s):
-1000 <= F, D <= 1000
-10^5 <= T <= 10^5
2 <= N, X, Y <= 100
Input Format:
The first line contains F and D separated by a space.
The second line contains N.
The third line contains T.
The fourth line contains X and Y separated by a space.
Output Format:
The first line contains the Nth
term in the arithmetic progression.
The second line contains the position of the given term T or "Not Found".
The third line contains the absolute difference between the Xth
term and the Yth
term in the arithmetic
progression.
Example Input/Output 1:
Input:
1 4
7
21
13 17
Output:
25
6
16
Explanation:
First Term = 1.
Common Difference = 4.
The integers in the arithmetic progression are 1, 5, 9, 13, 17, 21, 25 and so on.
The 7
th
term in the arithmetic progression is 25. So 25 is printed in the first line.
The position of the term 21 in the arithmetic progression is 6. So 6 is printed in the second line
The absolute difference between the 13th
term and the 17th
term is 16 (49 - 65). So 16 is printed in
the third line.
Example Input/Output 2:
Input:
0 -3
3
-14
4 7
Output:
-6
Not Found
9

 */

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int F = sc.nextInt();
		int D = sc.nextInt();
		int N = sc.nextInt();
		int T = sc.nextInt();
		int X = sc.nextInt(),Y = sc.nextInt();
        sc.close();
		//Print the nth term
		System.out.println(F + (N-1)*D);
		//check whether the term is present
		int quotient = (T + D - F);
		if(quotient%D!=0)
		{
		    System.out.println("Not Found");
		}
		else
		{
		    System.out.println(quotient/D);
		}
		//print abs difference b/w Xth term and Yth term
		int term1 =  F + (X-1)*D;
		int term2 = F + (Y-1)*D;
		System.out.println(Math.abs(term1-term2));

	}
}

