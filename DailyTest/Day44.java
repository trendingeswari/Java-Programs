/*
 
Same Frequency Pattern
The program must accept two string values $1 and S2 of equal length as the input. The program must print yes if the two string values have the same frequency pattern. Else the program must print no as the output.
If the two string values S1 and S2 have the same frequency pattern, then the number of characters in each frequency in both S1 and S2 will be the same.
Consider S1 = "apple" and S2 = "tenth".
There are 3 characters that have occurred once in both S1 and S2 (ale and enh).
There is 1 character that has occurred twice in both S1 and S2 (p and t).
Here both S1 and S2 have the same frequency pattern.
Boundary Condition(s):
1 <= Length of S1, S2 <= 1000
Input Format:
The first line contains S1.
The second line contains S2.
Output Format:
The first line contains yes or no.

Example Input/Output 1:
Input:
abbbbcccdd
ppppqqrrrs
Output:
yes
Explanation:
Here S1 = abbbbcccdd and S2 = ppppqqrrrs.
Frequency 1 -> a in S1 and s in S2.
Frequency 2 -> d in S1 and q in S2. Frequency 3 -> c in S1 and r in S2.
Frequency 4 -> b in S1 and p in S2.
Both S1 and S2 have the same frequency pattern. So yes is printed as the output.
Example Input/Output 2:
Input:
BOok
Look
Output:
no
 */
import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String str1=sc.nextLine(),str2=sc.nextLine();
        char s1[]=str1.toCharArray(),s2[]=str2.toCharArray(),n1[]=str1.toCharArray(),n2[]=str2.toCharArray();
        int len1=s1.length,len2=s2.length,a1[]=new int[len1],a2[]=new int[len2],ind1=0,ind2=0;
        sc.close();
        for(int i=0;i<len1;i++)
        {
            for(int j=i+1;j<len1;j++)
            {
                if(n1[i]==n1[j])
                {
                    for(int k=j;k<len1-1;k++)
                    {
                        n1[k]=n1[k+1];
                    }
                    len1--;j--;
                }
            }
        }
        for(int i=0;i<len2;i++)
        {
            for(int j=i+1;j<len2;j++)
            {
                if(n2[i]==n2[j])
                {
                    for(int k=j;k<len2-1;k++)
                    {
                        n2[k]=n2[k+1];
                    }
                    len2--;j--;
                }
            }
        }
        for(int i=0;i<len1;i++)
        {
            int count=0;
            for(int j=0;j<s1.length;j++)
            {
                if(n1[i]==s1[j])
                {
                    count++;
                }
            }
            a1[ind1++]=count;
        }
        for(int i=0;i<len2;i++)
        {
            int count=0;
            for(int j=0;j<s2.length;j++)
            {
                if(n2[i]==s2[j])
                {
                    count++;
                }
            }
            a2[ind2++]=count;
        }
        for(int i=0;i<ind1;i++)
        {
            boolean flag=false;
            for(int j=0;j<ind2;j++)
            {
                if(a1[i]==a2[j])
                {
                    a2[j]=-1;
                    flag=true;
                }
            }
            if(flag==false)
            {
                System.out.print("no");return;
            }
        }
        System.out.print("yes");
	}
}
