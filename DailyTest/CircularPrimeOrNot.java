/*
 The program must accept an integer N as the input. The program must print YES if N is a circular prime integer. Else the program must print NO as the output. An integer is said to be a circular prime if all rotations of its digits are prime. 
 Boundary Condition(s): 
 10 <= N <= 10^8 
 Input Format: The first line contains N. 
 Output Format: The first line contains YES or NO. 
 Example Input/Output 1: 
 Input: 
 131 
 Output: 
 YES 
 Explanation: All possible rotations of 131 are given below. 131 113 311 Here, all the three possible rotations are prime integers. 
 So YES is printed as the output. 
 Example Input/Output 2: 
 Input: 
 457 
 Output: 
 NO
 */

import java.util.Scanner;

public class CircularPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),dup=n,count=0,a[]=new int [1001],ind=0,esh=n;
        while(dup>0)
        {
            count++;
            dup/=10;
        }
        System.out.println();
        for(int i=1;i<=count;i++)
        {
            int val=n/2;
            for(int k=2;k<=val;k++)
            {
                if(n%k==0)
                {
                    System.out.print("NO");
                    return ;
                }
            }
            int num=1;
            num=(n%10);
            n/=10;
            while(n>0)
            {
                a[ind++]=n%10;
                n/=10;
            }
            for(int j=ind-1;j>=0;j--)
            {
                num=(num*10)+a[j];
            }
            ind=0;
            if(esh==num)
            {
                break;
            }
            n=num;
        }
        System.out.print("YES");
}
