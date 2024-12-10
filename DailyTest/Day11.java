/*
 N Columns Pattern

 The program must accept N integers as the input. For each integer X among the N integers, the
program must print the integer X for X times. Each line in the output must contain at most N integers.
Boundary Condition(s):
1 <= N <= 50
1 <= Each Integer value <= 1000
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The lines, each containing the integer value(s) separated by a space.
Example Input/Output 1:
Input:
5
3 5 1 8 7
Output:
3 3 3 5 5
5 5 5 1 8
8 8 8 8 8
8 8 7 7 7
7 7 7 7
Explanation:
The value of N is 5, so each line of the output contains at most 5 integers.
The first integer 3. So three 3's are printed in the first line.
The second integer 5. So two 5's are printed in the first line and the remaining three 5's are printed in
the second line.
The third integer 1. So only one 1 is printed in the second line.
Similarly, the remaining 2 integers 8 and 7 are printed in the same way.
Hence the output is
3 3 3 5 5
5 5 5 1 8
8 8 8 8 8
8 8 7 7 7
7 7 7 7
Example Input/Output 2:
Input:
2
12 6
Output:
12 12
12 12
12 12
12 12
12 12
12 12
6 6
6 6
6 6

 */

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[]=new int[N],a[]=new int[1000001],ind=0,val=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            for(int j=1;j<=arr[i];j++)
            {
                a[ind++]=arr[i];
            }
        }
        sc.close();
        while(true)
        {
            boolean flag=false;
            for(int j=0;j<N;j++)
            {
                if(val==ind)
                {
                    flag=true;
                    break;
                }
                System.out.print(a[val++]+" ");
            }
            if(flag)
            {
                break;
            }
            System.out.println();
        }
	}
}
