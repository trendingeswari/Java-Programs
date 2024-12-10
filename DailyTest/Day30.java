/*
Longest Substring - Same Characters

The program must accept a string S as the input. 
The program must print all possible longest substring values that are formed using a character in the order of their occurrence. 
If there is no such substring in S, the program must print -1 as the output.
Note: The string S is case insensitive.
Boundary Condition(s):
2 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains all possible longest substring values that are formed using a character or -1.
Example Input/Output 1:
Input:
aaabbccc
Output:
aaa ccc
Explanation:
In the given string aaabbccc, the longest possible substring values that are formed using a
character are aaa and ccc.
Hence the output is
aaa ccc

Example Input/Output 2:
Input:
XXyyyy33333xxxZZzzzAaAaA
Output:
33333 ZZzzz AaAaA
Example Input/Output 3:
Input:
pqrs@87
Output:
-1
 */

import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String e=sc.nextLine(),str="";
        char s[]=e.toCharArray();
        char val[]=e.toLowerCase().toCharArray();
        sc.close();
        for(int i=0;i<val.length-1;i++)
        {
            if(val[i]==val[i+1])
            {
                str+=s[i]+"";
            }
            else
            {
                str+=s[i]+"";
                str+=" ";
            }
        }
        if(val[val.length-2]==val[val.length-1])
        {
            str+=s[val.length-1]+"";
        }
        int max=0;
        String ans[]=str.split("\\s+");
        for(int i=0;i<ans.length;i++)
        {
            int value=ans[i].length();
            if(value>max)
            {
                max=value;
            }
        }
        if(max==1)
        {
            System.out.print("-1");return;
        }
        for(int i=0;i<ans.length;i++)
        {
            if((ans[i].length())==max)
            {
                System.out.print(ans[i]+" ");
            }
        }
	}
}
