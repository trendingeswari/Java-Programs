/*
 The program must accept N integers as the input. The program swap every two even integers among
the N integers. Then the program must print the N modified integers as the output. If the number of
even integers is odd, the last even integer will remain the same as it has no pair to swap.
Boundary Condition(s):
2 <= N <= 1000
1 <= Each integer value <= 10^5
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains the N modified integers separated by a space.
Example Input/Output 1:
Input:
7
22 43 56 51 68 50 28
Output:
56 43 22 51 50 68 28
Explanation:
There are two even integer pairs in the given integers.
The first even integer pair is 22 and 56. After swapping, the integers become 56 43 22 51 68 50 28.
The second even integer pair is 68 and 50. After swapping, the integers become 56 43 22 51 50 68 28.
Hence the output is 56 43 22 51 50 68 28
Example Input/Output 2:
Input:
6
2 8 3 12 98 56
Output:
8 2 3 98 12 56

 */

import java.util.Scanner;

public class SwapEvenIntegerPair {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[]=new int[N],evencount=0,evenIndex[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                evenIndex[evencount++]=i;
            }
        }
        sc.close();
        for(int i=0;i<evencount-1;i+=2)
        {
            int temp=arr[evenIndex[i]];
            arr[evenIndex[i]]=arr[evenIndex[i+1]];
            arr[evenIndex[i+1]]=temp;
        }
        /*for(int i=0;i<N;i++)
        {
            if(arr[i]%2==0)
            {
                for(int j=i+1;j<N;j++)
                {
                    if(arr[j]%2==0)
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        i=j+1;
                        break;
                    }
                }
            }
        }*/
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i]+" ");
        }
	}
}
