/*
 Replace vowel With 1

 The program must accept a string S as the input. The program must replace all the vowels in the string
S with 1. Then the program must print the modified string and the count of vowels C in the string S as
the output. If the string S contains characters other than alphabets, the program must print Invalid as
the output.
Boundary Condition(s):
1 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains the modified string and C separated by a space or contains the string value
"Invalid".
Example Input/Output 1:
Input:
AeFloT
Output:
11Fl1T 3
Explanation:
The count of vowels in the string AeFloT is 3 and they are A, e and o.
After replacing the vowels with 1, the string becomes 11Fl1T.
Hence the output is
11Fl1T 3
Example Input/Output 2:
Input:
AB1E
Output:
Invalid
 */

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char s[]=sc.nextLine().toCharArray();
        int count=0;
        sc.close();
        for(int i=0;i<s.length;i++)
        {
            if(Character.isLetter(s[i]))
            {
                if(isvowel(s[i]))
                {
                    count++;
                    s[i]='1';
                }
            }
            else
            {
                System.out.print("Invalid");
                return ;
            }
        }
        String str=new String(s);
        System.out.print(str+" "+count);
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
