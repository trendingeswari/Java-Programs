/*
 The program must accept N integers as the input. For each integer X, the program must find the sum
of the weights based on the following conditions.
- If X is a perfect square then the weight is 5.
- If X is a multiple of 4 and divisible by 6 then the weight is 4.
- If X is an even integer then the weight is 3.
- Else the weight of X is 0.
The program must print the integers with their weight as the output. The integers are sorted based on
their weight in ascending order. If more than one integers have the same weight then print those
integers in the order of their occurrence.
Boundary Condition(s):
1 <= N <= 1000
1 <= Each integer value <= 10^4
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first N lines, each contains two integers (X and their weight) based on the given conditions
separated by a space.
Example Input/Output 1:
Input:
6
10 36 54 89 12 17
Output:
89 0
17 0
10 3
54 3
12 7
36 12
Explanation:
The weight of the integer 89 is 0 because it is not an even integer, not a perfect square and also not
the multiple of 4 and not divisible by 6. So 89 0 are printed.
The weight of the integer 17 is 0 because it is not an even integer, not a perfect square and also not
the multiple of 4 and not divisible by 6. So 17 0 are printed.
The weight of the integer 10 is 3 because it is an even integer. So 10 3 are printed.
The weight of the integer 54 is 3 because it is an even integer. So 54 3 are printed.
The weight of the integer 12 is 7 (3+4) because it is an even integer and also the multiple of 4 and
divisible by 6. So 12 7 are printed.
The weight of the integer 36 is 12 (3+5+4) because it is an even integer, perfect square and also the
multiple of 4 and divisible by 6. So 36 12 is printed.
Example Input/Output 2:
Input:
5
37 121 11 81 71
Output:
37 0
11 0
71 0
121 5
81 5
 */

import java.util.Scanner;

public class SortByWeight {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[]=new int[N],val[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            int num=(int)Math.sqrt(arr[i]),sum=0;
            //perfect square
            if(num*num==arr[i])
            {
                sum+=5;
            }
            //divisible by 4 and 6
            if(arr[i]%4==0 && arr[i]%6==0)
            {
                sum+=4;
            }
            // check even number
            if(arr[i]%2==0)
            {
                sum+=3;
            }
            val[i]=sum;
        }
        sc.close();
        for(int i=0;i<N-1;i++)
        {
            for(int j=0;j<N-i-1;j++)
            {
                if(val[j]>val[j+1])
                {
                    int temp=val[j];
                    val[j]=val[j+1];
                    val[j+1]=temp;
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            System.out.println(arr[i]+" "+val[i]);
        }
	}
}
