/*
Two Integers Digonally

The program must accept an integer matrix of size RxC and two integers X and Y as the input. The
program must print YES if both X and Y are present diagonally(top left to bottom right diagonals and
top right to bottom left diagonals) in the matrix. Else the program must print NO as the output.
Note: The integers X and Y always occur once in the matrix.
Boundary Condition(s):
2 <= R, C <= 50
1 <= X, Y, Matrix element value <= 10^5
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
The (R+2)nd
line contains X and Y separated by a space.
Output Format:
The first line contains YES or NO.
Example Input/Output 1:
Input:
6 5
32 94 99 26 82
51 69 52 63 17
90 36 88 55 33
93 42 73 39 28
81 31 83 53 10
12 29 85 80 87
42 80
Output:
YES
Explanation:
Here the integers 42 and 80 are present diagonally in the matrix.
32 94 99 26 82
51 69 52 63 17
90 36 88 55 33
93 42 73 39 28
81 31 83 53 10
12 29 85 80 87
So YES is printed as the output.
Example Input/Output 2:
Input:
7 5
79 40 13 74 99
73 77 32 72 87
93 82 95 57 50
61 33 54 71 16
15 92 65 10 27
35 42 90 49 47
81 83 51 11 56
42 50
Output:
YES
Example Input/Output 3:
Input:
4 6
99 56 91 65 34 39
75 42 30 64 41 89
66 29 93 35 85 68
16 33 95 74 62 54
29 41
Output:
NO

 */

import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] mat = new int[r][c];
		int i, j, x, y, f = 0, subx = r+1, suby = r+2, addx = c+2, addy = c+1;
		for(i = 0; i < r; i++)
		{
		    for(j = 0; j < c; j++)
		    {
		        mat[i][j] = sc.nextInt();
		    }
		}
		x = sc.nextInt();
		y = sc.nextInt();
		for(i = 0; i < r; i++)
		{
		    for(j = 0; j < c; j++)
		    {
		        if(mat[i][j] == x)
		        {
		            f++;
		            subx = Math.abs(i - j);
		            addx = i+j;
		        }
		        else if(mat[i][j] == y)
		        {
		            f++;
		            suby = Math.abs(i - j);
		            addy = i+j;
		        }
		        
		        if(f == 2)
		        break;
		    }
		}
		
		if(subx == suby || addx == addy)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
