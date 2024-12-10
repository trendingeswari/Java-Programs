/*
 Submatrix - Opposite Corners

The program must accept an integer matrix of size RxC and the positions of two cells in the matrix as the input. The positions of the two cells representing the positions of the opposite corners of a submatrix in any order. The program must print the integers in the submatrix as the output.
Boundary Condition(s): 2 <= R, C <= 50
Input Format:
The first line contains R and C separated by a space.
The next R lines, each containing C
integers separated by a space.
The (R+2)nd line contains four integers representing the positions of the opposite corners of a submatrix in any order.
Output Format:
The lines contain the integers separated by a space as per the given condition.

Example Input/Output 1: Input:
54
68 58 68 15
49 32 83 64
44 31 34 84
74 80 19 81
499 66 86
2254
Output:
32 83 64
31 34 84
80 1981 9 66 86
Explanation:
The position (2, 2) represents the top-left corner of the submatrix.
The position (5, 4) represents the bottom- right corner of the submatrix.
The submatrix specified by the given positions is highlighted below.
68 58 68 15
49 32 83 64
44 31 34 84
74 80 19 81
49 9 66 86
Hence the output is
32 83 64
31 34 84
80 1981 9 66 86

Example Input/Output 2: Input:
36
75 51 85 43 60 12
94 57 45 89 63 52
88 58 21 91 31 61
3315
Output:
85 43 60
45 89 63 21 91 31
Explanation:
The position (3, 3) represents the bottom- left corner of the submatrix.
The position (1, 5) represents the top-right corner of the submatrix.
The submatrix specified by the given positions is highlighted below.
75 51 85 43 60 12 94 57 45 89 63 52 88 58 21 91 31 61 Hence the output is 85 43 60
45 89 63
21 91 31
 */
import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int R=sc.nextInt(),C=sc.nextInt(),mat[][]=new int [R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        sc.close();
        int R1=sc.nextInt(),C1=sc.nextInt(),R2=sc.nextInt(),C2=sc.nextInt();
        int E1=(C1<C2)?C1-1:C2-1,E2=(C2>C1)?C2-1:C1-1,S1=(R1<R2)?R1-1:R2-1,S2=(R2>R1)?R2-1:R1-1;
        for(int i=0;i<R;i++)
        {
            boolean flag=false;
            for(int j=0;j<C;j++)
            {
                if((j>=E1 && j<=E2) && (i>=S1 && i<=S2))
                {
                   flag=true; System.out.print(mat[i][j]+" ");
                }
            }
            if(flag)
            {
            System.out.println();
            }
        }
	}
}
