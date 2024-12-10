/*
 
Matrix - Integers / Alphabets
The program must accept a character matrix of size RxC containing only alphabets and digits as the input. The program must find the number of alphabets A and the number of digits D in the given character matrix. Then the program must print the output based on the following conditions.
- If the value of A is a perfect square, then the program must print all the alphabets as a square matrix.
- If the value of D is a perfect square, then the program must print all the digits as a square matrix.
-If both A and D are perfect squares, then the program must print the square matrix based on the maximum value between A and D.
-If both A and D are perfect squares and equal, then the program must print all the alphabets as a square matrix.
Note: At least one of the values A and D is always a perfect square.
Boundary Condition(s):
2 <= R, C <= 50
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C characters separated by a space. Output Format:
The line(s) containing a square matrix based on the given conditions.

Example Input/Output 1:
Input: 33
a 1 b
cde
234
Output:
12
34
Explanation:
The number of alphabets A is 5 and the number of digits D is 4. Here 4 is a perfect square and 5 is not a perfect square.
So all the 4 digits are printed as a square matrix (4 = 2 * 2). Hence the output is
12
34
Example Input/Output 2:
Input:
34
U 5 e P
ZX o 8
w E4 r
Output: U e P
ZX o
w Er
Example Input/Output 3:
Input:
23
1 a 2
345
Output:
a
 */
import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt(),ncount=0,acount=0;
        String s[]=new String [R];
        int arr1[]=new int[10001],ind1=0,ind2=0;
        char arr2[]=new char[10001];
        sc.nextLine();
        for(int i=0;i<R;i++)
        {
            s[i]=sc.nextLine();
            String str[]=s[i].split("\\s+");
            for(int j=0;j<str.length;j++)
            {
                if(Character.isDigit(str[j].charAt(0)))
                {
                    arr1[ind1++]=Integer.parseInt(str[j]);
                    ncount++;
                }
                else
                {
                    acount++;
                    arr2[ind2++]=str[j].charAt(0);
                }
            }
        }
        sc.close();
        int s1=(int)Math.sqrt(ncount),s2=(int)Math.sqrt(acount);
        boolean flagn=false,flaga=false;
        if((s1*s1)==ncount)
        {
            flagn=true;
        }
        if((s2*s2)==acount)
        {
            flaga=true;
        }
        int val=0;
        if(flagn && flaga)
        {
            if(s1==s2||s1<s2)
            {
                for(int i=0;i<s2;i++)
                {
                    for(int j=0;j<s2;j++)
                    {
                        System.out.print(arr2[val++]+" ");
                    }
                    System.out.println();
                }
            }
            else if(s1>s2)
            {
                for(int i=0;i<s1;i++)
                {
                    for(int j=0;j<s1;j++)
                    {
                        System.out.print(arr1[val++]+" ");
                    }
                    System.out.println();
                }
            }
        }
        else if(flagn)
        {
            for(int i=0;i<s1;i++)
            {
                for(int j=0;j<s1;j++)
                {
                    System.out.print(arr1[val++]+" ");
                }
                System.out.println();
            }
        }
        else if(flaga)
        {
            for(int i=0;i<s2;i++)
            {
                for(int j=0;j<s2;j++)
                {
                    System.out.print(arr2[val++]+" ");
                }
                System.out.println();
            }
        }
	}
}
