/*
 
Consonants & Square Brackets

The program must accept a string S containing only alphabets as the input. The program must find the number of consonants C in the string S. Then the program must print the string in (C+1)/2 lines based on the following conditions.
- In the first line, the program must enclose the 1st and Cth consonants within square brackets [ ]. Then the program must print the modified string S.
- In the second line, the program must enclose the 2nd and (C-1)th consonants within the
square brackets [ ]. Then the program must print the modified string S.
- Similarly, the program must print the remaining lines as the output.
Note: At least one consonant is always present in the string S.
Boundary Condition(s):
2 <= Length of S <= 100
Input Format:
The first line contains S.
Output Format:
The first (C+1)/2 lines, each contains a string.

Example Input/Output 1:
Input:
skillrack
Output:
[s]killrac[k]
[s][k]illra[c][k]
[s][k]i[l[r][c][k]
[skira[c][k]
Explanation:
Here S = "skillrack".
The number of consonants in the string S is 7. So (7+1)/2 lines are printed as the output. In the first line, the 1st and 7th consonants are enclosed within the square brackets. Now the string becomes [s]killrac[k].
In the second line, the 2nd and 6th consonants are enclosed within the square brackets. Now the string becomes [s][k]illra[c][k].
In the third line, the 3rd and 5th consonants are enclosed within the square brackets. Now the string becomes [s][k]i[l]|[r]a[c][k].
In the fourth line, the 4th consonant is enclosed within the square brackets.
Now the string becomes [s][k]i[U][U][r]a[c][k].
Example Input/Output 2:
Input:
Zombies
Output:
[Z]ombie[s]
[Z]o[m][b]ie[s]
 */
import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char s[]=sc.nextLine().toCharArray(),arr[]=new char [10001];
        int len=s.length,num=len-1,ind=0,ind1=-1,ind2=-1,ans=0,number[]=new int[10001],n=0;
        sc.close();
        for(int k=0;k<101;k++)
        {
            ind1=-1;ind2=-1;
            if(num<n)
            {
                break;
            }
            for(int i=n;i<len;i++)
            {
                if(!(isvowel(s[i])))
                {
                    ind1=i;
                    for(int j=num;j>=0;j--)
                    {
                        if(!(isvowel(s[j])))
                        {
                            ind2=j;
                            num=j-1;
                            break;
                        }
                    }
                    n=i+1;
                    break;
                }
            }
            if(ind1==ind2)
            {
                number[ans++]=ind1;
            }
            else if(ind1!=-1 && ind2!=-1)
            {
                number[ans++]=ind1;number[ans++]=ind2;
            }
            for(int i=0;i<len;i++)
            {
                boolean pre=true;
                for(int j=0;j<ans;j++)
                {
                    if(number[j]==i)
                    {
                        arr[ind++]='[';arr[ind++]=s[i];arr[ind++]=']';
                        pre=false;
                    }
                }
                if(pre)
                {
                    arr[ind++]=s[i];
                }
            }
            for(int i=0;i<ind;i++)
            {
                System.out.print(arr[i]);
            }
            System.out.println();
            ind=0;
        }
	}
	public static boolean isvowel(char c)
	{
	    c=Character.toLowerCase(c);
	    return(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
	}
}
