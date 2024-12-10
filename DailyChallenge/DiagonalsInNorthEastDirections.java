/*
 The program must accept an integer matrix of size RxC as the input. The program must print the
integers in the diagonals in the North-East direction of the matrix (in a separate line) as the output.
Boundary Condition(s):
2 <= R, C <= 100
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
Output Format:
The R+C-1 lines, each contains the integer value(s).
Example Input/Output 1:
Input:
3 3
73 77 76
71 17 87
37 73 98
Output:
73 
71 77 
37 17 76 
73 87 
98 
Explanation:
There are 5 diagonals in the North-East direction.
The integer in the first diagonal is 73.
The integers in the second diagonal are 71 and 77.
The integers in the third diagonal are 37, 17 and 76.
The integers in the fourth diagonal are 73 and 87.
The integer in the fifth diagonal is 98.
Hence the output is
73
71 77
37 17 76
73 87
98
Example Input/Output 2:
Input:
4 6
97 78 7 39 92 45
68 100 49 95 97 100
59 41 81 22 26 100
46 37 81 12 93 10
Output:
97 
68 78 
59 100 7 
46 41 49 39 
37 81 95 92 
81 22 97 45 
12 26 100 
93 100 
10

 */
import java.util.Scanner;
public class DiagonalsInNorthEastDirections {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt(),mat[][]=new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        sc.close();
        boolean flag=false;
        int num=1,row=-1,col=0;
        for(int i=0;i<R;i++)
        {
            if(i<(R))
            {
                if(i==(R-1))
                {
                    flag=true;
                }
                row=i;col=0;
                for(int count=1;count<=i+1;count++)
                {
                    System.out.print(mat[row][col]+" ");
                    if(i!=0)
                    {row--;
                        
                    }
                    if(col!=(C-1)){
                        col++;
                        
                    }
                }
                System.out.println();
            }
            if(flag)
            {
                for(int j=0;j<(C-1);j++)
                {
                    row=i;
                    col=0;
                    col+=num;
                    for(int count=0;count<R;count++)
                    {
                        System.out.print(mat[row][col]+" ");
                        if(col!=(C-1))
                        {
                            col++;
                            row--;
                        }
                        else 
                        {
                            break;
                        }
                    }
                    num++;
                    System.out.println();
                }
            }
        }
	}
}
