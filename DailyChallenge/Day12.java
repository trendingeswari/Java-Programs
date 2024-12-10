/*
 Check Triangle in Matrix

 The program must accept an integer matrix of size NxN and an integer K as the input. The program
must print YES if the top(must start from the first row) of the matrix contains a triangle with the
integer K in its border. Else the program must print NO as the output.
Note: The value of N is always odd.
Boundary Condition(s):
5 <= N <= 49
0 <= K, Matrix element value <= 1000
Input Format:
The first line contains N and K separated by a space.
The next N lines, each contains N integers separated by a space.
Output Format:
The first line contains YES or NO.
Example Input/Output 1:
Input:
7 3
8 5 3 3 6 7 4
4 0 3 0 3 4 3
3 3 7 5 9 3 4
3 3 3 3 3 3 3
7 4 7 6 5 0 4
2 8 4 2 8 9 9
4 6 5 4 8 7 3
Output:
YES
Explanation:
In the top of the given 7x7 matrix, a triangle with the integer 3 in its border is highlighted below.
8 5 3 3 6 7 4
4 0 3 0 3 4 3
3 3 7 5 9 3 4
3 3 3 3 3 3 3
7 4 7 6 5 0 4
2 8 4 2 8 9 9
4 6 5 4 8 7 3
So YES is printed as the output.
Example Input/Output 2:
Input:
5 0
7 8 0 4 7
1 0 5 0 8
0 0 1 0 0
4 5 8 6 3
0 1 3 7 3
Output:
NO
 */

import java.util.Scanner;

public class Day12 {
    /*public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),K=sc.nextInt();
        int mat[][]=new int[N][N];
        boolean present=false,cpresent=false;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }sc.close();
        for(int i=0;i<N;i++)
        {
            int pcount=0,index=-1,leftcol=0,rightcol=N-1,lcount=0,rcount=0;
            for(int j=0;j<N;j++)
            {
                if(mat[i][j]==K)
                {
                    pcount++;
                }
            }
            if(pcount==N)
            {
                present=true;
                index=i;
            }
            if(index!=-1)
            {
                for(int j=index;j>=0;j--)
                {
                    boolean lflag=false,rflag=false;
                    if(mat[j][leftcol]==K)
                    {
                        lflag=true;
                    }
                    if(mat[j][rightcol]==K)
                    {
                        rflag=true;
                    }
                    leftcol++;rightcol--;
                    if(lflag)
                    {
                        lcount++;
                    }
                    if(rflag)
                    {
                        rcount++;
                    }
                }
                if(lcount==rcount)
                {
                    cpresent=true;
                    System.out.print("YES");
                    return ;
                }
            }
        }
        if(present==false||cpresent==false)
        {
            System.out.print("NO");
        }
	}*/
    //another way
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), i, j, f=1;
        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                int a = sc.nextInt();
                if(i==n/2 || Math.abs(j-n/2)==i) {
                    if(a!=k) {
                        f=0;
                    } 
                }
            }   
        }
        sc.close();
        System.out.print(f==1 ? "YES" : "NO");
        }
}
