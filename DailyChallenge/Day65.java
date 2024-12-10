/*
 
Zero Arrow Pattern Printing

The program must accept an integer N as the input. The program must print the pattern of (2*N)-1 lines based on the following conditions.
- Each row of the pattern contains N characters.
- In the 1st row, the Nth character is 0 and the remaining characters are asterisks.
- In the 2nd row, the Nth, (N-1)th characters are O and the remaining characters are asterisks. - In the 3rd row, the Nth, (N-2)th characters are 0 and the remaining characters are asterisks. - Similarly, the first N lines of the pattern are printed.
- In the (n+1)th row, the Nth, 2nd characters are 0 and the remaining characters are asterisks.
- In the (N+2)th row, the Nth, 3rd characters are 0 and the remaining characters are asterisks. - Similarly, the remaining lines of the pattern are printed.
Note: All characters in each row must be separated by a space.
Boundary Condition(s):
3 <= N <= 100
Input Format:
The first line contains N.
Output Format:
The first (2*N)-1 lines containing the desired pattern as per the given conditions.

Example Input/Output 1:
Input:
3
Output:
**0
*00
0*0
*00
**0
Explanation:
Here N = 3, so the pattern contains 5 lines ((2*3)-1).
In the 1st row, the 3rd character is 0 and the remaining characters are asterisks.
**0
In the 2nd row, the 3rd, 2nd characters are 0 and the remaining character is an asterisk. *00
In the 3rd row, the 3rd, 1st characters are 0 and the remaining character is an asterisk. 0*0
In the 4th
*00
row, the 3rd, 2nd characters are 0 and the remaining character is an asterisk.
In the 5th row, the 3rd character is 0 and the remaining characters are asterisks. **0

Example Input/Output 2:
Input:
5
Output:
***00 **0*0 *0** 0
0*** 0
*0** **0
**0*0
***00
****0
 */
import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),R=(N*2)-1,C=N,r=N-1,l=N;
        sc.close();
        for(int i=0;i<R;i++)
        {
            if(i<N)
            {
                l--;
            }
            else{
                l++;
            }
            for(int j=0;j<C;j++)
            {
                if(r==j||l==j)
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
	}
}
