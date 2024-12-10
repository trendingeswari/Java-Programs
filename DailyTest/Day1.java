/*
 Replace Words - K character
 The program must accept a word W, an integer K and a string S containing multiple words as the
input. The program must replace the words in S having the first K characters of W with the word W.
Then the program must print the modified string S as the output.
Note: Both W and S are case insensitive.
Boundary Condition(s):
1 <= K <= Length of W <= 100
3 <= Length of S <= 1000
1 <= Length of each word in S <= 100
Input Format:
The first line contains W and K separated by a space.
The second line contains S.
Output Format:
The first line contains the modified string S.
Example Input/Output 1:
Input:
skill 3
skillrack helps students to succeed
Output:
skill helps students to succeed
Explanation:
Here W = skill and K = 3. The first three characters in W are ski.
The only word that has the first three characters as ski in the string "skillrack helps students to
succeed" is skillrack. So it is replaced with skill.
Hence the output is
skill helps students to succeed
Example Input/Output 2:
Input:
happy 4
WORK HAPPENS TO LIVE HAPPIER NOT TO HATE
Output:
WORK happy TO LIVE happy NOT TO HATE
Example Input/Output 3:
Input:
#5467 2
@abcd #521A
Output:
@abcd #5467
 */

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char W[]=sc.next().toCharArray();
        int K=sc.nextInt();
        sc.nextLine();
        String S[]=sc.nextLine().split("\\s+"),val=String.valueOf(W);
        sc.close();
        for(int i=0;i<S.length;i++)
        {
            char value[]=S[i].toCharArray();
            if(value.length>=K)
            {
                int count=0;
                for(int j=0;j<K;j++)
                {
                    boolean v=false,w=false;
                    if(Character.isUpperCase(value[j]))
                    {
                        value[j]=Character.toLowerCase(value[j]);
                        v=true;
                        
                    }
                    if(Character.isUpperCase(W[j]))
                    {
                        W[j]=Character.toLowerCase(W[j]);
                        w=true;
                    }
                    if(value[j]==(W[j]))
                    {
                        count++;
                    }
                    if(v)
                    {
                        value[j]=Character.toUpperCase(value[j]);
                    }
                    if(w)
                    {
                        W[j]=Character.toUpperCase(W[j]);
                    }
                }
                if(count==K)
                {
                    System.out.print(val+" ");
                }
                else
                {
                    System.out.print(S[i]+" ");
                }
            }
            else
            {
                System.out.print(S[i]+" ");
            }
        }
	}
}
