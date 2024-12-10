/*
 The program must accept an integer N as the input. The program must print the desired pattern as
shown in the Example Input/Output section.
Note: The value of N is always odd.
Boundary Condition(s):
3 <= N <= 99
Input Format:
The first line contains N.
Output Format:
The lines containing the desired pattern as shown in the Example Input/Output section.
Example Input/Output 1:
Input:
5
Output:
*   *
** **
*****
** **
*   *
Example Input/Output 2:
Input:
7
Output:
*     *
**   **
*** ***
*******
*** ***
**   **
*     *
 */

import java.util.Scanner;

public class TwoTriangle_AstereiksPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),num=0,val=n-2,esh=0;
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            if((n+1)/2>i)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
            }
            else if((n+1)/2==i)
            {
                num=i-1;
                for(int j=1;j<=num;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int j=1;j<=num;j++)
                {
                    System.out.print("*");
                }
                num--;
            }
            if(val>0&&(n+1)/2>i)
            {
                for(int j=1;j<=val;j++)
                {
                    System.out.print(" ");
                }
                val-=2;
            }
            else if(val>0)
            {
                for(int j=1;j<=val;j++)
                {
                    System.out.print(" ");
                }
                val+=2;
            }
            else
            {
                System.out.print("*");
                val+=2;
            }
            if((n+1)/2>i)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
            }
            else if((n+1)/2==i)
            {
                esh=i-1;
                for(int j=1;j<=esh;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int j=1;j<=esh;j++)
                {
                    System.out.print("*");
                }
                esh--;
            }
            System.out.println();
        }
}
