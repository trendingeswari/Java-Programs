/*
 Sort Factors - Factors Count

 The program must accept an integer N as the input. The program must find the factors of N. Then the
program must sort those factors in descending order based on their factors count. If more than one
factors have the same factors count, the program must sort those factors in descending order. Finally,
the program must print the sorted factors as the output.
Boundary Condition(s):
1 <= N <= 10^5
Input Format:
The first line contains N.
Output Format:
The first line contains the factors of N separated by a space.
Example Input/Output 1:
Input:
50
Output:
50 10 25 5 2 1
Explanation:
The factors of 50 are 1, 2, 5, 10, 25 and 50.
The integer 1 has 1 factor.
The integer 2 has 2 factors.
The integer 5 has 2 factors.
The integer 10 has 4 factors.
The integer 25 has 3 factors.
The integer 50 has 6 factors.
Here 2 and 5 have the same number of factors. So they are sorted in descending order.
After sorting the factors of 50 in descending order based on their factors count, the factors become 50
10 25 5 2 1.
So they are printed as the output.
Example Input/Output 2:
Input:
455
Output:
455 91 65 35 13 7 5 1

 */

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),arr[]=new int[10001],ind=0,counter[]=new int[1001],ted[]=new int[1001];
        sc.close();
        for(int i=1;i<=N;i++)
        {
            if(N%i==0)
            {
                arr[ind++]=i;
            }
        }
        for(int i=0;i<ind;i++)
        {
            int count=0;
            for(int j=1;j<=arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    count++;
                }
            }
            counter[i]=count;
        }
        for(int i=0;i<ind;i++)
        {
            for(int j=i+1;j<ind;j++)
            {
                if(counter[i]<counter[j])
                {
                    int temp=counter[i];
                    counter[i]=counter[j];
                    counter[j]=temp;
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
            ted[i]=counter[i];
        }
        int len=ind;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(ted[i]==ted[j])
                {
                    for(int k=j;k<len-1;k++)
                    {
                        ted[k]=ted[k+1];
                    }
                    len--;j--;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            int count=0,index=-1,indec=-1;
            boolean flag=true,kodi=true;
            for(int j=0;j<ind;j++)
            {
                if(ted[i]==counter[j] && ted[i]==counter[j+1])
                {
                    if(kodi)
                    {
                        indec=j;
                        kodi=false;
                    }
                    count++;
                }
                else if(ted[i]==counter[j])
                {
                    if(flag)
                    {
                        index=j;
                        flag=false;
                    }
                    count++;
                }
            }
            if(count>1)
            {
                for(int j=indec;j<=index;j++)
                {
                    for(int k=j+1;k<=index;k++)
                    {
                        if(arr[j]<arr[k])
                        {
                            int value=arr[j];
                            arr[j]=arr[k];
                            arr[k]=value;
                        }
                    }
                }
            }
        }
        for(int i=0;i<ind;i++)
        {
            System.out.print(arr[i]+" ");
        }
	}
}
