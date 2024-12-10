/*
 Subarray - Minimum and Maximum sum

The program must accept N integers and an integer K as the input. The program must print the
integers in the subarray of size K having the minimum sum. Then the program must print the integers
in the subarray of size K having the maximum sum. If two or more subarrays of size K have the same
minimum sum or the maximum sum, the program must print the first occurring subarray as the
output.
Boundary Condition(s):
1 <= K <= N <= 1000
1 <= Each integer value <= 1000
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
The third line contains K.
Output Format:
The first line contains K integers representing the integers in the subarray having the minimum sum.
The second line contains K integers representing the integers in the subarray having the maximum
sum.
Example Input/Output 1:
Input:
7
7 2 1 4 5 3 6
2
Output:
2 1 
7 2
Explanation:
Here K = 2.
There is only one subarray having the minimum sum 3 is 2 and 1. So they are printed in the first line.
There are two subarrays having the same maximum sum 9, they are 7 2 and 3 6. So the integers in the
first occurring subarray (7 2) are printed in the second line.
Example Input/Output 2:
Input:
6
25 16 14 78 19 12
4
Output:
14 78 19 12 
25 16 14 78
 */

import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int K=sc.nextInt(),index[]=new int[10001],ind=0,value[]=new int[10001],val=0,min=100001,max=0;
        sc.close();
        for(int i=0;i<=N-K;i++)
        {
            int index1[]=new int[N],ind1=0,sum=0;
            for(int j=i,count=1;count<=K;j++,count++)
            {
                sum+=arr[j];
                index1[ind1++]=arr[j];
            }
            if(max<sum)
            {
                max=sum;
                ind=0;
                for(int e=0;e<ind1;e++)
                {
                    index[ind++]=index1[e];
                }
            }
            if(min>sum)
            {
                min=sum;
                val=0;
                for(int e=0;e<ind1;e++){
                    value[val++]=index1[e];
                }
            }
        }
        System.out.println();
        for(int i=0;i<val;i++)
        {
            System.out.print(value[i]+" ");
        }
        System.out.println();
        for(int i=0;i<ind;i++)
        {
            System.out.print(index[i]+" ");
        }
	}
}
