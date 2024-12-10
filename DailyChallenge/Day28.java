/*
 Rotate Matrix By X Degree

The program must accept an integer matrix of size NxN and an integer X as the input. 
The program must rotate the matrix by X degrees in the clockwise direction. 
Finally, the program must print the modified matrix as the output. 
If it is not possible to rotate the matrix by X degrees, the program must print INVALID as the output. 
The matrix rotation is possible if the value of X is a multiple of 90 (i.e., 0, 90, 180, 270, 360, 450, 540, and so on). 
Boundary Condition(s): 2 <= N <= 100 0 <= X <= 10^5 
Input Format: 
The first line contains N. The next N lines, each contains N integers separated by a space. The (N+2)nd line contains X. 
Output Format: 
The first N lines, each contains N integers representing the rotated matrix. 
Example Input/Output 1: 
Input: 
4 
44 17 27 29 
39 29 18 19 
13 40 13 31 
36 47 29 22 
270 
Output: 
29 19 31 22 
27 18 13 29 
17 29 40 47 
44 39 13 36 
Explanation: After rotating the matrix by 270 degrees, the matrix becomes. 
29 19 31 22 
27 18 13 29 
17 29 40 47 
44 39 13 36 
Example Input/Output 2: 
Input: 
5 
35 11 98 52 8 
44 48 77 85 80 
67 77 25 44 10 
97 17 38 55 95 
32 70 78 85 69 
45 
Output: 
INVALID
 */

import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),mat[][]=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int X=sc.nextInt();
        if(X%90!=0)
        {
            System.out.print("INVALID");
            sc.close();
            return ;
        }
        int num=0,ind=0,arr[]=new int[100001],count=0;
        boolean run=true;
        sc.close();
        while(run)
        {
            arr[ind++]=num;
            if(num==X)
            {
                run=false;
            }
            num+=90;
        }
        for(int k=0;k<ind;k++)
        {
            count++;
            if(count==1 && arr[k]==X)
            {
                for(int i=0;i<N;i++)
                {
                    for(int j=0;j<N;j++)
                    {
                        System.out.print(mat[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            else if(count==2 && arr[k]==X)
            {
                for(int j=0;j<N;j++)
                {
                    for(int i=N-1;i>=0;i--)
                    {
                        System.out.print(mat[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            else if(count==3 && arr[k]==X)
            {
                for(int j=N-1;j>=0;j--)
                {
                    for(int i=N-1;i>=0;i--)
                    {
                        System.out.print(mat[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            else if(count==4 && arr[k]==X)
            {
                for(int i=N-1;i>=0;i--)
                {
                    for(int j=0;j<N;j++)
                    {
                        System.out.print(mat[j][i]+" ");
                    }
                    System.out.println();
                }
            }
            else if(count==4)
            {
                count=0;
            }
        }
	}
}
