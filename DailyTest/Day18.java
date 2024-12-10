/*
 String - Common words

 The program must accept two space separated string values S1, S2 and an integer N as the input. The
program must print the common words of size N in both the string values based on their order of
occurrence in S1 as the output. If the common words are repeated more than once in both the string
values, the program must print such words only once. If there are no such common words then the
program must print -1 as the output.
Boundary Condition(s):
3 <= Length of S1, S2 <= 1000
1 <= N <= 20
Input Format:
The first line contains S1.
The second line contains S2.
The third line contains N.
Output Format:
The first line contains the common word(s) of size N separated by a space or -1.
Example Input/Output 1:
Input:
He wore a turban made of gold
He was a young man of great promise
2
Output:
He of
Explanation:
The common words of size 2 in both the string values are He and of.
Hence the output is He of.
Example Input/Output 2:
Input:
the cat is under the bed
the Cat is beside the table
3
Output:
the
Example Input/Output 3:
Input:
If you want to build a solid structure
you need to put down the first few blocks in the right place
4
Output:
-1

 */

import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s1[]=sc.nextLine().split("\\s+"),s2[]=sc.nextLine().split("\\s+");
        int N=sc.nextInt(),len=s1.length;
        boolean flag=true;
        sc.close();
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(s1[i].equals(s1[j]))
                {
                    for(int k=j;k<len-1;k++)
                    {
                        s1[k]=s1[k+1];
                    }
                    len--;j--;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            boolean pre=false;
            for(int j=0;j<s2.length;j++)
            {
                if(s2[j].length()==N && (s2[j].equals(s1[i])))
                {
                    pre=true;
                    flag=false;
                }
            }
            if(pre)
            {
                System.out.print(s1[i]+" ");
            }
        }
        if(flag)
        {
            System.out.print("-1");
        }
	}
}
