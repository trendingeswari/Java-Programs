/*
 The program must accept the size of two grids(RxC and MxN) as the input. The program must print
the MxN grid of RxC grids of asterisks as shown in the Example Input/Output section.
Boundary Condition(s):
2 <= R, C, M, N <= 20
Input Format:
The first line contains R and C separated by a space.
The second line contains M and N separated by a space.
Output Format:
The lines containing the MxN grid of RxC grids of asterisks as shown in the Example Input/Output
section.
Example Input/Output 1:
Input:
2 3
4 4
Output:
***|***|***|***
***|***|***|***
---+---+---+---
***|***|***|***
***|***|***|***
---+---+---+---
***|***|***|***
***|***|***|***
---+---+---+---
***|***|***|***
***|***|***|***
Example Input/Output 2:
Input:
3 3
3 2
Output:
***|***
***|***
***|***
---+---
***|***
***|***
***|***
---+---
***|***
***|***
***|***
 */

import java.util.Scanner;

public class GridOfGridsPattern {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt(),r=sc.nextInt(),c=sc.nextInt();
        sc.close();
        for(int row=0;row<r;row++)
        {
                for(int i=0;i<m;i++)
                {
                    for(int col=0;col<c;col++)
                    {
                        for(int j=0;j<n;j++)
                        {
                                System.out.print("*");
                        }
                        if(col==c-1)
                        {
                            continue;
                        }
                        else
                        {
                            System.out.print("|");
                        }
                    }
                    System.out.println();
                }
                if(row!=r-1)
                {
                    for(int i=0;i<c;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            System.out.print("-");
                        }
                        if(i==c-1)
                        {
                            continue;
                        }
                        else
                        {
                            System.out.print("+");
                        }
                    }
                System.out.println();
                }
        }
	}
}
