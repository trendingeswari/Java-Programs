/*
 The program must accept an integer N as the input. The program must print the Nth
integer where all
the digits are prime as the output.
Note: The integers that contain only prime digits are 2, 3, 5, 7, 22, 23, 25 and so on.
Boundary Condition(s):
1 <= N <= 1000
Input Format:
The first line contains N.
Output Format:
The first line contains the Nth
integer where all the digits are prime.
Example Input/Output 1:
Input:
6
Output:
23
Explanation:
The 6
th
integer with the prime digits is 23.
Hence the output is 23
Example Input/Output 2:
Input:
11
Output:
35
 */

import java.util.Scanner;

public class NthIntegerWithPrimeDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),count=0,num=0;
        sc.close();
        for(int i=2;count<n;i++)
        {
            int index=i;
            boolean flag=true;
            while(index>0)
            {
                int val=index%10;
                String s=String.valueOf(val);
                if((s.contains("0"))||(s.contains("1"))||(s.contains("4"))||(s.contains("6"))||(s.contains("8"))||(s.contains("9")))
                {
                    flag=false;
                    break;
                }
                index/=10;
            }
            if(flag)
            {
                count++;
                num=i;
            }
        }
        System.out.print(num);
	}
}
