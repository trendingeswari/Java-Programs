/*
 Reverse Equal Vowel and Consonent

 The program must accept a string S containing multiple words as the input. The program must reverse
the words which contains equal number of vowels and consonants. Then the program must print the
modified string S as the output.
Boundary Condition(s):
4 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains the modified string S.
Example Input/Output 1:
Input:
hi runout the onion
Output:
ih tuonur the onion
Explanation:
The word hi contains equal number of vowels(1) and consonants(1). So it is reversed as ih.
The word runout contains equal number of vowels(3) and consonants(3). So it is reversed as tuonur.
The word the not contains equal number of vowels(1) and consonants(2). So it is kept as it is.
The word onion not contains equal number of vowels(3) and consonants(2). So it is kept as it is.
Hence the output is
ih tuonur the onion
Example Input/Output 2:
Input:
CODE BLOCKS
Output:
EDOC BLOCKS

 */

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s[]=sc.nextLine().split("\\s+");
        sc.close();
        for(int i=0;i<s.length;i++)
        {
            char str[]=s[i].toCharArray();
            int vcount=0,ccount=0;
            for(int j=0;j<str.length;j++)
            {
                if(isvowel(str[j]))
                {
                    vcount++;
                }
                else
                {
                    ccount++;
                }
            }
            if(vcount==ccount)
            {
                for(int j=str.length-1;j>=0;j--)
                {
                    System.out.print(str[j]);
                }
            }
            else
            {
                for(int j=0;j<str.length;j++)
                {
                    System.out.print(str[j]);
                }
            }
            if(i!=s.length-1)
            {
                System.out.print(" ");
            }
        }
	}
	public static boolean isvowel(char c)
	{
	    c=Character.toLowerCase(c);
	    return(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
	}
}
