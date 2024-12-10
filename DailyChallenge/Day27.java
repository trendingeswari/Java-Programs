/*
 String Traversal - Game

 The program must accept two string values S1 and S2 are of equal length (containing only alphabets)
as the input. The rules of the string traversal game are given below.
- The game always starts from the last character of S1.
- If both the characters in S1 and S2 are consonants or vowels in the same position, then traverse in
up/down direction between S1 and S2. Else traverse in the left direction in the same string.
- The game ends when there is no character to traverse in S1 and S2.
The program must print the characters that are used in the string traversal game as the output.
Boundary Condition(s):
1 <= Length of S1, S2 <= 1000
Input Format:
The first line contains S1.
The second line contains S2.
Output Format:
The first line contains the characters that are used in the string traversal game.
Example Input/Output 1:
Input:
cat
dog
Output:
tgoacd
Explanation:
Here S1 = "cat" and S2 = "dog".
The game always starts from the last character of S1.
So the first character traversed in the game is t.
Then compare the characters at the same position(3). Here both are consonants(t, g). So the second
character traversed in the game is g.
Then the only possible way to traverse is moving towards left. So the third character traversed in the
game is o.
Then compare the characters at the same position(2). Here both are vowels(o, a). So the fourth
character traversed in the game is a.
Then the only possible way to traverse is moving towards left. So the fifth character traversed in the
game is c.
Then compare the characters at the same position(1). Here both are consonants(c, d). So the sixth
character traversed in the game is d.
So tgoacd is printed as the output.
Example Input/Output 2:
Input:
SKILLRACK
BACDFEGHJ
Output:
KJHCARLFDLIKSB
 */

import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char s1[]=sc.nextLine().toCharArray(),s2[]=sc.nextLine().toCharArray();
        boolean flag=false;
        sc.close();
            for(int i=s1.length-1;i>=0;i--)
            {
                if(i==s1.length-1)
                {
                    System.out.print(s1[i]);
                    if(bottom(i,s2,s1))
                    {
                        System.out.print(s2[i]);
                        flag=true;
                        continue;
                    }
                }
                else if(flag)
                {
                    if(bottom(i,s2,s1))
                    {
                        System.out.print(s2[i]+""+s1[i]);
                        flag=false;
                        continue;
                    }
                    else{
                        System.out.print(s2[i]);continue;
                    }
                }
                else if(flag==false)
                {
                    if(top(i,s1,s2))
                    {
                        System.out.print(s1[i]+""+s2[i]);
                        flag=true;
                        continue;
                    }
                    else{
                        System.out.print(s1[i]);
                    }
                }
            }
	}
	public static boolean top(int index,char s1[],char s2[])
	{
	    if((isVowel(s1[index]) && isVowel(s2[index]))||(!isVowel(s1[index]) && !isVowel(s2[index])))
	    {
	        return true;
	    }
	    return false;
	}
	public static boolean bottom(int index,char s2[],char s1[])
	{
	    if((isVowel(s2[index]) && isVowel(s1[index]))|| (!isVowel(s2[index]) && !isVowel(s1[index])))
	    {
	        return true;
	    }
	    return false;
	}
	public static boolean isVowel(char c)
	{
	    c=Character.toLowerCase(c);
	    return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
	}
}
