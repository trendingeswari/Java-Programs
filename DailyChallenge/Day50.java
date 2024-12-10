/*
 
Nth Term - Series

The program must accept an integer N as the input. The program must print the Nth term in the following series as the output.
3, 5, 6, 9, 10, 12, 17, 18, 20, 24, 33,.. and so on.
All the integers in the above series have exactly two 1s in their binary representations.
Boundary Condition(s):
1 <= N <= 1000
Input Format:
The first line contains N.
Output Format:
The first line contains the Nth term in the above mentioned series.
Example Input/Output 1:
Input:
7
Output: 17
Explanation:
The 7th term in the series 3, 5, 6, 9, 10, 12, 17, 18, 20, 24, 33, ... is 17.
So 17 is printed as the output.

Example Input/Output 2:
Input:
15
Output:
48
 */
import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),a=-1,b=1,arr[]=new int[10001],ind=0;
        sc.close();
        boolean run=true,flag=true;
        while(run)
        {
            int c=a+b;
            if(c>N)
            {
                break;
            }
            arr[ind++]=c;
            a=b;b=c;
        }
        for(int i=0;i<ind;i++)
        {   
            for(int j=ind-1;j>=0;j--)
            {
                if(arr[i]+arr[j]==N && i!=j)
                {
                    System.out.print(arr[i]+" "+arr[j]);
                    flag=false;
                    return;
                }
            }
        }
        if(flag)
        {
            System.out.print("-1");
        }
	}
}
