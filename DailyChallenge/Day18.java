/*
 Count - First 1 Bit

 The program must accept an integer N as the input. The program must print the count of integers
from 1 to N which are having 1 as the first bit in their binary representation. The number of bits to
consider to find the first bit is the number of bits in the binary representation of N. So you must pad
the leading zeros depending on the number of bits in the binary representation N.
Boundary Condition(s):
1 <= N <= 10^6
Input Format:
The first line contains N.
Output Format:
The first line contains the count of integers from 1 to N which are having 1 as the first bit in their
binary representation.
Example Input/Output 1:
Input:
10
Output:
3
Explanation:
Here N = 10.
The number of bits in the binary representation of 10 is 4. So the number of bits to consider to find
the first bit is 4.
The binary representation of the integers from 1 to 10 are given below.
0001
0010
0011
0100
0101
0110
0111
1000
1001
1010
There are three binary representations having 1 as the first bit (1000, 1001 and 1010).
So 3 is printed as the output.
Example Input/Output 2:
Input:
16
Output:
1
 */

import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),num=N,digitCount=0,count=0;
        while(num>0)
        {
            num/=2;
            digitCount++;
        }
        sc.close();
        for(int i=1;i<=N;i++)
        {
            int arr[]=new int[digitCount],ind=digitCount-1,val=i;
            while(val>0)
            {
                arr[ind--]=val%2;
                val/=2;
            }
            if(arr[0]==1)
            {
                count++;
            }
        }
        System.out.print(count);
	}
}
