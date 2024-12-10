/*
 The program must accept N integers as the input. The program must print Yes if there is at least one
triplet (a, b, c) in the given N integers where a
2 + b2 = c2
. Else the program must print No as the
output.
Boundary Condition(s):
3 <= N <= 100
1 <= Each integer value <= 10^5
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains Yes or No.
Example Input/Output 1:
Input:
7
5 1 3 6 7 2 4
Output:
Yes
Explanation:
Here the triplet is (3, 4, 5) where 3
2 + 42 = 52 (9 + 16 = 25).
Hence the output is Yes
Example Input/Output 2:
Input:
8
93 20 76 42 100 12 99 79
Output:
No

 */
import java.util.*;
public class Integer_CheckTriples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    int n1=a[i],n2=a[j],n3=a[k];
                    if((((n1*n1)+(n2*n2))==n3*n3) || ((n2*n2)+(n3*n3)==n1*n1) || ((n1*n1)+(n3*n3)==n2*n2))
                    {
                        System.out.print("YES");
                        return;
                    }
                }
            }
        }
        System.out.print("NO");
	}
}
