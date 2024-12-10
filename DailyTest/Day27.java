/*
 Odd Digit Sum - N Integers 

 The program must accept N integers as the input. The program must print the integers having
the odd digital sum among the N integers as the output. If there is no such integer, the program
must print -1 as the output. The digital sum of an integer is the recursive sum of the digits until the
sum becomes a single digit.
Boundary Condition(s):
1 <= N <= 100
1 <= Each integer value <= 10^18
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains the integers having the odd digital sum separated by a space or -1.
Example Input/Output 1:
Input:
5
12 34 31 867 92
Output:
12 34 867
Explanation:
The digital sum of 12 is 3, which is an odd integer. So 12 is printed as the output.
The digital sum of 34 is 7, which is an odd integer. So 34 is printed as the output.
The digital sum of 31 is 4, which is an even integer. So 31 is NOT printed.
The digital sum of 867 is 3, which is an odd integer. So 867 is printed as the output.
The digital sum of 92 is 2, which is an even integer. So 92 is NOT printed.
Example Input/Output 2:
Input:
4
11 22 33 454
Output:
-1
 */

import java.util.Scanner;

public class Day27 {
     public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),arr[]=new int [N];
        System.out.println();
        boolean flag=true;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if((check(arr[i]))%2!=0)
            {
                flag =false;
                System.out.print(arr[i]+" ");
            }
        }
        if(flag)
        {
            System.out.print("-1");
        }
        sc.close();
	}
	public static int check(int num)
	{
	    int sum=0;
	    while(num>0)
	    {
	        sum+=num%10;
	        num/=10;
	    }
	    boolean run=true;
	    while(run){
	    int val=sum,pre=0,value=0;
	    while(val>0)
	    {
	        value+=val%10;
	        val/=10;
	        pre++;
	    }
	    if(pre==1){
	       run=false;
	    }
	       sum=value;
	   }
	    return sum;
	}
}
