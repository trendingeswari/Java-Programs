/*
 
Sort Digits - Odd/Even
The program must accept N integers as the input. For each integer X among the N integers, the program must sort the digits in X based on the following conditions.
- If X is even, the program must sort the digits in X except the unit digit in descending order. - Else the program must sort the digits in X except the unit digit in ascending order.
Finally, the program must print the sum of the N modified integers as the output.
Boundary Condition(s):
1 <= N <= 100
10 <= Each integer value <= 10^8
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains the sum of modified the N integers as per the given conditions.

Example Input/Output 1: Input:
4
1234 967 20043 100
Output: 4254
Explanation:
The first integer 1234 is an even integer. After sorting the digits in 1234 except the unit digit in descending order, the integer becomes 3214.
The second integer 967 is an odd integer. After sorting the digits in 967 except the unit digit in ascending order, the integer becomes 697.
The third integer 20043 is an odd integer. After sorting the digits in 20043 except the unit digit in ascending order, the integer becomes 243.
The fourth integer 100 is an even integer. After sorting the digits in 100 except the unit digit in descending order, the integer becomes 100.
The sum of the integers 3214, 697, 243 and 100 is 4254.
So 4254 is printed as the output.
Example Input/Output 2:
Input:
7
321 84 55 67 901 826 230
Output: 1674
 */
import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char s[]=sc.nextLine().toCharArray();
        int len=s.length,num=s[len-2]-'0';
        sc.close();
        for(int i=0;i<=8;i+=2)
        {
            if(((num*10)+i)%4==0)
            {
                for(int j=0;j<len-1;j++)
                {
                    System.out.print(s[j]);
                }
                System.out.print(i+" ");
            }
        }
	}
}
