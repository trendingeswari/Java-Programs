/*
The program must accept N integers as the input. The program must find all the sequences having the
integers in increasing order or ascending order. Then the program must print the largest integer (i.e
the largest integer value) in all the sequences as the output.
Boundary Condition(s):
2 <= N <= 100
Example Input/Output 1:
Input:
5
3 4 5 9 6
Output:
9 
Explanation:
The peak element of the increasing sequence 3, 4, 5, 9 is 9. So, 9 is printed.
Example Input/Output 2:
Input:
8
8 4 6 3 5 9 1 2  
Output:
6 9 2 
Explanation:
The peak element of the increasing sequence 4, 6 is 6. So, 6 is printed.
The peak element of the increasing sequence 3, 5, 9 is 9. So, 9 is printed.
The peak element of the increasing sequence 1, 2 is 2. So, 2 is printed.
*/
#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int peak=a[0],flag=0;
    for(int i=1;i<n;i++)
    {
        if(a[i-1]<a[i])
        {
            if(!flag)
            {
                flag=1;
                peak=a[i];
            }
            else
            {
                peak=(peak>a[i])?peak:a[i];
            }
        }
        else
        {
            if(flag)
            {
                printf("%d ",peak);
                flag=0;
            }
        }
    }
    if(flag)
    {
        printf("%d ",peak);
    }
}