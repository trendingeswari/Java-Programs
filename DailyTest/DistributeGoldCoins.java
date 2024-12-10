/*
 There are N plates in a row. Each plate contains the gold coins stacked one above another. A boy
wants to distribute the gold coins from the plate M having the maximum number of gold coins based
on the following conditions.
- He can distribute gold coins to the left and right plates of M alternatively.
- He cannot put two or more gold coins in a plate.
- He must distribute the gold coins until there are no gold coins on the plate M or there are no plates
for distribution on either side.
The number of gold coins on each plate is passed as the input to the program. The program must
print the number of gold coins on the N plates after the boy's distribution.
Note: There will be one maximum integer in the given N integers.
Boundary Condition(s):
2 <= N <= 1000
0 <= Each integer value <= 10^5
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains N integers representing the number of gold coins on the N plates after the boy's
distribution.
Example Input/Output 1:
Input:
5
10 20 45 30 25
Output:
11 21 41 31 26
Explanation:
The third plate contains the maximum number of gold coins 45.
He can pick 1 gold coin from the third plate and add it to the second plate(left side). So the integer
values become 10 21 44 30 25.
Then he can pick 1 gold coin from the third plate and add it to the fourth plate(right side). So the
integer values become 10 21 43 31 25.
Then he can pick 1 gold coin from the third plate and add it to the first plate(left side). So the integer
values become 11 21 42 31 25.
Then he can pick 1 gold coin from the fourth plate and add it to the fifth plate(right side). So the
integer values become 11 21 41 31 26.
Now there are no plates to distribute the gold coins on either side. So the distribution is over.
Hence the output is 11 21 41 31 26
Example Input/Output 2:
Input:
6
10 15 20 13 90 18
5/8/24, 9:21 AM skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT
https://www.skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT 1/2
Output:
11 16 21 14 85 19
Example Input/Output 3:
Input:
10
1 2 3 4 6 1 2 3 4 1
Output:
1 3 4 5 0 2 3 4 4 1
 */

import java.util.Scanner;

public class DistributeGoldCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),arr[]=new int[N],max=0,index=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if(max<arr[i])
            {
                index=i;
                max=arr[i];
            }
        }
        sc.close();
        int right=index+1,left=index-1;
        while((arr[index]>0)&&(right<N||left>=0))
        {
            if(left>=0)
            {
                arr[left]++;
                arr[index]--;
                left--;
            }
            if(arr[index]==0)
            {
                break;
            }
            if(right<N)
            {
                arr[right]++;
                arr[index]--;
                right++;
            }
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i]+" ");
        }
	}
}
