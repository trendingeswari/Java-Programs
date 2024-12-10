/*
Shift Even Integers - K Times
The program must accept an array of N integers and an integer K as the input. The program must perform the following processes K times.
- The program must shift the even integers in the array by 1 position to the left (the odd integers remain in the same positions).
- Then the program must print the integers in the modified array as the output.
Note: At least two even integers are always present in the given N integers.
Boundary Condition(s):
2 <= N <= 100
1 <= K <= N
1 <= Each integer value <= 1000
Input Format:
The first line contains N and K separated by a space.
The second line contains N integer values separated by a space.
Output Format:
The first K lines, each contains N integers separated by a space.

Example Input/Output 1:
Input:
63
42 15 66 72 27 32
Output:
66 15 72 32 27 42
72 15 32 42 27 66
32 15 42 66 27 72
Explanation:
Here N = 6 and K = 3.
Initially, the integers in the array are 42 15 66 72 27 32.
After shifting the even integers by 1 position to the left, the integers in the array become 66 15 72 32 27 42. So they are printed in the first line.
After shifting the even integers by 1 position to the left, the integers in the array become 72 15 32 42 27 66. So they are printed in the second line.
After shifting the even integers by 1 position to the left, the integers in the array become 32 15 42 66 27 72. So they are printed in the third line.
Example Input/Output 2:
Input:
51
6 17 22 18 11
Output:
22 17 18 6 11
 */
import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc =new Scanner (System.in);
        int N=sc.nextInt(),K=sc.nextInt(),arr[]=new int [N],a[]=new int[N],ind=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                a[ind++]=arr[i];
            }
        }
        sc.close();
        for(int i=1;i<=K;i++)
        {
            int num=i%ind;
            int temp[]=new int[N],k=0;
            for(int j=num;j<ind;j++)
            {
                temp[k++]=a[j];
            }
            for(int j=0;j<num;j++)
            {
                temp[k++]=a[j];
            }
            int val=0;
            for(int j=0;j<N;j++)
            {
                if(arr[j]%2!=0)
                {
                    System.out.print(arr[j]+" ");
                }
                else
                {
                    System.out.print(temp[val++]+" ");
                }
            }
            System.out.println();
        }
	}
}
