/*
 The program must accept two integers N and X as the input. The program must print the desired pattern as shown in the Example Input/Output section. 
 Boundary Condition(s): 1 <= N, X <= 100 
 Input Format: The first line contains N and X separated by a space. 
 Output Format: The first X lines containing the desired pattern as shown in the Example Input/Output section. 
 Example Input/Output 1: 
 Input: 
 5 6 
 Output: 
 55555 
 25252 
 16161 
 15151 
 13131 
 99999 
 Explanation: X = 6, so there are 6 rows in the pattern. N = 5, so there are 5 digits in each row. The first row contains the integer 5 (as N is 5). 1st Row -> 55555 (5+5+5+5+5 = 25, so the next row will have the integer 25) 2nd Row -> 25252 (2+5+2+5+2 = 16, so the next row will have the integer 16) 3rd Row -> 16161 (1+6+1+6+1 = 15, so the next row will have the integer 15) 4th Row -> 15151 (1+5+1+5+1 = 13, so the next row will have the integer 13) 5th Row -> 13131 (1+3+1+3+1 = 9, so the next row will have the integer 9) 6th Row -> 99999 
 Example Input/Output 2:
Input: 
12 4 
Output: 
121212121212 
181818181818 
545454545454 
545454545454 
Example Input/Output 3: 
Input: 
23 5
Output: 
23232323232323232323232 
57575757575757575757575 
13713713713713713713713 
81818181818181818181818 
10710710710710710710710
 */

import java.util.Scanner;

public class SumOfDigits_RowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt(),sum=n;
        sc.close();
        for(int i=0;i<x;i++)
        {
            int a[]=new int[1001],b[]=new int[1001],ind=0,val=0,num=0;
            while(sum>0)
            {
                a[ind++]=sum%10;
                sum/=10;
            }
            for(int k=ind-1;k>=0;k--)
            {
                b[val++]=a[k];
            }
            for(int j=0;j<n;j++)
            {
                if(num==val)
                {
                    num=0;
                    System.out.print(b[num]);
                    sum+=b[num++];
                }
                else
                {
                    System.out.print(b[num]);
                    sum+=b[num++];
                }
            }
            System.out.println();
        }
	}
}
