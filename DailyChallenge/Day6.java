/*
 Toggle Exactly One Bit

 The program must accept an integer N as the input. The program must print the maximum possible
integer which is formed by toggling exactly one bit in the binary representation of N as the output. If
all the bits in the binary representation of N are 1, the program must print the value of N.
Boundary Condition(s):
2 <= N < 2^31
Input Format:
The first line contains N.
Output Format:
The first line contains an integer based on the given conditions.
Example Input/Output 1:
Input:
22
Output:
30
Explanation:
The binary representation of 22 is 10110.
If the first bit is toggled, the binary representation becomes 00110 and its decimal equivalent is 6.
If the second bit is toggled, the binary representation becomes 11110 and its decimal equivalent is 30.
If the third bit is toggled, the binary representation becomes 10010 and its decimal equivalent is 18.
If the fourth bit is toggled, the binary representation becomes 10100 and its decimal equivalent is 20.
If the fifth bit is toggled, the binary representation becomes 10111 and its decimal equivalent is 23.
Here the maximum integer value is 30. So it is printed as the output.
Example Input/Output 2:
Input:
15
Output:
15
 */

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),num=N,arr[]=new int[10001],temp[]=new int[10001],index=0,max=N;
        sc.close();
        while(num>0)
        {
            temp[index]=num%2;
            arr[index]=temp[index];
            index++;
            num/=2;
        }
        for(int i=0;i<index;i++)
        {
            int sum=0;
            for(int j=0;j<index;j++)
            {
                arr[j]=temp[j];
            }
            if(arr[i]==0)
            {
                arr[i]=1;
            }
            else
            {
                arr[i]=0;
            }
            for(int j=0;j<index;j++)
            {
                int power=(int)Math.pow(2,j);
                sum+=arr[j]*power;
            }
            if(max<sum)
            {
                max=sum;
            }
        }
        System.out.print(max);
	}
}
