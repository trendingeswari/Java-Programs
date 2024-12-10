/*
 The program must accept an integer N as the input. The program must print the number of ways to represent N as the sum of two prime integers. 
 Boundary Condition(s): 2 <= N <= 10^4
  Input Format: The first line contains N
  . Output Format: The first line contains the number of ways to represent N as the sum of two prime integers.
   Example Input/Output 1: Input: 18 Output: 2 Explanation: The 2 possible ways are given below. 5 + 13 = 18 7 + 11 = 18
    Example Input/Output 2: Input: 100 Output: 6
 */

import java.util.Scanner;

public class NumberOFWays_SumTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[1001],ind=0,val=0;
        for(int i=2;i<n;i++)
        {
            sc.close();
            int count=0;
            for(int j=i;j>1;j--)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==1)
            {
                a[ind++]=i;
            }
        }
        for(int i=0;i<ind;i++)
        {
            for(int j=i+1;j<ind;j++)
            {
                if(a[i]+a[j]==n)
                {
                    val++;
                }
            }
        }
        System.out.print(val);
	}
}
