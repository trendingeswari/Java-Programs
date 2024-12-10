/*
 String - Rows and Columns
The program must accept N string values of equal length L as the input. The program must generate a matrix of size RxC with asterisks, where the values R and C depend on the value of N. If N is even, then R = N + L - 1 and C = R - 1. Else R = N + L - 2 and C = R + 1. Then the program must modify the matrix based on the following conditions.
-The first L asterisks from the first row and first column of the matrix are replaced horizontally with the characters in the first string.
- The first L asterisks from the second row and second column of the matrix are replaced
vertically with the characters in the second string.
-The first L asterisks from the third row and third column of the matrix are replaced
horizontally with the characters in the third string.
- Similarly, the program must modify the matrix for the remaining string values. Finally, the program must print the modified matrix as the output.
Boundary Condition(s):
3 <= N <= 50
4 <= Length of each string <= 50
Input Format:
The first line contains N.
The next N lines, each contains a string.
Output Format:
The first R lines, each contains C characters representing the modified matrix.
Example Input/Output 1:
Input:
4
word
neck
mass
give

Output:
word**
*n****
*emass
*c*g** 
*k*i**
***v**
***e**
Explanation:
Here N = 4 and L = 4.
The value of N is even, so R = 4 + 4 - 1 = 7 and C = 7 - 1 = 6.
A matrix of size 7x6 is generated with asterisks.
After replacing the asterisks with the 4 string values based on the given conditions, the matrix
becomes
word**
*n****
*emass
*c*g** 
*k*i**
***v**
***e**

Example Input/Output 2:
Input:
5
Heaven
People
Family
Nature
office
Output:
Heaven****
*p********
*eFamily**
*o*N******
*p*aoffice *********
*E*u*
***
***
 */
import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),len=0;
        sc.nextLine();
        String s1[]=new String[N];
        char s[][]=new char [N][1001];
        for(int i=0;i<N;i++)
        {
            s1[i]=sc.nextLine();
            len=s1[i].length();
            s[i]=s1[i].toCharArray();
        }
        sc.close();
        int R=-1,C=-1;
        if(N%2==0)
        {
            R=N+len-1;
            C=R-1;
        }
        else
        {
            R=N+len-2;
            C=R+1;
        }
        char str[][]=new char[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                str[i][j]='*';
            }
        }
        int val=0;
        for(int i=0;i<R;i++)
        {
            if(i%2==0 && val<N)
            {
                for(int j=val,k=0;k<len;j++,k++)
                {
                    str[i][j]=s[val][k];
                }
            }
            else if(val<N && i%2!=0)
            {
                for(int j=i,k=0;k<len;j++,k++)
                {
                    str[j][val]=s[val][k];
                }
            }
            val++;
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
	}
}
