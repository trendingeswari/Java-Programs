/*
Binary Pattern

 The program must accept an integer N as the input. The program must print all possible binary
representations using 1 bit. Then the program must print all possible binary representations using 2
bits. Similarly, the program must print all possible binary representations till N bits as the output.
Boundary Condition(s):
1 <= N <= 12
Input Format:
The first line contains N.
Output Format:
The lines, each contains a binary representation as per the given conditions.
Example Input/Output 1:
Input:
3
Output:
0
1
0 0
0 1
1 0
1 1
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1
Explanation:
Here N = 3.
All possible binary representations using 1 bit are 0 and 1.
All possible binary representations using 2 bits are 00, 01, 10 and 11.
All possible binary representations using 3 bits are 000, 001, 010, 011, 100, 101, 110 and 111.
Example Input/Output 2:
Input:
2
Output:
0
1
0 0
0 1
1 0
1 1
 */

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[]={2,4,8,16,32,64,128,256,512,1024,2048,4096};
        sc.close();
        for(int i=0;i<=N-1;i++)
        {
            int num=arr[i],val=0;
            for(int j=1;j<=num;j++)
            {
                int ans=val,a[]=new int[5001],ind=0;
                if(ans==0)
                {
                    for(int k=0;k<=i;k++)
                    {
                        System.out.print("0 ");
                    }
                    System.out.println();
                }
                else
                {
                    while(ans>0)
                    {
                        a[ind++]=ans%2;
                        ans/=2;
                    }
                    while(ind!=i+1)
                    {
                        a[ind++]=0;
                    }
                    for(int k=ind-1;k>=0;k--)
                    {
                        System.out.print(a[k]+" ");
                    }
                    System.out.println();
                }
                val++;
            }
        }
	}
}
