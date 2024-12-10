/*
 Word - Alterate Min & max Length

The program must accept a string S containing multiple words as the input. The program must print
the word which has the minimum length among the first word and the last word in S. Then the
program must print the word which has the maximum length among the second word and the last but
one word in S. Similarly, the program must print the remaining words alternatively. If the lengths of the
two words are equal in comparison, then the program must print them in the order of their
occurrence.
Note: The string S always contains an even number of words.
Boundary Condition(s):
3 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains the words in S based on the given conditions.
Example Input/Output 1:
Input:
A cup of tea
Output:
A cup
Explanation:
The given string is "A cup of tea".
The word with the minimum length among the first word "A" and the last word "tea" is "A".
The word with the maximum length among the second word "cup" and the last but one word "of" is
"cup".
Hence the output is
A cup
Example Input/Output 2:
Input:
God helps those who help themselves
Output:
God helps who
Example Input/Output 3:
Input:
All good things must come to an end
Output:
All end good to must come
 */

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s[]=sc.nextLine().trim().split("\\s+");
        int count=0;
        sc.close();
        for(int i=0,j=(s.length)-1;i<(s.length)/2;i++,j--)
        {
            count++;
            int len1=s[i].length(),len2=s[j].length();
            if(len1==len2)
            {
                System.out.print(s[i]+" "+s[j]+" ");
            }
            else if(count%2!=0)
            {
                System.out.printf("%s ",len1<len2?s[i]:s[j]);
            }
            else if(count%2==0)
            {
                System.out.printf("%s ",len1>len2?s[i]:s[j]);
            }
        }
	}
}
