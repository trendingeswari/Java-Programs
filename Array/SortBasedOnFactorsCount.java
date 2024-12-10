package Array;

import java.util.Scanner;

/*
 The program must accept N integers as the input. The program must sort all the integers in
descending order based on their factors count. If more than one integer has the same factors count
then the program must sort those integers based on their order of occurrence. Finally, the program
must print the sorted integers as the output.
Boundary Condition(s):
2 <= N <= 1000
1 <= Each integer value <= 10^5
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains N sorted integers separated by a space.
Example Input/Output 1:
Input:
3
121 100 24
Output:
100 24 121
Explanation:
The factors of 121 are 1, 11 and 121. So the factors count of 121 is 3.
The factors of 100 are 1, 2, 4, 5, 10, 20, 25, 50 and 100. So the factors count of 100 is 9.
The factors of 24 are 1, 2, 3, 4, 6, 8, 12 and 24. So the factors count of 24 is 8.
So the integers are sorted based on their factors count and printed as the output.
Example Input/Output 2:
Input:
7
5 11 10 20 9 16 23
Output:
20 16 10 9 5 11 23
 */
public class SortBasedOnFactorsCount {
     public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n],countarr[] = new int[n] , valarr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            int count=0;
            arr[i]=sc.nextInt();
            for(int j=1;j<=arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    count++;
                }
            }
            countarr[i]=count;
            valarr[i] = arr[i];
        }
        System.out.println();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(countarr[j]<countarr[j+1])
                {
                    int temp= countarr[j];
                    countarr[j]=countarr[j+1];
                    countarr[j+1]=temp;
                    temp= valarr[j];
                    valarr[j] = valarr[j+1];
                    valarr[j+1] =temp;
                }
            }
        }
    	for(int i=0;i<n;i++)
    	{
    	    System.out.print(valarr[i]+" ");
        }
    }
}
