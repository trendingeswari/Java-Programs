/*
 The program must accept N integers as the input. The program must generate an integer matrix of
size NxN with the N integers in each row. Then the program must replace each digit with an asterisk in
the non-diagonal integers of the matrix. Finally, the program must print the matrix without any space
in each row.
Boundary Condition(s):
2 <= N <= 50
1 <= Each integer value <= 10^8
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first N lines containing the modified matrix.
Example Input/Output 1:
Input:
5
125 5 10 788 99
Output:
125******99
***5**788**
****10*****
***5**788**
125******99
Explanation:
Here N = 5.
The generated matrix with the 5 integers is given below.
125 5 10 788 99
125 5 10 788 99
125 5 10 788 99
125 5 10 788 99
125 5 10 788 99
After replacing each digit with an asterisk in the non-diagonal integers of the matrix, it becomes
125 * ** *** 99
*** 5 ** 788 **
*** * 10 *** **
*** 5 ** 788 **
125 * ** *** 99
Finally, the matrix is printed with no space in each row.
Example Input/Output 2:
Input:
8
67 3 166 81 44 553 55 9
5/3/24, 6:38 AM skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT
https://www.skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT 1/2
Output:
67*************9
**3**********55*
***166****553***
******8144******
******8144******
***166****553***
**3**********55*
67*************9

 */
import java.util.*;
public class ArrayToDiagonalPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),arr[]=new int[N],matrix[][]=new int[N][N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println();
        boolean flag=false;
        int num=N/2;
        if(N%2!=0)
        {
            flag=true;
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                matrix[i][j]=arr[j];
                if(i==j)
                {
                    System.out.print(matrix[i][j]);
                }
                else if((i+j)==(N-1))
                {
                    if(flag&&i==num)
                    {
                        continue;
                    }
                    else
                    {
                        System.out.print(matrix[i][j]);
                    }
                }
                else
                {
                    int temp=matrix[i][j],count=0;
                    while(temp>0)
                    {
                        count++;
                        temp/=10;
                    }
                    for(int k=0;k<count;k++)
                    {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
	}
}
