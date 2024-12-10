/*
 
Longest Subset - Same Ends

The program must accept N integers as the input. The program must find the longest subset among the N integers, whose first integer and the last integer are the same. Then the program must print the first integer in the longest subset as the output. If there are two or more such longest subsets, the program must print the largest first integer among the subsets as the output.
Note: At least one integer is always repeated in the given N integers.
Boundary Condition(s):
2 <= N <= 1000
1 <= Each integer value <= 1000
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains an integer as per the given conditions.

Example Input/Output 1: Input:
10
55 44 55 90 66 48 44 52 66 66
Output: 66
Explanation:
All the subsets having the same first and last integers are given below.
55 44 55
44 55 90 66 48 44
66 48 44 52 66
66 48 44 52 66 66
66 66
There are two longest subsets having the same first and last integers. Here 66 is greater than 44, so 66 is printed as the output.
Example Input/Output 2:
Input:
7
7172312
Output:
1
Example Input/Output 3: Input:
2
11 11
Output: 11
 */
import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[]=new int[N],a[]=new int[N],ind=0,esh[][]=new int[N][N],in=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<N;i++)
        {
            int index=-1;
            boolean flag=false;
            for(int j=N-1;j>=0;j--)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    index=j;
                    flag=true;
                    break;
                }
            }
            int num=index-i;
            num--;
            if(flag && num>=0)
            {
                a[ind++]=num;
                esh[in][0]=num;
                esh[in++][1]=arr[i];
            }
        }
        for(int i=0;i<ind;i++)
        {
            for(int j=i+1;j<ind;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<ind;i++)
        {
            for(int j=i+1;j<ind;j++)
            {
                if(a[i]==a[j])
                {
                    for(int k=j;k<ind-1;k++)
                    {
                        a[k]=a[k+1];
                    }
                    ind--;j--;
                }
            }
        }
        int max=-345353;
        for(int j=0;j<in;j++)
        {
            if(esh[j][0]==a[0])
            {
                if(max<esh[j][1])
                {
                    max=esh[j][1];
                }
            }
        }
        System.out.println(max);
	}
}
