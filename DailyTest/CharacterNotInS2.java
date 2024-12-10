/*
 The program must accept two string values S1 and S2 as the input. The program must print the
number of characters in the string S1 that are not present in the string S2 as the output.
Boundary Condition(s):
1 <= Length of S1, S2 <= 100
Input Format:
The first line contains S1.
The second line contains S2.
Output Format:
The first line contains the number of characters in the string S1 that are not present in the string S2.
Example Input/Output 1:
Input:
skillrack
rockstar
Output:
4
Explanation:
The four characters in the string skillrack that are not present in the string rockstar are i, l, l and k.
Example Input/Output 2:
Input:
SolarSystem
satellite
Output:
6
Explanation:
The six characters in the string SolarSystem that are not present in the
string satellite are S, o, r, S, y and m.
 */
package DailyTest;

import java.util.Scanner;

public class CharacterNotInS2 {
    public static void main(AbbrevationMatching[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        char[] s1=sc.nextLine().toCharArray(),s2=sc.nextLine().toCharArray();
        int count=0;
        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s2.length;j++)
            {
                if(s1[i]==s2[j])
                {
                    s2[j]='.';
                    s1[i]=',';
                }
            }
        }
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i]!=',')
            {
                count++;
            }
        }
        System.out.print(count);
	}
}
