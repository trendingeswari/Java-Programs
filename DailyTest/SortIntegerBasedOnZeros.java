/*
 The program must accept N integers as the input. The program must sort the integers in ascending
order based on the number of zeros in their binary representation. Then the program must print the N
sorted integers as the output. If more than one integers have the same number of zeros in their binary
representation, the program must sort those integers in the given order.
Boundary Condition(s):
2 <= N <= 100
1 <= Each integer value <= 10^5
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains the N modified integers.
Example Input/Output 1:
Input:
4
14 488 64 47
Output:
14 47 488 64
Explanation:
The binary representation of 14 is 1110 and the number of zeros in it is 1.
The binary representation of 488 is 111101000 and the number of zeros in it is 4.
The binary representation of 64 is 1000000 and the number of zeros in it is 6.
The binary representation of 47 is 101111 and the number of zero in it is 1.
So they are sorted based on the number of zeros in their binary representation.
Example Input/Output 2:
Input:
5
4 3 8 7 1
Output:
3 7 1 4 8
 */

import java.util.Scanner;

public class SortIntegerBasedOnZeros {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[n],b[]=new int[n],d[]=new int[n];
        long c[]=new long[1001];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();d[i]=i;int num=a[i],ind=0,count=0;
            while(num>0)
            {
                c[ind++]=num%2;num/=2;
            }
            for(int j=0;j<ind;j++)
            {
                if(c[j]==0)
                    count++;
            }
            b[i]=count;
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(b[i]>b[j])
                {
                    int temp=b[j];
                    b[j]=b[i];
                    b[i]=temp;
                    int val=d[i];
                    d[i]=d[j];
                    d[j]=val;
                }
            }
        }
        System.out.print("This is the sorted array plus sorted index\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]+" "+d[i]);
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(d[i]==j)
                {
                    System.out.print(a[j]+" ");
                }
            }
        }
	}
}
