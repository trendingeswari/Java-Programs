/*
 The program must accept an integer N as the input. The program must print the sum of prime
integers from 1 to N ending with 7 as the output.
Boundary Condition(s):
10 <= N <= 10^8
Input Format:
The first line contains N.
Output Format:
The first line contains the sum of prime integers from 1 to N ending with 7.
Example Input/Output 1:
Input:
42
Output:
61
Explanation:
The prime integers from 1 to 42 which ends with 7 are 7, 17 and 37.
The sum of 7, 17 and 37 is 61.
Hence the output is 61
Example Input/Output 2:
Input:
156
Output:
643
 */
import java.util.Scanner;

public class Sum_PrimeIntegerEndingWith7 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        for(int i=2;i<=n;i++)
        {
            boolean flag=true;
            for(int j=2;j<=n/2;j++)
            {
               if(i%j==0&&i!=j)
               {
                   flag=false;
                   break;
               }
            }
            if(flag)
            {
                if(i%10==7)
                {
                    sum+=i;
                }
            }
        }
        System.out.print("\n"+sum);
	}
}
