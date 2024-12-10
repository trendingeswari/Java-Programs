/*
 Replace Rows Or Column

The program must accept an integer matrix of size RxC and a character CH as the input. The program
must modify the matrix based on the following conditions.
- If CH is D or d, the program must replace each row with the last row in the matrix.
- If CH is U or u, the program must replace each row with the first row in the matrix.
- If CH is R or r, the program must replace each column with the last column in the matrix.
- If CH is L or l, the program must replace each column with the first column in the matrix.
- For any other values of CH, the program must keep the matrix as it is.
Finally, the program must print the modified matrix as the output.
Boundary Condition(s):
2 <= R, C <= 50
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
The (R+2)nd
line contains CH.
Output Format:
The first R lines, each contains C integers separated by a space.
Example Input/Output 1:
Input:
3 3
1 2 3
4 5 6
7 8 9
D
Output:
7 8 9
7 8 9
7 8 9
Explanation:
Here CH = D.
So each row is replaced with the last row in the matrix.
Hence the output is
7 8 9
7 8 9
7 8 9
Example Input/Output 2:
Input:
4 5
66 23 32 59 14
82 72 63 41 69
23 43 98 59 95
63 34 83 13 94
l
Output:
66 66 66 66 66
82 82 82 82 82
23 23 23 23 23
63 63 63 63 63
Example Input/Output 3:
Input:
4 3
1 2 1
3 4 5
6 7 8
3 5 7
W
Output:
1 2 1
3 4 5
6 7 8
3 5 7
 */

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt(),mat[][]=new int [R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        sc.nextLine();
        char ch=sc.next().toLowerCase().charAt(0);
        sc.close();
        switch(ch)
        {
            case 'd':
                for(int i=0;i<R;i++)
                {
                    for(int j=0;j<C;j++)
                    {
                        mat[i][j]=mat[R-1][j];
                    }
                }
                break;
            case 'u':
                for(int i=0;i<R;i++)
                {
                    for(int j=0;j<C;j++)
                    {
                        mat[i][j]=mat[0][j];
                    }
                }
                break;
            case 'r':
                for(int i=0;i<R;i++)
                {
                    for(int j=0;j<C;j++)
                    {
                        mat[i][j]=mat[i][C-1];
                    }
                }
                break;
            case 'l':
                for(int i=0;i<R;i++)
                {
                    for(int j=0;j<C;j++)
                    {
                        mat[i][j]=mat[i][0];
                    }
                }
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
	}
}
