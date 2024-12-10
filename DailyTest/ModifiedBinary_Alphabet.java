/*
 The program must accept an integer N as the input. The program must find the binary representation
of N. Then the program must replace all the 1's by the lower case alphabets from 'a' (left to right).
Then the program must replace all the 0's by the upper case alphabets from 'A' (right to left). Finally,
the program must print the modified representation of N as the output.
Boundary Condition(s):
1 <= N <= 2^26
Input Format:
The first line contains N.
Output Format:
The first line contains the modified representation of N.
Example Input/Output 1:
Input:
34
Output:
aDCBbA
Explanation:
The binary representation of 34 is 100010.
After replacing all the 1's by the lower case alphabets from 'a' (left to right), the binary representation
becomes a000b0.
After replacing all the 0's by the upper case alphabets from 'A' (right to left), the binary representation
becomes aDCBbA.
Hence the output is aDCBbA
Example Input/Output 2:
Input:
19
Output:
aBAbc
 */
import java.util.*;
public class ModifiedBinary_Alphabet {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        int N=sc.nextInt(),bin[]=new int[1001],ind=0,e1=0,e2=0,e3=0;
        sc.close();
        char value1[]=new char [30],value2[]=new char [30],first='a',last='A';
        while(N>0)
        {
            bin[ind++]=N%2;
            N/=2;
        }
        for(int i=ind-1;i>=0;i--)
        {
            if(bin[i]==1)
            {
                value1[e1++]=first++;
            }
        }
        for(int j=0;j<ind;j++)
        {
            if(bin[j]==0)
            {
                value2[e2++]=last++;
            }
        }
        for(int j=ind-1;j>=0;j--)
        {
            if(bin[j]==1)
            {
                System.out.print(value1[e3++]);
            }
            if(bin[j]==0)
            {
                System.out.print(value2[--e2]);
            }
        }
	}
}
