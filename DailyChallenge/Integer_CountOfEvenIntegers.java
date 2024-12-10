/*
 The program must accept an integer N as the input. The program must print the number of even
integers that can be formed from the digits of N without changing the order of their occurrences.
Note: There are no leading zeroes in the even integers.
Boundary Condition(s):
1 <= N <= 10^8
Input Format:
The first line contains N.
Output Format:
The first line contains the number of even integers that can be formed from the digits of N.
Example Input/Output 1:
Input:
5234
Output:
6
Explanation:
All possible even integers that can be formed from the digits of 5234 are given below.
52
5234
2
234
34
4
The number of possible even integers is 6. So 6 is printed as the output.
Example Input/Output 2:
Input:
20406
Output:
9
Explanation:
All possible even integers that can be formed from the digits of 20406 are given below.
2
20
204
2040
20406
4
40
406
6
The number of possible even integers is 9. So 9 is printed as the output.
Example Input/Output 3:
Input:
2424
Output:
10

 */

import java.util.Scanner;

public class Integer_CountOfEvenIntegers {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),num=N,arr[]=new int[1001],ind=0,count=0;
        while(num>0)
        {
            arr[ind++]=num%10;
            num/=10;
        }
        sc.close();
        for(int i=ind-1;i>=0;i--)
        {
            if(arr[i]%2==0&& arr[i]!=0)
            {
                count++;
            }
            int val=0;
            if(i!=0)
            {
                for(int j=i;j>=0;j--)
                {
                    if(i==j&& arr[j]==0)
                    {
                        break;
                    }
                    val=(val*10)+arr[j];
                    if(i!=j)
                    {
                        if(val%2==0)
                        {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.print(count);
	}
}
