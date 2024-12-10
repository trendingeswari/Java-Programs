/*
Sort based on Smallest Digit

The program must accept N integers as the input. The program must sort the N integers in ascending order based on the smallest digit in each integer. If two or more integers have the same smallest digit, then the program must sort those integers in descending order. Finally, the program must print the N sorted integers as the output.
Boundary Condition(s):
2 <= N <= 1000
1 <= Each integer value <= 10^8
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains the N sorted integers separated by a space.

Example Input/Output 1:
Input:
7
6844 25171 53677 18072 26457 70816 59225
Output:
70816 18072 25171 59225 26457 53677 6844
Explanation:
The smallest digit in 6844 is 4. The smallest digit in 25171 is 1. The smallest digit in 53677 is 3. The smallest digit in 18072 is 0. The smallest digit in 26457 is 2. The smallest digit in 70816 is 0.
The smallest digit in 59225 is 2.
After sorting the integers based on the smallest digit in each integer, the integers become
70816, 18072, 25171, 59225, 26457, 53677 and 6844.
Hence the output is
70816 18072 25171 59225 26457 53677 6844
Example Input/Output 2:
Input:
5
7287 9836 47 76 99234
Output:
99234 7287 9836 47 76
 */

import java.util.Scanner;

public class Day42 {
     public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String str[]=sc.nextLine().split("\\s+");
        int arr[]=new int[N],ind=0,d[]=new int[N];
        for(int i=0;i<str.length;i++)
        {
            char s[]=str[i].toCharArray();
            int min=1000001;
            for(int j=0;j<s.length;j++)
            {
                int num=s[j]-'0';
                if(num<min)
                {
                    min=num;
                }
            }
            d[ind]=ind;
            arr[ind++]=min;
        }
        sc.close();
        for(int i=0;i<ind;i++)
        {
            for(int j=i+1;j<ind;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    temp=d[i];
                    d[i]=d[j];
                    d[j]=temp;
                }
            }
        }
        for(int i=0;i<ind-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                int index1=-1,index2=-1;
                index1=i;
                for(int j=i+1;j<ind;j++)
                {
                    if(arr[i]!=arr[j])
                    {
                        i=j;
                        index2=--j;
                        break;
                    }
                }
                for(int j=index1;j<=index2;j++)
                {
                    for(int k=j+1;k<=index2;k++)
                    {
                        int n1=d[j],n2=d[k];
                        long val1=Integer.parseInt(str[n1]),val2=Integer.parseInt(str[n2]);
                        if(val1<val2)
                        {
                            int tem=d[j];
                            d[j]=d[k];
                            d[k]=tem;
                        }
                    }
                }   
            }
        }
        for(int i=0;i<ind;i++)
        {
            System.out.print(str[d[i]]+" ");
        }
	}
}
