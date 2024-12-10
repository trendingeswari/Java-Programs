/*
 The program must accept N integers as the input. The program must sort the integers based on the number of ones in their binary representation in descending order. If more than one integers have the same number of ones in their binary representation, the program must sort those integers in ascending order. 
 Finally, the program must print the N sorted integers as the output. 
 Boundary Condition(s): 2 <= N <= 1000 1 <= Each integer value <= 10^8 
 Input Format: The first line contains N. The second line contains N integers separated by a space. 
 Output Format: The first line contains the N sorted integers separated by a space. 
 Example Input/Output 1: 
 Input: 
 6 
 65 2 78 790 10 31 
 Output: 
 31 790 78 10 65 2 
 Explanation: The binary representation of 31 is 11111. The binary representation of 790 is 1100010110. 
 The binary representation of 78 is 1001110. The binary representation of 10 is 1010. The binary representation of 65 is 1000001. 
 The binary representation of 2 is 10. Here the 6 integers are sorted based on the number of ones in their binary representation. 
 Example Input/Output 2: 
 Input: 
 5 
 9 15 6 4 14 
 Output: 
 15 14 6 9 4
 */

import java.util.Scanner;

public class SortIntegerBasedOnOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[n],b[]=new int[n],c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            c[i]=i;
            int num=a[i],count=0;
            while(num>0)
            {
                int val=num%2;
                if(val==1)
                {
                    count++;
                }
                num/=2;
            }
            b[i]=count;
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(b[i]<b[j])
                {
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                    int tem=c[i];
                    c[i]=c[j];
                    c[j]=tem;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(b[i]==b[j])
                {
                    int n1=c[i],n2=c[j];
                    if(a[n1]>a[n2])
                    {
                        int temp=b[i];
                        b[i]=b[j];
                        b[j]=temp;
                        int tem=c[i];
                        c[i]=c[j];
                        c[j]=tem;
                    }
                }
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(a[c[i]]+" ");
        }
	}
}
