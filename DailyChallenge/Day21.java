/*
 Pairs - Unit Digit Sum

The program must accept an integer N as the input. The program must print the count of unique pairs
of digits that can be formed using the digits of N (expect the unit digit), where the sum of digits in
each pair is equal to the unit digit of N as the output. If there is no such pair, the program must
print -1 as the output.
Boundary Condition(s):
100 <= N <= 10^16
Input Format:
The first line contains N.
Output Format:
The first line contains an integer representing the count of unique pairs of digits or -1.
Example Input/Output 1:
Input:
2464538
Output:
3
Explanation:
The unit digit of 2464538 is 8.
The 3 unique pairs of digits are given below.
(2, 6) -> 2 + 6 = 8
(4, 4) -> 4 + 4 = 8
(5, 3) -> 5 + 3 = 8
Example Input/Output 2:
Input:
345672
Output:
-1
Example Input/Output 3:
Input:
7117471178
Output:
1

 */

import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char  N[]=sc.nextLine().toCharArray();
        int num=N[N.length-1]-'0',arr[]=new int [10001],ind=0,value[]=new int[10001],val=0,count=0;
        boolean flag=true;
        for(int i=0;i<N.length;i++)
        {
            arr[ind++]=N[i]-'0';
        }
        for(int i=0;i<ind;i++)
        {
            for(int j=0;j<ind;j++)
            {
                if(i!=j)
                {
                    if(flag && arr[i]+arr[j]==num)
                    {
                        
                        count++;
                        value[val++]=arr[i];value[val++]=arr[j];
                    }
                    if(arr[i]+arr[j]==num)
                    {
                        flag=false;
                        boolean pre=true;
                        for(int k=0;k<val;k++)
                        {
                            if(value[k]==arr[i] || value[k]==arr[j])
                            {
                                pre=false;
                            }
                        }
                        if(pre)
                        {
                            count++;
                            value[val++]=arr[i];value[val++]=arr[j];
                        }
                    }
                }
            }
        }
        if(flag){ System.out.print("-1");}
        else{ System.out.print(count); }
	}
}
