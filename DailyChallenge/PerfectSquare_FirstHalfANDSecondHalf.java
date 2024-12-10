/*
 The program must accept an integer N as the input. The program must split the integer N into two
equal halves. Finally, the program must print YES if the first half of N, the second half of N and the N
are perfect squares. Else the program must print NO as the output.
Note: The number of digits of N is always even.
Boundary Condition(s):
10 <= N <= 10^17
Input Format:
The first line contains N.
Output Format:
The first line contains either YES or NO.
Example Input/Output 1:
Input:
1681
Output:
YES
Explanation:
1681 is the perfect square of 41.
The first half of 1681 is 16. Here 16 is the perfect square of 4.
The second half of 1681 is 81. Here 81 is the perfect square of 9.
So 16, 81 and 1681 are the perfect squares.
Hence the output is YES
Example Input/Output 2:
Input:
625526
Output:
NO
 */

import java.util.Scanner;

public class PerfectSquare_FirstHalfANDSecondHalf {
    public static boolean isPerfect(long n) {
        if (n < 0)
            return false;
        double sqrt = Math.sqrt(n);
        return sqrt == Math.floor(sqrt);
    }

 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
long s1 = Long.parseLong(s.substring(0,s.length()/2));
long s2 = Long.parseLong(s.substring(s.length()/2,s.length()));
long s3 = Long.parseLong(s);
sc.close();
if(isPerfect(s1) && isPerfect(s2) && isPerfect(s3)) System.out.print("YES");
else System.out.print("NO");
}
}
