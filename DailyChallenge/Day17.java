/*
Column Sort Largest Integer

 The program must accept an integer matrix of size RxC as the input. The program must sort the
columns of the matrix based on the largest integer in the columns in ascending order. If more than
one columns have the same largest integer then sort those columns in the order of their occurrence.
Finally, the program must print the modified matrix as the output.
Boundary Condition(s):
2 <= R, C <= 100
1 <= Matrix element value <= 10^4
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
Output Format:
The first R lines, each contains C integers of the modified matrix separated by a space.
Example Input/Output 1:
Input:
4 5
3 9 8 4 3
2 1 3 2 1
7 4 8 2 1
4 3 8 3 6
Output:
4 3 3 8 9
2 1 2 3 1
2 1 7 8 4
3 6 4 8 3
Explanation:
The largest integer in the 1
st column of the matrix is 7.
The largest integer in the 2
nd column of the matrix is 9.
The largest integer in the 3
rd
column of the matrix is 8.
The largest integer in the 4
th
column of the matrix is 4.
The largest integer in the 5
th column of the matrix is 6.
After sorting all the columns of the matrix in ascending order based on the largest integer, the matrix
becomes
4 3 3 8 9
2 1 2 3 1
2 1 7 8 4
3 6 4 8 3
Example Input/Output 2:
Input:
3 7
6 7 11 20 12 13 17
1 10 5 4 10 16 17
16 18 15 8 12 3 17
Output:
12 11 6 13 17 7 20
10 5 1 16 17 10 4
12 15 16 3 17 18 8
 */

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt(),mat[][]=new int[R][C],arr[]=new int[10001],d[]=new int[10001];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<C;i++)
        {
            int max=0;
            for(int j=0;j<R;j++)
            {
                if(max<mat[j][i])
                {
                    max=mat[j][i];
                }
            }
            arr[i]=max;
            d[i]=i;
        }
        for(int i=0;i<C;i++)
        {
            for(int j=i+1;j<C;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    int tem=d[i];
                    d[i]=d[j];
                    d[j]=tem;
                }
            }
        }
        int ind=C;
        System.out.println();
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if((d[j]!=d[j+1] && j!=C-1 )||(j==C-1 && d[j-1]!=d[j]))
                {
                    System.out.print(mat[i][d[j]]+" ");
                }
                else
                {
                    for(int k=0;k<C-1;k++)
                    {
                        if(mat[i][k]>mat[i][k+1])
                        {
                            int temp=mat[i][k];
                            mat[i][k]=mat[i][k+1];
                            mat[i][k+1]=temp;
                        }
                        System.out.print(mat[i][k]+" ");
                    }
                    j++;
                }
            }
            System.out.println();
        }
	}
}
