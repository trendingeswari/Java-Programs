/*
Sort - N Rectangles

The program must accept the length L and the breadth B of N rectangles as the input. 
The program must find the area of N rectangles. Then the program must sort the N rectangles in ascending order based on their area. 
If two or more rectangles have the same area, the program must sort N rectangles in ascending order based on their length. 
Finally, the program must print the length, the breadth and the area of the sorted rectangles as the output.
Boundary Condition(s):
1 <= N <= 100
1 <= L, B<= 100
Input Format:
The first line contains N.
The next N lines, each contains the length and the breadth of a rectangle.
Output Format:
The first N lines, each contains the length and the breadth of a rectangle after sorting.
Example Input/Output 1:
Input:
5
5 7
2 5
3 2
2 3
4 6

Output: 
2 3 6
3 2 6
2 5 10
4 6 24
5 7 35
Explanation:
The area of the first rectangle is 35 (5*7). The area of the second rectangle is 10 (2*5). The area of the third rectangle is 6 (3*2). The area of the fourth rectangle is 6 (2*3).
The area of the fifth rectangle is 24 (4*6).
After sorting the rectangles based on the given conditions, the rectangles become
2 3 6
3 2 6
2 5 10
4 6 24
5 7 35
Example Input/Output 2:
Input:
6
20 5 
3 20
15 4 
10 10 
11 2
5 5
Output:
11 2 22
5 5 25
3 20 60
15 4 60
10 10 100
20 5 100
 */

import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),length[]=new int[N],breadth[]=new int[N],arr[]=new int[N],dup[]=new int[N],len=N;
        for(int i=0;i<N;i++)
        {
            length[i]=sc.nextInt();breadth[i]=sc.nextInt();
            arr[i]=length[i]*breadth[i];
            dup[i]=arr[i];
        }
        sc.close();
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    temp=length[i];
                    length[i]=length[j];
                    length[j]=temp;
                    temp=breadth[i];
                    breadth[i]=breadth[j];
                    breadth[j]=temp;
                    temp=dup[i];dup[i]=dup[j];dup[j]=temp;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(dup[i]==dup[j])
                {
                    for(int k=j;k<len-1;k++)
                    {
                        dup[k]=dup[k+1];
                    }
                    len--;j--;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            int count=0,index=-1,inde=-1;
            boolean flag=true;
           for(int j=0;j<N;j++)
           {
               if(dup[i]==arr[j])
               {
                   if(flag)
                   {
                       inde=j;flag=false;
                   }
                   count++;
                   index=j;
               }
           }
           if(count>=2)
           {
               for(int j=inde;j<=index;j++)
               {
                   for(int k=j+1;k<=index;k++)
                   {
                       if(length[j]>length[k])
                       {
                           int temp=arr[j];
                           arr[j]=arr[k];
                           arr[k]=temp;
                           temp=length[j];
                           length[j]=length[k];
                           length[k]=temp;
                           temp=breadth[j];
                           breadth[j]=breadth[k];
                           breadth[k]=temp;
                       }
                   }
               }
           }
        }
        for(int i=0;i<N;i++)
        {
            System.out.println(length[i]+" "+breadth[i]+" "+arr[i]);
        }
	}
}
