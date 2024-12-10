/*
 The program must accept N integers as the input. For each integer X among the N integers, the
program must print the sum of F integers to it's left and L integers to it's right, where F represents the
first digit in X and L represents the last digit in X. The first integer does not have any integers on it's
left side and the last integer does not have any integers on it's right side, so the program must find the
sum values by considering the N integers circularly.
Boundary Condition(s):
10 <= N <= 100
10 <= Each integer value <= 10^8
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains N integers separated by a space.
Example Input/Output 1:
Input:
10
24 32 10 43 82 51 62 70 92 23
Output:
282 192 32 284 469 253 404 304 444 228
Explanation:
The first and the last digits of 24 are 2 and 4. Here 2 integers to it's circularly left are 23 92 and 4
integers to it's circularly right are 32 10 43 82. So their sum is 23+92+32+10+43+82 = 282.
The first and the last digits of 32 are 3 and 2. Here 3 integers to it's circularly left are 24 23 92 and 2
integers to it's circularly right are 10 43. So their sum is 24+23+92+10+43 = 192.
The first and the last digits of 10 are 1 and 0. So 1 integer to it's circularly left is 32.
Similarly, the sum of 4 circularly left integers and 3 circularly right integers
of 43 is 10+32+24+23+82+51+62 = 284.
Similarly, the sum of 8 circularly left integers and 2 circularly right integers
of 82 is 43+10+32+24+23+92+70+62+51+62 = 469.
Similarly, the sum of 5 circularly left integers and 1 circularly right integer
of 51 is 82+43+10+32+24+62 = 253.
Similarly, the sum of 6 circularly left integers and 2 circularly right integers
of 62 is 51+82+43+10+32+24+70+92 = 404.
Similarly, the sum of 7 circularly left integers of 70 is 62+51+82+43+10+32+24 = 304.
Similarly, the sum of 9 circularly left integers and 2 circularly right integers
of 92 is 70+62+51+82+43+10+32+24+23+23+24 = 444.
Similarly, the sum of 2 circularly left integers and 3 circularly right integers of 23 is 92+70+24+32+10
= 228.
Hence the output is 282 192 32 284 469 253 404 304 444 228
Example Input/Output 2:
Input:
11
106 106 123 49 100 13 108 130 100 101 140
Output:
639 629 268 1379 49 438 868 108 130 240 101

 */
import java.util.*;
public class ArraySumCircularlyLeftandRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<N;i++)
        {
            int num=arr[i],L=num%10,digit=Math.max(1,(int)(Math.log10(Math.abs(num)))),F=(int)(num/(int)(Math.pow(10,digit)));
            int n1=0,n2=0,sum1=0,sum2=0;
            if(F!=0)
            {
                if(i>=F)
                {
                    int val=i-F;
                    for(int j=i-1;j>=val;j--)
                    {
                        sum1+=arr[j];
                    }
                }
                else
                {
                    if(i!=0)
                    {
                        n1=F-i;
                    }
                    else
                    {
                        n1=F;
                    }
                    for(int j=i-1;j>=0;j--)
                    {
                        sum1+=arr[j];
                    }
                    for(int j=N-1,count=1;count<=n1;count++,j--)
                    {
                        sum1+=arr[j];
                    }
                }
            }
            if(L!=0)
            {
                if(L<=((N-1)-(i)))
                {
                    for(int j=i+1,count=1;count<=L;count++,j++)
                    {
                        sum2+=arr[j];
                    }
                }
                else
                {
                    int w1=((N-1)-i),w2=L-w1;
                    for(int count=1,j=i+1;count<=w1;count++,j++)
                    {
                        sum2+=arr[j];
                    }
                    for(int count=1,j=0;count<=w2;count++,j++)
                    {
                        sum2+=arr[j];
                    }
                }
            }
            System.out.print(sum1+sum2+" ");
        }
	}
}

