/*
 Matrix - Missing Digits

 The program must accept a matrix of size NxN containing only digits as the input. In
each 3x3 submatrix in the given matrix, exactly one digit is missing among the 10 digits (0 to 9). The
program must find the missing digit in each 3x3 submatrix and print it as the output.
Note: The value of N is always divisible by 3.
Boundary Condition(s):
3 <= N <= 48
Input Format:
The first line contains N.
The next N lines, each contains N integers separated by a space.
Output Format:
The first line contains the missing digit in each 3x3 submatrix.
Example Input/Output 1:
Input:
6
1 2 3 4 5 6
8 9 7 2 3 7
4 5 6 8 9 0
3 2 1 4 6 7
9 8 7 2 3 1
5 6 0 5 0 8
Output:
0 1 4 9
Explanation:
There are four 3x3 submatrices in the given 6x6 matrix.
In the first 3x3 submatrix, the missing digit is 0.
1 2 3
8 9 7
4 5 6
Similarly, the missing digits in the remaining three 3x3 submatrices are 1, 4 and 9.
Hence the output is
0 1 4 9
Example Input/Output 2:
Input:
3
4 7 9
1 0 2
3 5 6
Output:
8

 */

import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),mat[][]=new int[N][N],rowCount=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int count=1;count<=N/3;count++)
        {
            int start=rowCount,colCount=0;
            rowCount+=3;
            while(colCount<N)
            {
                int col=colCount,arr[]={0,1,2,3,4,5,6,7,8,9},len=arr.length;
                colCount+=3;
                for(int i=start;i<rowCount;i++)
                {
                    for(int j=col;j<colCount;j++)
                    {
                        for(int k=0;k<len;k++)
                        {
                            if(mat[i][j]==arr[k])
                            {
                                for(int l=k;l<len-1;l++)
                                {
                                    arr[l]=arr[l+1];
                                }
                                len--;
                            }
                        }
                    }
                }
                for(int i=0;i<len;i++)
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
	}
}
