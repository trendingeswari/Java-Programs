/*
 The program must accept two integers M and N representing the number of 0's and 1's respectively. The program must print the largest possible odd integer whose binary representation is formed using M 0's and N 1's as the output. If it is not possible to form such an integer, the program must print -1 as the output. 
 Boundary Condition(s): 0 <= M + N <= 31 
 Input Format: 
 The first line contains M and N separated by a space. 
 Output Format: 
 The first line contains the largest possible odd integer or -1. 
 Example Input/Output 1: 
 Input: 
 2 3 
 Output: 
 25 
 Explanation: 
 Here, 25 is the largest possible odd integer whose binary representation is formed using two 0's and three 1's. 
 The binary representation of 25 is 11001. 
 Hence the output is 25 
 Example Input/Output 2: 
 Input: 
 4 0 
 Output: 
 -1
 */

import java.util.Scanner;

public class Odds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt(),a[]=new int[1001],b[]=new int[1001];
        for(int i=0;i<m;i++)
        {
            a[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            b[i]=1;
        }
        int val=0,max=0;
        for(int i=0;i<n;i++)
        {
            int num=1;
            for(int j=0;j<n;j++)
            {
                if(j==val)
                {
                    for(int k=0;k<m;k++)
                    {
                        num=(num*10)+a[k];
                    }
                }
                else
                {
                    num=(num*10)+b[j];
                }
            }
            val++;
            String ind=Integer.toString(num);
            int decimal=Integer.parseInt(ind,2);
            if(decimal%2!=0 && max<decimal)
            {
                max=decimal;
            }
        }
        System.out.print(max>0?max:"-1");
	}
}
