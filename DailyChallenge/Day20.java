/*
 Matrix Palindrome

The program must accept an integer matrix of size RxC as the input. The program must print YES if
every row and every column of the matrix is a palindrome. Else the program must print NO as the
output.
Boundary Condition(s):
2 <= R, C <= 50
1 <= Matrix element value <= 1000
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
Output Format:
The first line contains the string value "YES" or "NO".
Example Input/Output 1:
Input:
4 4
1 2 2 1
2 3 3 2
2 3 3 2
1 2 2 1
Output:
YES
Explanation:
In the given 4x4 matrix, every row and every column is a palindrome.
So YES is printed.
Example Input/Output 2:
Input:
3 5
2 4 3 4 2
3 7 8 7 3
5 6 1 6 5
Output:
NO
Example Input/Output 3:
Input:
5 4
67 77 77 67
48 74 74 48
53 95 95 53
48 74 74 48
67 77 77 67
Output:
YES
 */

import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt(),mat[][]=new int[R][C];
        System.out.println();
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
            }
            for(int j=0,k=C-1;j<C/2;j++,k--)
            {
                if(mat[i][j]!=mat[i][k])
                {
                    System.out.print("NO");
                    return ;
                }
            }
        }
        sc.close();
        for(int j=0;j<C;j++)
        {
            for(int i=0,k=R-1;i<R;i++,k--)
            {
                if(mat[i][j]!=mat[k][j])
                {
                    System.out.print("NO");
                    return ;
                }
            }
        }
        System.out.print("YES");
	}
}
