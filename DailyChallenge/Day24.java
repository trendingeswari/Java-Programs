/*
 primorial Number

The program must accept an integer N as the input. The program must print the primorial of N as the
output. The primorial of N is defined as the product of the first N prime integers.
Boundary Condition(s):
1 <= N <= 15
Input Format:
The first line contains N.
Output Format:
The first line contains the primorial of N.
Example Input/Output 1:
Input:
3
Output:
30
Explanation:
The first 3 prime integers are 2, 3 and 5.
So their product 30 (2 * 3 * 5) is printed as the output.
Example Input/Output 2:
Input:
5
Output:
2310
 */

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),pro=1,count=1;
        sc.close();
        for(int i=2;;i++)
        {
            boolean flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                }
            }
            if(count>N)
            {
                break;
            }
            if(flag)
            {
                pro*=i;
                count++;
            }
        }
        System.out.println();
        System.out.print(pro);
	}
}
