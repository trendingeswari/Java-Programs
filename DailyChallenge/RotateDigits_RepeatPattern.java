/*
 The program must accept an integer N as the input. The program must print the desired pattern as
shown in the Example Input/Output section.
Note: All the digits in N are not zeroes.
Boundary Condition(s):
11 <= N <= 99999999
Input Format:
The first line contains N.
Output Format:
The lines (the number of lines is equal to the number of digits in N) contain the desired pattern as
shown in the Example Input/Output section.
Example Input/Output 1:
Input:
241
Output:
22-4444-1
2222-4-11
2-44-1111
Explanation:
Here N=241, the number of digits in 241 is 3. So the pattern contains 3 lines.
In the first line, the digit 2 is printed 2 times, 4 is printed 4 times and 1 is printed 1 time.
After rotating the digits in 241 in the clockwise direction, the integer becomes 412.
In the second line, the digit 2 is printed 4 times, 4 is printed 1 time and 1 is printed 2 times.
After rotating the digits in 412 in the clockwise direction, the integer becomes 124.
In the third line, the digit 2 is printed 1 time, 4 is printed 2 times and 1 is printed 4 times.
Example Input/Output 2:
Input:
57
Output:
55555-7777777
5555555-77777
Example Input/Output 3:
Input:
2131
Output:
22-1-333-1
2-111-3-11
222-1-33-1
2-11-3-111
 */
import java.util.*;
public class RotateDigits_RepeatPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a[]=sc.nextLine().toCharArray();
        sc.close();
        int b[]=new int[a.length],len=a.length;
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i]-'0';
        }
        System.out.println();
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                for(int k=0;k<b[j];k++)
                {
                    System.out.print(a[j]);
                }
                    if(j!=len-1)
                    {
                        System.out.print("-");
                    }
                
            }
            System.out.println();
            int first=b[0],ind=0;
            for(int j=0;j<len-1;j++)
            {
                b[ind++]=b[j+1];
            }
            b[ind++]=first;
        }
	}
}
