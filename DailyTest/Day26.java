/*
 Matrix Traversal - Path

The program must accept an integer matrix of size RxC, the position (X, Y) of a cell and a
string P representing a path containing the characters >, v, < and ^ as the input. The path P always
starts from the given cell (X, Y). The program must print the integers which are present in the given
path P. The four characters in the path P representing the four directions.
- The character > indicates that the next cell is on the right.
- The character v indicates that the next cell is on the bottom.
- The character < indicates that the next cell is on the left.
- The character ^ indicates that the next cell is on the top.
If the path P is not valid (i.e., if it crosses the edges of the matrix), the program must print the string
value "Invalid Path" as the output.
Boundary Condition(s):
2 <= R, C <= 50
1 <= X <= R
1 <= Y <= C
1 <= Length of P <= 100
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
The (R+2)nd
line contains X and Y separated by a space.
The (R+3)rd
line contains P.
Output Format:
The first line contains the integer value(s) present in the given path P or "Invalid Path".
Example Input/Output 1:
Input:
5 5
1 2 3 4 5
6 7 8 9 0  
1 2 3 4 5  
6 7 8 9 0
1 2 3 4 5
1 2
>>>v
Output:
2 3 4 5 0
Explanation:
The starting position of the path is (1, 2).
The path P is >>>v.
The integers present in the given path P are highlighted below.
1 2 3 4 5
6 7 8 9 0
1 2 3 4 5
6 7 8 9 0
1 2 3 4 5
Hence the output is
2 3 4 5 0
Example Input/Output 2:
Input:
3 4
1 2 3 4
5 6 7 8
1 2 3 0
1 1
>>vv<v>
Output:
Invalid Path

 */

import java.util.Scanner;

public class Day26 {
     public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt(),mat[][]=new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int X=sc.nextInt(),Y=sc.nextInt(),n1=X-1,n2=Y-1,arr[]=new int[1001],ind=0;
        sc.nextLine();
        char c[]=sc.nextLine().toCharArray();
        sc.close();
        boolean flag=false;
        if(n1<=R && n2<=C)
        {
            arr[ind++]=mat[n1][n2];
            for(int i=0;i<c.length;i++)
            {
                if(c[i]=='>')
                {
                    int e1=n2;e1++;
                    if(e1==C){flag=true;break;}
                    else
                    {
                        arr[ind++]=mat[n1][++n2];
                    }
                }
                else if(c[i]=='<')
                {
                    int e2=n2;e2--;
                    if(e2<0)
                    {
                        flag=true;break;
                    }
                    else{
                        arr[ind++]=mat[n1][--n2];
                    }
                }
                else if(c[i]=='v')
                {
                    int e3=n1;e3++;
                    if(e3==R)
                    {
                        flag=true;
                        break;
                    }
                    else
                    {
                        arr[ind++]=mat[++n1][n2];
                    }
                }
                else if(c[i]=='^')
                {
                    int e4=n1;e4--;
                    if(e4<0){flag=true;break;}
                    else
                    {
                        arr[ind++]=mat[--n1][n2];
                    }
                }
            }
        }
        else
        {
            flag=true;
        }
        if(flag==false)
        {
            for(int i=0;i<ind;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        else
        {
            System.out.print("Invalid Path");
        }
	}
}
