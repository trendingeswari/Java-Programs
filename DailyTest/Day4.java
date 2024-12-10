/*
 Subarray_Greater than K

 The program must accept N integers and an integer K as the input. The program must print the count
of subarrays that have at least one integer value greater than K as the output.
Boundary Condition(s):
3 <= N <= 100
1 <= K, Each integer value <= 10^5
Input Format:
The first line contains N and K separated by a space.
The second line contains N integers separated by a space.
Output Format:
The first line contains the count of subarrays that have at least one integer value greater than K.
Example Input/Output 1:
Input:
4 10
55 10 23 5
Output:
8
Explanation:
The subarrays that have at least one integer value greater than 10 are (55), (23), (55, 10), (10, 23), (23,
5), (55, 10, 23), (10, 23, 5) and (55, 10, 23, 5).
So their count is 8 which is printed as the output.
Example Input/Output 2:
Input:
7 5
5 1 6 9 2 8 7
Output:
24
Example Input/Output 3:
Input:
4 33
12 25 16 21
Output:
0

 */

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),K=sc.nextInt(),arr[]=new int[N],count=0,num=1;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>K)
            {
                count++;
            }
        }
        sc.close();
        for(int e=0;e<N-1;e++)
        {
            for(int i=0;i<N;i++)
            {
                boolean kodi=false,flag=false;
                if(arr[i]>K)
                {
                    kodi=true;
                }
                for(int j=i+1,k=1;k<=num&&j<N;k++,j++)
                {
                    if(arr[j]>K)
                    {
                        kodi=true;
                    }
                    if(j==N-1)
                    {
                        flag=true;
                    }
                }
                if(kodi)
                {
                    count++;
                }
                if(flag)
                {
                    break;
                }
            }
            num++;
        }
        System.out.println(count);
    }
}
