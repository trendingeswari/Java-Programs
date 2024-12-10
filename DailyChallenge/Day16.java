/*
 Pairs Divicible By 5

 The program must accept two integers M and N as the input. The program must form two lists of
integers from 1 to M and 1 to N respectively. Then the program must print the count of pairs of
integers C among the two lists based on the following conditions.
- The sum of integers in each pair must be divisible by 5.
- An integer in a given list cannot be used more than once to form a pair.
Boundary Condition(s):
3 <= M, N <= 1000
Input Format:
The first line contains M and N separated by a space.
Output Format:
The first line contains C.
Example Input/Output 1:
Input:
7 5
Output:
5
Explanation:
The integers from 1 to 7 are 1, 2, 3, 4, 5, 6 and 7.
The integers from 1 to 5 are 1, 2, 3, 4 are 5.
The 5 possible pairs are given below. (7 and 3 in not considered as already 3 in the second list has
been used with 2).
1 4
2 3
3 2
4 1
5 5
Example Input/Output 2:
Input:
16 18
Output:
15

 */

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int M=sc.nextInt(),N=sc.nextInt(),max=M<N?N:M,a1[]=new int[1001],a2[]=new int[1001],ind1=0,ind2=0;sc.close();
        for(int j=1;j<=max;j++)
        {
            if(j<=M)
            {
                a1[ind1++]=j;
            }
            if(j<=N)
            {
                a2[ind2++]=j;
            }
        }
        int count=0;
        for(int i=0;i<ind1;i++)
        {
            for(int j=0;j<ind2;j++)
            {
                if((a1[i]+a2[j])%5==0)
                {
                    count++;
                    for(int k=j;k<ind2-1;k++)
                    {
                        a2[k]=a2[k+1];
                    }
                    ind2--;
                    break;
                }
            }
        }
        System.out.print(count);
	}
}
