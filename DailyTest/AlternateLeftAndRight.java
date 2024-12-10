/*
 The program must accept N unique integers as the input. The program must print the largest integer
among the N integers as the output. Then the program must print the remaining integers in the left
and right side of the largest integer alternatively as the output.
Boundary Condition(s):
3 <= N <= 100
1 <= Each integer value <= 1000
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains the integers based on the given conditions.
Example Input/Output 1:
Input:
5
12 45 78 56 23
Output:
78 45 56 12 23
Explanation:
The largest integer among the 5 integers is 78. So 78 is printed.
Then the remaining integers present in the left and right side of the largest integer 78 are printed
alternatively (45 56 12 23).
Example Input/Output 2:
Input:
8
26 43 49 30 3 63 44 56
Output:
63 3 44 30 56 49 43 26
Example Input/Output 3:
Input:
6
67 23 56 87 21 90
Output:
90 21 87 56 23 67

 */

import java.util.Scanner;

public class AlternateLeftAndRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[]=new int[N],max=0,index=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if(max<arr[i])
            {
                max=arr[i];
                index=i;
            }
            if(i==N-1)
            {
                System.out.print(arr[index]+" ");
                int val1=index-1,val2=index+1;
                while((val1>=0)||(val2<N))
                {
                    if(val1>=0)
                    {
                        System.out.print(arr[val1]+" ");
                        val1--;
                    }
                    if(val2<N)
                    {
                        System.out.print(arr[val2]+" ");
                        val2++;
                    }
                }
            }
        }
        sc.close();
	}
}
