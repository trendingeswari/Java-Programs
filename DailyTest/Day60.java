/*
 
Even Integers - Shifting Digits

The program must accept an integer N as the input. The program must print the even integers that can be formed by shifting the digits to the right in N.
Note:
- At least 1 even digit is always present in N.
-The resulting even integers must be printed without leading zeros.
Boundary Condition(s):
10 <= N <= 10^17
Input Format:
The first line contains N.
Output Format:
The first line contains the even integers that can be formed by shifting the digits to the right in N.

Example Input/Output 1:
Input: 4763
Output:
3476 7634
Explanation:
Here N = 4763 and the integers formed by shifting the digits to the right are given below.
4763
3476
6347
7634
So the even integers formed are 3476 and 7634.
Hence the output is
3476 7634
Example Input/Output 2:
Input:
1020030
Output:
1020030 3010200 301020 30102 2003010
 */
import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String N=sc.nextLine();
        int len=N.length();
        sc.close();
        for(int j=len;j>=0;j--)
        {
            String rotate=N.substring(j)+N.substring(0,j);
            long e=0;
            for(int k=0;k<rotate.length();k++)
            {
                char c=rotate.charAt(k);
                int num=c-'0';
                e=(e*10)+num;
            }
            if(e%2==0)
            {
                System.out.print(e+" ");
            }
        }
	}
}
