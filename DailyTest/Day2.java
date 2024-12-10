/*
 Nth row Pascal's Triangle
 The program must accept an integer N as the input. The program must print the Nth
row in Pascal's
triangle as the output. Pascal's triangle is a triangular array constructed by summing adjacent integers
in preceding rows.
Boundary Condition(s):
1 <= N <= 50
Input Format:
The first line contains N.
Output Format:
The first line contains the Nth
row in Pascal's triangle.
Example Input/Output 1:
Input:
5
Output:
1 4 6 4 1
Explanation:
The first 5 rows of Pascal's triangle are given below.
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
The 5
th
row in Pascal's triangle is 1 4 6 4 1. So they are printed as the output.
Example Input/Output 2:
Input:
10
Output:
1 9 36 84 126 126 84 36 9 1
 */

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),a[]=new int[10001],len=3;
        a[0]=0;a[1]=1;a[2]=0;
        sc.close();
        if(N==1)
        {
            System.out.print(1);
        }
        for(int i=1;i<N;i++)
        {
            int arr[]=new int[10001],ind=0;
            arr[ind++]=0;
            for(int j=0;j<len-1;j++)
            {
                arr[ind++]=a[j]+a[j+1];
            }
            arr[ind++]=0;
            len=ind;
            for(int j=0;j<ind;j++)
            {
                a[j]=arr[j];
            }
            if(i==N-1)
            {
                for(int j=1;j<ind-1;j++)
                {
                    System.out.print(a[j]+" ");
                }
            }
        }
    }
}
