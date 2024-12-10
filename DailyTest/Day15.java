/*
 Matrix - Row and Column Pattern

The program must accept an integer matrix of size RxC as the input. The program must print all the
integers in the matrix based on the following conditions.
- In the first line, the program must print all the integers in the first row of the matrix (from left to
right).
- In the second line, the program must print all the integers in the first column of the matrix (from top
to bottom, excluding the first integer).
- In the third line, the program must print all the integers in the second row of the matrix (from left to
right, excluding the first integer).
- In the fourth line, the program must print all the integers in the second column of the matrix (from
top to bottom, excluding the first two integers).
- Similarly, the program must print the remaining integers in the matrix as the output.
Boundary Condition(s):
2 <= R, C <= 50
Input Format:
The first line contains R and C separated by a space.
The next R lines, each containing C integers separated by a space.
Output Format:
The lines, each containing the integer value(s) separated by a space.
Example Input/Output 1:
Input:
5 5
59 88 53 93 47
99 55 83 49 32
84 98 46 21 51
85 69 97 12 22
24 15 62 78 48
Output:
59 88 53 93 47
99 84 85 24
55 83 49 32
98 69 15
46 21 51
97 62
12 22
78
48
Explanation:
The integers in the first row of the matrix are 59, 88, 53, 93 and 47. So they are printed in the first line.
The integers in the first column of the matrix (excluding the first integer) are 99, 84, 85 and 24. So they
are printed in the second line.
The integers in the second row of the matrix (excluding the first integer) are 55, 83, 49 and 32. So they
are printed in the third line.
The integers in the second column of the matrix (excluding the first two integers) are 98, 69 and 15. So
they are printed in the fourth line.
Similarly, the remaining integers of the matrix are printed.
Hence the output is
59 88 53 93 47
99 84 85 24
55 83 49 32
98 69 15
46 21 51
97 62
12 22
78
48
Example Input/Output 2:
Input:
3 4
8 6 9 5
1 45 67 99
3 50 6 9
Output:
8 6 9 5
1 3
45 67 99
50
6 9

 */

import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int R=sc.nextInt(),C=sc.nextInt(),mat[][]=new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int min=R<=C?R:C;
        sc.close();
        int row=0,col=1,colval=0;
        while(true)
        {
            for(int j=0;j<C;j++)
            {
                if(row<=j)
                {
                    System.out.print(mat[row][j]+" ");
                }
            }
            row++;
            System.out.println();
            for(int i=col;i<R;i++)
            {
                System.out.print(mat[i][colval]+" ");    
            }
            col++;colval++;
            if(row==min || colval==min)
            {
                break;
            }
            System.out.println();
        }
	}
}
