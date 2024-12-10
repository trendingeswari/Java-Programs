/*
 Sum_Remove-K-Zeros

 The program must accept N integers and an integer K as the input. The program must remove the first
K zeroes in the cumulative binary representation of N integers. Then the program must print the sum
of the N modified integer values as the output.
Note: At least K zeroes are always present in the cumulative binary representation of N integers.
Boundary Condition(s):
2 <= N <= 100
1 <= K <= 100
1 <= Each integer value <= 10^4
Input Format:
The first line contains N and K separated by a space.
The second line contains N integers separated by a space.
Output Format:
The first line contains the sum of the N modified integer values.
Example Input/Output 1:
Input:
4 7
21 75 127 86
Output:
179
Explanation:
The binary representation of the 4 integers are 10101, 1001011, 1111111 and 1010110.
After removing the first 7 zeroes in the cumulative binary representation of 4 integers, the integers
become 7, 15, 127 and 30.
So their sum 179 (7+15+127+30 = 179) is printed as the output.
Example Input/Output 2:
Input:
5 5
5 6 8 10 12
Output:
29
Explanation:
The binary representation of the 5 integers are 101, 110, 1000, 1010 and 1100.
After removing the first 5 zeroes in the cumulative binary representation of 5 integers, the integers
become 3, 3, 1, 10 and 12.
So their sum 29 (3+3+1+10+12 = 29) is printed as the output
 */

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),K=sc.nextInt(),arr[]=new int[10001],count=1,sum=0;
        for(int i=0;i<N;i++)
        {
            int num=sc.nextInt(),ind=0,val[]=new int[1001],value=0;
            while(num>0)
            {
                val[value++]=num%2;
                num/=2;
            }
            for(int j=value-1;j>=0;j--)
            {
                arr[ind++]=val[j];
            }
            if(count<=K)
            {
                for(int j=0;j<ind;j++)
                {
                    if(count<=K)
                    {
                        if(arr[j]==0)
                        {
                            count++;
                            for(int k=j;k<ind-1;k++)
                            {
                                arr[k]=arr[k+1];
                            }
                            ind--;
                            j--;
                        }
                    }
                    else if(count>K)
                    {
                        break;
                    }
                }
            }
            sc.close();
            int number=0;
            for(int j=ind-1;j>=0;j--)
            {
                int pow=(int)Math.pow(2,number);
                sum+=arr[j]*pow;
                number++;
            }
        }
        System.out.print("\n"+sum);
	}
}
