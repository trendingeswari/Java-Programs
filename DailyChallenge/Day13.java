/*
 Longest Prefix Divisible by K

 The program must accept two integers N and K as the input. The program must print the longest
prefix in N which is divisible by K. If there is no such prefix, the program must print -1 as the output.
Boundary Condition(s):
10 <= N <= 10^8
1 <= K <= N
Input Format:
The first line contains N and K separated by a space.
Output Format:
The first line contains the longest prefix in N which is divisible by K or -1.
Example Input/Output 1:
Input:
107812 154
Output:
1078
Explanation:
The longest prefix in 107812 which is divisible by 154 is 1078.
So 1078 is printed as the output.
Example Input/Output 2:
Input:
1573 4
Output:
-1

 */

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),K=sc.nextInt();sc.close();
        while(N>0)
        {
            if(N%K==0 && N!=0)
            {
                System.out.print(N);
                return ;
            }
            N/=10;
        }
        System.out.print("-1");
	}
}
