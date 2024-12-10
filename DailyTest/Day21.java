/*
 

Same different count

without revealing it to Mr.Y and conveys the number of letters in the name N to his friend Y. Mr.Y tries
to accurately guess the letters in N and comes up with a name G. The program must accept N and G
as the input. The program must print how many letters were guessed right (exactly in the same
position) and how many letters were guessed in the incorrect position(s).
Note: The length of N and G are always equal.
Boundary Condition(s):
1 <= Length of N, G <= 100
Input Format:
The first line contains N and G separated by a space.
Output Format:
The first line contains the number of letters guessed right (exactly in the same position).
The second line contains the number of letters guessed in the incorrect position(s).
Example Input/Output 1:
Input:
aaaw wwaa
Output:
1
2
Explanation:
In the two names aaaw and wwaa, the letter 'a' was guessed right (exactly in the same position). So
the count 1 is printed in the first line.
In the two names aaaw and wwaa, the letters 'a' and 'w' were guessed in the incorrect position(s). So
the count 2 is printed in the second line.
Example Input/Output 2:
Input:
abcd ABcd
Output:
2
0
Example Input/Output 3:
Input:
FDGRH ASDFR
Output:
0
3

 */

import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner (System.in);
		String s[]=sc.nextLine().split("\\s+");
		char s1[]=s[0].toCharArray(),s2[]=s[1].toCharArray();
        int ncount=0,gcount=0,n1=s1.length,n2=s2.length;
        System.out.println();
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(i==j && s1[i]==s2[j])
                {
                    ncount++;
                    for(int k=i;k<n1-1;k++)
                    {
                        s1[k]=s1[k+1];
                    }
                    n1--;
                }
            }
        }
        if(s1[n1-1]==s2[n2-1])
        {
            ncount++;
            n1--;
        }
        for(int i=0;i<n1;i++)
        {
            for(int j=i+1;j<n1;j++)
            {
                if(s1[i]==s1[j])
                {
                    for(int k=j;k<n1-1;k++)
                    {
                        s1[k]=s1[k+1];
                    }
                    n1--;j--;
                }
            }
        }
        for(int i=0;i<n1;i++)
        {
            boolean pre=false;
           for(int j=0;j<n2;j++)
           {
               if(s1[i]==s2[j])
               {
                   pre=true;
                   break;
               }
           }
           if(pre)
           {
               gcount++;
           }
        }
        System.out.print(ncount+"\n"+gcount);
	}
}
