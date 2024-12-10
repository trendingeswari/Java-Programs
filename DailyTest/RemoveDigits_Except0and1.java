/*
 The program must accept an integer N as the input. The program must remove all the digits
except 0's and 1's in N. Then the program must print the decimal equivalent of modified N. If all the
digits are removed in N, the program must print -1 as the output.
Boundary Condition(s):
1 <= N <= 10^18
Input Format:
The first line contains N.
Output Format:
The first line contains the decimal equivalent of modified N or -1.
Example Input/Output 1:
Input:
1204571
Output:
5
Explanation:
Here N = 1204571.
After removing all the digits except 0's and 1's in 1204571, the integer becomes 101.
The decimal equivalent of 101 is 5.
Hence the output is 5
Example Input/Output 2:
Input:
487
Output:
-1

 */
import java.util.*;
public class RemoveDigits_Except0and1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N=sc.nextLong();
        sc.close();
        String modify=Long.toString(N).replaceAll("[^01]","");
        if(modify.isEmpty())
        {
            System.out.print("-1");
        }
        else
        {
            int modifyNumber=Integer.parseInt(modify,2);
            System.out.print(modifyNumber);
        }
	}
}
