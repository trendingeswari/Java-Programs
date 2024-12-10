/*
 The program must accept an integer matrix of size NxN as the input. For each occurrence of 0 in the matrix, the program must find the sum S of integers in the top, right, bottom and left adjacent cells. Then the program must replace 0 with the sum S and the four adjacent cells with 0. Finally, the program must print the modified matrix as the output. 
 Note: The zeros are placed in a matrix so that the four adjacent cells of zero cannot be adjacent to the another zero. 
 Boundary Condition(s): 3 <= N <= 50 
 Input Format: The first line contains N. The next N lines, each containing N integers separated by a space. 
 Output Format: The first N lines containing the modified matrix. 
 Example Input/Output 1: 
 Input: 
 5 
 2 8 3 9 2 
 6 9 2 3 9 
 2 3 2 0 1 
 1 0 4 6 3 
 5 7 4 7 6 
 Output: 
 2 8 3 9 2 
 6 9 2 0 9 
 2 0 0 12 0 
 0 15 0 0 3 
 5 0 4 7 6 
 Explanation: For each occurrence of 0, the top, right, bottom and left adjacent cells are highlighted below. 2 8 3 9 2 6 9 2 3 9 2 3 2 0 1 1 0 4 6 3 5 7 4 7 6 After replacing 0 with the sum of integers in its adjacent cells and the four adjacent cells with 0, the matrix becomes 2 8 3 9 2 6 9 2 0 9 2 0 0 12 0 0 15 0 0 3 5 0 4 7 6 
 Example Input/Output 2: 
 Input: 
 8 
 0 9 5 0 4 3 3 0 
 8 9 8 7 4 1 9 4 
 1 1 7 3 6 4 5 1 
 0 9 2 2 0 5 9 2 
 6 8 1 4 2 5 9 0 
 2 4 2 1 6 4 5 7 
 3 9 5 7 3 1 2 4 
 0 8 7 6 0 6 7 0 
 Output: 
 17 0 0 16 0 3 0 7 
 0 9 8 0 4 1 9 0 
 0 1 7 3 0 4 5 1 
 16 0 2 0 15 0 9 0 
 0 8 1 4 0 5 0 18 
 2 4 2 1 6 4 5 0 
 0 9 5 7 0 1 2 0 
 11 0 7 0 15 0 0 11
 */

import java.util.Scanner;

public class SwapZerosAndSurroundingSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[][]=new int[n][n],sum=0,b[]=new int[1001],ind=0,val=0,c[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                c[i][j]=a[i][j];
            }
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==0)
                {
                    if(i!=0)
                    {
                        sum+=a[i-1][j];
                        c[i-1][j]=0;
                    }
                    if(i!=(n-1))
                    {
                        sum+=a[i+1][j];
                        c[i+1][j]=0;
                    }
                    if(j!=0)
                    {
                        sum+=a[i][j-1];
                        c[i][j-1]=0;
                    }
                    if(j!=(n-1))
                    {
                        sum+=a[i][j+1];
                        c[i][j+1]=0;
                    }
                    b[ind++]=sum;
                    sum=0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==0)
                {
                    System.out.print(b[val++]+" ");
                }
                else 
                {
                    System.out.print(c[i][j]+" ");
                }
            }
            System.out.println();
        }
	}
}
