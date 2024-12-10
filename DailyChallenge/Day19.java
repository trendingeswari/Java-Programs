/*
Interlace Vowels & Consonants 

The program must accept a string S containing only alphabets as the input. The program must print all
the vowels in the string S in the order of their occurrence interlaced with all the consonants in the
string S in the reverse order of their occurrence as the output.
Boundary Condition(s):
1 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains the string value as per the given condition.
Example Input/Output 1:
Input:
SkillRack
Output:
ikacRllkS
Explanation:
The vowels in the string SkillRack are i and a.
The consonants in the string SkillRack are S, k, l, l, R, c and k.
After interlacing the vowels (in the order of their occurrence) with the consonants (in the reverse order
of their occurrence), the string becomes ikacRllkS.
So ikacRllkS is printed as the output.
Example Input/Output 2:
Input:
Heaven
Output:
enaveH
Example Input/Output 3:
Input:
AEIOU
Output:
AEIOU

 */

import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char s[]=sc.nextLine().toCharArray(),vow[]=new char [s.length],con[]=new char [s.length];
        int ind1=0,ind2=0;
        boolean a=true,e=true,p=true,o=true,u=true,pre=false;
        for(int i=0;i<s.length;i++)
        {
            if(isvowel(s[i]))
            {
                char c=Character.toLowerCase(s[i]);
                if(c=='a'&& a){vow[ind1++]=s[i];a=false;}
                else if(c=='e' && e){vow[ind1++]=s[i];e=false;}
                else if(c=='i' && p){vow[ind1++]=s[i];p=false;}
                else if(c=='o' && o){vow[ind1++]=s[i];o=false;}
                else if(c=='u' && u){vow[ind1++]=s[i];u=false;}
            }
            else {pre=true;}
        }
        int val=0,len=s.length;
        for(int j=0;j<len;j++)
        {
            for(int i=len-1;i>=0;i--)
            {
                if(s[i]==vow[val])
                {
                    val++;
                    for(int k=i;k<len-1;k++)
                    {
                        s[k]=s[k+1];
                    }
                    len--;i--;
                }
            }
        }
        sc.close();
        if(pre){
            for(int i=0;i<ind1;i++)
            {
                if(i==0)
                {
                    System.out.print(vow[i]+""+s[len-1]);
                }
                else
                {
                    System.out.print(vow[i]);
                }
            }
            for(int i=len-2;i>=0;i--)
            {
                System.out.print(s[i]);
            }}
            else
            {
                for(int i=0;i<ind1;i++)
                {
                    System.out.print(vow[i]);
                }
            }
        return ;
	}
	public static boolean isvowel(char c)
	{
	    c=Character.toLowerCase(c);
	    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	    {
	        return true;
	    }
	    return false;
	}
}
