/*
 The program accepts N integers and prints the integers which are having at least three distinct digits.
If there is no such integer, the program must print -1 as the output.
Boundary Condition(s):
1 <= N <= 100
100 <= Each integer value <= 10^8
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains the integers which are having at least three distinct digits separated by a space
or -1.
Example Input/Output 1:
Input:
5
488 978 1432 151 5070
Output:
978 1432 5070
Explanation:
The integer 488 contains 2 distinct digits.
The integer 978 contains 3 distinct digits.
The integer 1432 contains 4 distinct digits.
The integer 151 contains 2 distinct digits.
The integer 5070 contains 3 distinct digits.
Hence the output is 978 1432 5070
Example Input/Output 2:
Input:
4
100 474 255 666
Output:
-1
 */

import java.util.Scanner;

public class Integer_ThreeDistinctDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[n],b[]=new int [n];
        long c[]=new long [1001];
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            int num=a[i],ind=0,val=0;
            while(num>0)
            {
                c[ind++]=num%10;
                num/=10;
            }
            for(int j=0;j<ind;j++)
            {
                for(int k=0;k<ind;k++)
                {
                    if(j!=k)
                        if(c[j]==c[k])
                            c[k]=-1;
                }
            }
            for(int j=0;j<ind;j++)
            {
                if(c[j]!=-1)
                    val++;
            }
            b[i]=val;
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            if(b[i]>=3)
            {
                flag=false;
                System.out.print(a[i]+" ");
            }
        }
        if(flag)
            System.out.print("-1");
	}
}
