/*
 
Binary - Vowels/Consonants

The program must accept an integer N as the input. The program must find the binary representation of N. Then the program must form a string S by replacing Os with the lower case vowels and 1s with the lower case consonants circularly in alphabetical order. Finally, the program must print the string S as the output.
Boundary Condition(s):
1 <= N < 2^31
Input Format:
The first line contains N.
Output Format:
The first line contains S.
Example Input/Output 1:
Input:
528
Output: baeiocuaei
Explanation:
Here N=528, the binary representation of 528 is 1000010000.
After replacing Os with the lower case vowels circularly in alphabetical order, the string becomes 1aeio1uaei.
After replacing 1s with the lower case consonants circularly in alphabetical order, the string becomes baeiocuaei.
So baeiocuaei is printed as the output.

Example Input/Output 2:
Input:
50
Output: bcaedi
Max Execution Time Limit: 50 millisecs
 */
import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String S=sc.nextLine();
        long N=Long.parseLong(S);
        System.out.println();
        String bin=Long.toBinaryString(N);
        char str[]=bin.toCharArray();
        char v[]={'a','e','i','o','u'},c='a';
        long ind=0;
        sc.close();
        for(long i=0;i<str.length;i++)
        {
            if(str[(int)i]=='0')
            {
                if(ind<=v.length)
                {
                    System.out.print(v[(int)ind++]);
                }
                if(ind==v.length)
                {
                    ind=0;
                }
            }
            else if(str[(int)i]=='1')
            {
                c=isVowel(c);
                System.out.print(c);
            }
        }
	}
	public static char isVowel(char c)
	{
	    c=Character.toLowerCase(c);
	    boolean flag=true;
	    while(flag)
	    {
	        if(c=='z')
	        {
	            c='a';
	        }
	        else
	        {
	            c++;
	        }
	        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	        {
	            continue;
	        }
	        else{
	            flag=false;
	            return c;
	        }
	    }
	    return 'e';
	}
}
