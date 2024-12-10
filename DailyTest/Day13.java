/*
 Order By Integers

 The program must accept a list of M integers and a list of N unique integers as the input. The program
must sort the first list of M integers based on the order of the integers in the second list of N integers
as the output. If the integers in the first list are not present in the second list, the program must sort
those integers in ascending order and print them last.
Boundary Condition(s):
1 <= M, N <= 10^4
0 <= Each integer value <= 10^8
Input Format:
The first line contains M and N separated by a space.
The second line contains M integers separated by a space.
The third line contains N integers separated by a space.
Output Format:
The first line contains M integers as per the given conditions.
Example Input/Output 1:
Input:
9 3
10 7 1 4 5 4 7 5 4
7 4 5
Output:
7 7 4 4 4 5 5 1 10
Explanation:
Here M = 9, N = 3.
The integers in the first list are 10 7 1 4 5 4 7 5 4.
The integers in the second list are 7 4 5.
The first integer in the second list is 7, which is present twice in the first list.
The second integer in the second list is 4, which is present thrice in the first list.
The third integer in the second list is 5, which is present twice in the first list.
So the integers 7 7 4 4 4 5 5 are printed first.
The remaining integers in the first list are 10 and 1. So they are sorted in ascending order and printed
last.
Hence the output is
7 7 4 4 4 5 5 1 10
Example Input/Output 2:
Input:
7 2
2 1 3 2 0 2 4
0 1
Output:
0 1 2 2 2 3 4
 */

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int M=sc.nextInt(),N=sc.nextInt(),arr1[]=new int[M];
        for(int i=0;i<M;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            int num=sc.nextInt();
            for(int j=0;j<M;j++)
            {
                if(num==arr1[j])
                {
                    System.out.print(arr1[j]+" ");
                    for(int k=j;k<M-1;k++)
                    {
                        arr1[k]=arr1[k+1];
                    }
                    M--;j--;
                }
            }
        }sc.close();
        for(int i=0;i<M;i++)
        {
            for(int j=i+1;j<M;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
            System.out.print(arr1[i]+" ");
        }
	}
}
