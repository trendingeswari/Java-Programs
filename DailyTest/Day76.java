/*
 
Zeroes between Ones

The program must accept two integers N and K as the input. The program must print YES if there are at least K zeroes between two every two 1s in the binary representation of N. Else the program must print NO as the output.
Boundary Condition(s):
5 <= N <= 10^8
1 <= K <= 20
Input Format:
The first line contains N and K separated by a space.
Output Format:
The first line contains YES or NO.
Example Input/Output 1:
Input:
290 2
Output:
YES
Explanation:
Here N = 290 and K = 2.
The binary representation of 290 is 100100010. There are 2 zeroes present between first two 1s. There are 3 zeroes present between last two 1s. So YES is printed as the output.

Example Input/Output 2: Input:
10
28 57 49 89 81 91 60 46 66 77
Output:
28 57 49
89
81
91 60
46
Example Input/Output 3:
Input:
4
202 115 66 4124
Output: -1
Max Execution Time Limit: 50 millisecs 
*/
import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),K=sc.nextInt();
        String bin=Integer.toBinaryString(N);
        System.out.println();
        char S[]=bin.toCharArray();
        sc.close();
        for(int i=0;i<S.length;i++)
        {
            if(S[i]=='1')
            {
                int count=0;
                for(int j=i+1;j<S.length;j++)
                {
                    if(S[j]=='0')
                    {
                        count++;
                    }
                    else if(S[j]=='1')
                    {
                        if(count<K|| count==0)
                        {
                            System.out.print("NO");
                            return;
                        }
                        break;
                    }
                }
            }
        }
        System.out.print("YES");
	}
}
