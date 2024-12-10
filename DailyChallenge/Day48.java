/*
 
Convert String to Matrix

The program must accept a space-separated string S and an integer N as the input. The program must replace each space in the string S with an asterisk. Then the program must print the pattern based on the following conditions.
- The pattern contains N columns.
- The last row of the pattern contains the first N characters of the string S from right to left separated by a space.
- The last but one row of the pattern contains the next N characters of the string S from right to left separated by a space.
- Similarly, the remaining rows of the pattern contain the remaining characters of string S.
- If the number of characters in the last set of the string S is less than N, the remaining positions must be filled with hash (#) symbols.
Boundary Condition(s):
4 <= Length of S <= 1000
2 <= N <= 100
Input Format:
The first line contains S.
The second line contains N.
Output Format:
The lines contain the characters based on the given conditions.

Example Input/Output 1:
Input:
all is well
4
Output:
#Ile
w* si *Ila
Explanation:
Here S = "all is well and N = 4. So the pattern contains 4 columns.
After replacing each space in S with an asterisk, the string becomes "all*is*well". The last row of the pattern contains the first 4 characters of S from right to left.
* ||a
The last but one row of the pattern contains the first 4 characters of S from right to left. w* si
The last set of S contains 3 characters (ell), which is less than 4. So a hash symbol # is filled in
that position.
#lle
Example Input/Output 2:
Input:
MAKE HAY WHILE THE SUN SHINES
12
Output:
### ## ##SENIH
S⭑NUS EHT EL
IHW*YAH*EKAM
 */
import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char s[]=sc.nextLine().trim().toCharArray();
        int N=sc.nextInt(),ind=0,val=0;
        sc.close();
        for(int i=0;i<s.length;i++)
        {
            if(s[i]==' ')
            {
                s[i]='*';
            }
        }
        char arr[][]=new char [10001][N];
        for(int i=0;i<100001;i++)
        {
            boolean flag=false;
            if(ind==s.length)
            {
                break;
            }
            for(int j=0,k=N-1;j<N;j++,k--)
            {
                if(s.length>ind)
                {
                    arr[val][k]=s[ind++];
                }
                else
                {
                    flag=true;
                    arr[i][k]='#';
                }
            }
            val++;
            if(flag)
            {
                break;
            }
        }
        for(int i=val-1;i>=0;i--)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}
}
