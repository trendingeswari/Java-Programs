/*
 The program must accept an integer N as the input. The program must print the desired pattern as
shown in the Example Input/Output section.
Boundary Condition(s):
1 <= N <= 20
Input Format:
The first line contains N.
Output Format:
The first N lines containing the desired pattern as shown in the Example Input/Output section.
Example Input/Output 1:
Input:
5
Output:
1+2+3+4+5=15
1*2*3*4=24
1+2+3=6
1*2=2
1=1
Example Input/Output 2:
Input:
8
Output:
1+2+3+4+5+6+7+8=36
1*2*3*4*5*6*7=5040
1+2+3+4+5+6=21
1*2*3*4*5=120
1+2+3+4=10
1*2*3=6
1+2=3
1=1
 */

import java.util.Scanner;

public class AdditionAndMultiplicationAlternatePattern {
    public static void main(AbbrevationMatching[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum=0,pro=1;
        System.out.println();
        for(int i=0;i<n;i++)
        {
            long num=1;
            sum=0;pro=1;
            for(int j=i;j<n;j++)
            {
                if(i==j&&i==n-1)
                {
                    System.out.print(num+"="+num);
                }
               else if(i==j)
               {    if(i%2==0)
                    {
                       sum+=num;
                       System.out.print(num);
                    }
                    else
                    {
                        pro*=num;
                        System.out.print(num);
                    }
               }
               else if(j==n-1)
               {
                   if(i%2==0)
                   {
                       sum+=num;
                       System.out.print("+"+num+"="+sum);
                   }
                   else
                   {
                       pro*=num;
                       System.out.print("*"+num+"="+pro);
                   }
               }
               else
               {
                   if(i%2==0)
                   {
                       sum+=num;
                       System.out.print("+"+num);
                   }
                   else
                   {
                       pro*=num;
                       System.out.print("*"+num);
                   }
               }
               num++;
            }
            System.out.println();
        }
	}
}
