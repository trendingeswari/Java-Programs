/*
 The program must accept two integers N and K as the input. The program must print the smallest
possible integer by replacing exactly K digits in N with 0.
Boundary Condition(s):
1 <= N <= 10^8
1 <= K <= Number of digits in N
Input Format:
The first line contains N and K separated by a space.
Output Format:
The first line contains the smallest possible integer by replacing exactly K digits in N with 0.
Example Input/Output 1:
Input:
2001356 2
Output:
356
Explanation:
Here N = 2001356 and K = 2.
After replacing the two digits 2 and 1 with 0 in 2001356, the integer becomes 356 (0000356 = 356).
Hence the output is 356
Example Input/Output 2:
Input:
92 2
Output:
0
 */
import java.util.Scanner;

public class SmallestInteger_ReplaceKDigits {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),a[]=new int[10001],ind=0,count=0,num=0;
        sc.close();
        while(n>0)
        {
            a[ind++]=n%10;
            n/=10;
        }
        if(a.length==k)
        {
            System.out.print("0");
            return ;
        }
        for(int i=ind-1;i>=0;i--)
        {
            if(a[i]==0)
            {
                continue;
            }
            else if(count<k)
            {
                a[i]=0;
                count++;
            }
            else
            {
               num=(num*10)+a[i];
            }
        }
        System.out.print(num);
	}
}
