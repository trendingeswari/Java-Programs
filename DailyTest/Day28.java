/*
Least Possible Base - Decimal Equivalent

The program must accept a string S representing a value in any base from 2 to 36 as the input.
The program must find the least possible base of S and print its decimal equivalent as the output. 
The face values for the symbols are given below. 
0 -> 0 
1 -> 1 
2 -> 2 
... 
9 -> 9 
A -> 10 
B -> 11 
C -> 12 
... 
X -> 33 
Y -> 34 
Z -> 35 
Boundary Condition(s): 1 <= Length of S <= 6 
Input Format: The first line contains S. 
Output Format: The first line contains the decimal equivalent of S. 
Example Input/Output 1: 
Input: 
11 
Output: 
3 
Explanation: The least possible base for 11 is 2. The decimal equivalent of (11)2 is 3. So 3 is printed as the output. 
Example Input/Output 2: 
Input: 
21A 
Output: 
263 
Explanation: The least possible base for 21A is 11. The decimal equivalent of (26A)11 is 263. So 263 is printed as the output. 
Example Input/Output 3: 
Input: 
XY 
Output: 
1189 
Explanation: The least possible base for XY is 35. The decimal equivalent of (XY)35 is 1189. So 1189 is printed as the output.
 */

import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char s[]=sc.nextLine().toCharArray();
        int base=findLeastBase(s);
        long deci=convertToDec(s,base);
        sc.close();
        System.out.print(deci);
	}
	public static int findLeastBase(char s[])
	{
	    int maxDigit=0;
	    for(int i=0;i<s.length;i++)
	    {
            int value=getnum(s[i]);	          
	        if(value>maxDigit)
	        {
	            maxDigit=value;
	        }
	    }
	    return maxDigit+1;
	}
	public static int getnum(char c)
	{
	    if(Character.isDigit(c))
	    {
	        return c-'0';
	    }
	    return Character.toUpperCase(c)-'A'+10;
	}
	public static long convertToDec(char s[],int base)
	{
	    long dec=0;
	    for(int i=0;i<s.length;i++)
	    {
	        dec=dec*base+getnum(s[i]);
	    }
	    return dec;
	}
}
