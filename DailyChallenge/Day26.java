/*
Window Pattern

The program must accept two integers N and X as the input. The program must print an S*S matrix of
matrices (where S is the square root of X) based on the following conditions.
- The size of each matrix in the S*S matrix is N*N.
- Each matrix contains only asterisks.
- The matrices are separated by the pipe symbols (|) vertically(including edges).
- The matrices are separated by the hyphens (-) horizontally(including edges).
- Each intersection of the matrices(including corners) is represented by the plus symbol (+).
Note: The value of X is always a perfect square.
Boundary Condition(s):
1 <= N <= 50
1 <= X <= 100
Input Format:
The first line contains N and X separated by a space.
Output Format:
The first (N*S)+(S+1) lines containing the S*S matrix of matrices based on the given conditions.
Example Input/Output 1:
Input:
5 1
Output:
+-----+
|*****|
|*****|
|*****|
|*****|
|*****|
+-----+
Explanation:
Here N = 5 and X = 1.
The square root of 1 is 1.
So the size of the matrix is 1x1 and it contains a matrix of size 5*5 with asterisks.
Hence the output is
+-----+
|*****|
|*****|
|*****|
|*****|
|*****|
+-----+
Example Input/Output 2:
Input:
2 4
Output:
+--+--+
|**|**|
|**|**|
+--+--+
|**|**|
|**|**|
+--+--+
Example Input/Output 3:
Input:
1 16
Output:
+-+-+-+-+
|*|*|*|*|
+-+-+-+-+
|*|*|*|*|
+-+-+-+-+
|*|*|*|*|
+-+-+-+-+
|*|*|*|*|
+-+-+-+-+
 */

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),X=sc.nextInt(),num=(int)Math.sqrt(X);
        sc.close();
        for(int count=1;count<=num;count++)
        {
            System.out.print("+");
            for(int j=1;j<=N;j++)
            {
                System.out.print("-");
            }
            if(count==num)
            {
                System.out.println("+");
            }
        }
        for(int k=0;k<num;k++)
        {
            for(int i=1;i<=N;i++)
            {
                for(int count=1;count<=num;count++)
                {
                    System.out.print("|");
                    for(int j=1;j<=N;j++)
                    {
                        System.out.print("*");
                    }
                    if(count==num){
                        System.out.println("|");
                    }
                }
            }
            for(int count=1;count<=num;count++)
            {
                System.out.print("+");
                for(int j=1;j<=N;j++)
                {
                    System.out.print("-");
                }
                if(count==num){
                    System.out.println("+");}
            }
            
        }
	}
}
