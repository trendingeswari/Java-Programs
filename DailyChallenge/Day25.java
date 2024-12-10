/*
 N term - Double Series

 The program must accept three integers N, X and Y as the input. The program must print the first N
terms in the following series.
X+1, Y+1, 2X-1, 2Y-1, 3X+1, 3Y+1, 4X-1, 4Y-1, 5X+1, 5Y+1,....
Boundary Condition(s):
2 <= N <= 100
1 <= X, Y <= 1000
Input Format:
The first line contains N, X and Y separated by a space.
Output Format:
The first line contains the first N terms in the given series separated by a space.
Example Input/Output 1:
Input:
10 2 5
Output:
3 6 3 9 7 16 7 19 11 26
Explanation:
Here N = 10, X = 2 and Y = 5.
The first 10 terms in the given series are 3(2+1), 6(5+1), 3(2*2-1), 9(2*5-1), 7(3*2+1), 16(3*5+1), 7(4*2-
1), 19(4*5-1), 11(5*2+1) and 26(5*5+1).
Hence the output is
3 6 3 9 7 16 7 19 11 26
Example Input/Output 2:
Input:
15 9 1
Output:
10 2 17 1 28 4 35 3 46 6 53 5 64 8 71

 */

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),X=sc.nextInt(),Y=sc.nextInt(),count=1,sum=1;
        sc.close();
        for(int i=1;i<=N;i++)
        {
            if(count%2!=0 && sum%2!=0){
                System.out.print((sum*X)+1+" ");}
            if(count%2==0 && sum%2!=0)
            {
                System.out.print((sum*Y)+1+" ");
            }
            if(count%2!=0 && sum%2==0)
            {
                System.out.print((sum*X)-1+" ");
            }
            if(count%2==0 && sum%2==0)
            {
                System.out.print((sum*Y)-1+" ");
            }
            if(count%2==0)
            {
                sum++;
            }
            count++;
        }
	}
}
