/*
 The program must accept a string S containing multiple words as the input. The program must
print yes if the last character of each word is equal to the first character of its previous word. Else the
program must print no as the output.
Note: The alphabets in the string S is always case insensitive.
Boundary Condition(s):
5 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains yes or no.
Example Input/Output 1:
Input:
Apple Guava Fig
Output:
yes
Explanation:
In the given string Apple Guava Fig, the last character of each word is equal to the first character of its
previous word.
So yes is printed.
Example Input/Output 2:
Input:
A thing begun is half done
Output:
no
 */

import java.util.Scanner;

public class ConnectedWordsOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String n=sc.nextLine();
        sc.close();
        String s[]=n.split(" ");
        for(int i=0;i<(s.length)-1;i++)
        {
            char a[]=s[i].toCharArray(),b[]=s[i+1].toCharArray();
            int len=b.length;
            char f=a[0],l=b[len-1];
            f=Character.toLowerCase(f);l=Character.toLowerCase(l);
            if(f!=l)
            {
                System.out.print("no");
                return ;
            }
        }
        System.out.print("yes");
	}
}
