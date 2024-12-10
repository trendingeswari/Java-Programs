/*
 
Digits to Bits

The program must accept an integer N as the input. The program must replace each odd digit in N with 1 and each even digit in N with 0. The modified value of N representing a binary representation. The program must print the decimal equivalent of the modified value of N as the output.
Boundary Condition(s):
1 <= N <= 10^18
Input Format:
The first line contains N.
Output Format:
The first line contains an integer representing the decimal equivalent of the modified value of N.

Example Input/Output 1:
Input:
84536
Output:
6
Explanation:
Here N = 84536.
After replacing each odd digit in 84536 with 1, the integer becomes 84116.
After replacing each even digit in 84116 with 0, the integer becomes 00110. Now the decimal equivalent of 00110 is 6.
So 6 is printed as the output.
Example Input/Output 2:
Input:
541532
Output:
46
 */
import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        long N=sc.nextLong(),arr[]=new long[10001],sum=0;
        int ind=0;
        sc.close();
        while(N>0)
        {
            if((N%10)%2==0)
            {
                arr[ind++]=0;
            }
            else
            {
                arr[ind++]=1;
            }
            N/=10;
        }
        for(int i=0;i<ind;i++)
        {
            long dec=arr[i]*(long)Math.pow(2,i);
            sum+=dec;
        }
        System.out.print(sum);
	}
}
