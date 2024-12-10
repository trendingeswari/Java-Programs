/*
Smallest Integer Value

 The program must accept N integers as the input. The program must print the smallest positive
integer S which is not equal to the sum of any combination of integers among the given N integers as
the output.
Boundary Condition(s):
2 <= N <= 100
1 <= Each integer value <= 1000
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains S.
Example Input/Output 1:
Input:
6
1 2 4 9 5 1
Output:
23
Explanation:
The integer 1 is not possible as 1 is present in the given 6 integers.
The integer 2 is not possible as 2 is present in the given 6 integers.
The integer 3 is not possible as 1 and 2 are present in the given 6 integers.
The integer 4 is not possible as 4 is present in the given 6 integers.
The integer 5 is not possible as 5 is present in the given 6 integers.
The integer 6 is not possible as 1 and 5 are present in the given 6 integers.
Similarly, up to 22 is not possible, because there is a combination that provides the same value.
The smallest integer value which is not equal to the sum of any combination of integers among the
given 6 integers is 23.
So 23 is printed as the output.
Example Input/Output 2:
Input:
5
17 9 15 2 4
Output:
1
 */

import java.util.Arrays;
import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
		//Your Code Here
        /*Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[]=new int[N];
        boolean flag=true;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==1)
            {
                flag=false;
            }
        }
        sc.close();
        if(flag)
        {
            System.out.print("1");
            return;
        }
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int ans=1;
        for(int i=0;i<N;i++)
        {
            if(ans<arr[i])
            {
                System.out.print(arr[i]);
                return ;
            }
            else
            {
                ans+=arr[i];
            }
        }
        System.out.print(ans);*/
        // OR

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 1, i = 0;
        for(;i<n;) a[i++] =sc.nextInt();
        Arrays.sort(a);
        for(i=0;i<n;i++) {
        if(a[i]>sum) break;
        sum += a[i];
        }
        System.out.print(sum);
        sc.close();
	}
}
