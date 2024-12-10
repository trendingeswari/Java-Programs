/*
X Odd Integers - Subarrays

The program must accept N integers and an integer X as the input. The program must print the count of subarrays having exactly X odd integers as the output.
Boundary Condition(s):
1 <= X <= N <= 100
1 <= Each integer value <= 10^5
Input Format:
The first line contains N and X separated by a space.
The second line contains N integers separated by a space.
Output Format:
The first line contains the count of subarrays having exactly X odd integers.
Example Input/Output 1:
Input:
42
3431
Output: 3
Explanation:
All possible subarrays are {3}, {4}, {3}, {1}, {3, 4}, {4, 3}, {3, 1}, {3, 4, 3}, {4, 3, 1} and {3, 4, 3, 1}.
There are 3 subarrays having exactly 2 odd integers {3, 4, 3}, {4, 3, 1} and {3, 1}.
So 3 is printed as the output.
Example Input/Output 2:
Input:
53
12234
Output:
0
 */

import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	int count=0;
	
		for(int i=0;i<n;i++)
		{
		    int odd=0;
		    for(int j=i;j<n;j++)
		    {
		        if(a[j]%2!=0)
		        odd++;
		        
		        if(odd==x)
		        {
		            count++;
		        }
		        if(odd>x)
		        {
		            break;
		        }
		    }
		    
		}
		System.out.print(count);

	}
}
