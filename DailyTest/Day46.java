/*
 
Toggle Bits in Range

The program must accept three integers N, A and B as the input. The program must toggle the bits in the positions from A to B in the binary representation of N. Then the program must print the modified value of N as the output. If it is not possible to apply the given range in the binary representation of N, then the program must pad the minimum number of leading zeros in the binary representation of N and toggle the bits in the range.
Boundary Condition(s):
1 <= N <= 10^5
1 <= A <B <= 30
Input Format:
The first line contains N.
The second line contains A and B separated by a space.
Output Format:
The first line contains the modified value of N.

Example Input/Output 1:
Input:
16
24
Output: 30
Explanation:
The binary representation of 16 is 10000.
After toggling the bits in the positions from 2 to 4, the binary representation becomes 11110. The decimal equivalent of 11110 is 30.
So 30 is printed as the output.
Example Input/Output 2:
Input:
50
27
Output: 13
Explanation:
The binary representation of 50 is 110010.
Here B = 7 but the binary representation of 50 contains only 6 bits. So one leading zero is padded. Now the binary representation becomes 0110010.
After toggling the bits in the positions from 2 to 7, the binary representation becomes 0001101.
The decimal equivalent of 0001101 is 13.
So 13 is printed as the output.
 */
import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt();
        int arr[]=new int[100001],ind=0,temp[]=new int[100001],val=0,value=0,ans=0;
        sc.close();
        while(N>0)
        {
            temp[val++]=N%2;
            N/=2;
        }
        if(ind<B)
        {
            int num=B-val;
            for(int i=1;i<=num;i++)
            {
                temp[val++]=0;
            }
        }
        for(int i=val-1;i>=0;i--)
        {
            arr[ind++]=temp[i];
        }
        A--;B--;
        for(int i=0;i<ind;i++)
        {
            if(i>=A && i<=B)
            {
                arr[i]=(arr[i]==1)?0:1;
            }
        }
        for(int i=ind-1;i>=0;i--)
        {
            int pow=(int)Math.pow(2,value);
            int sum=arr[i]*pow;
            ans+=sum;
            value++;
        }
        System.out.print(ans);
	}
}
