/*
 
Maximum Sum - Remove Subarray
The program must accept an array of N integers and an integer K as the input. The program must remove a subarray of size K in the give array so that the sum of the remaining integers in the array is maximum. Then the program must print the integers that are removed from the array as the output. If two or more such subarrays are present in the given array, then the program must remove the first occurring subarray.
Boundary Condition(s): 1 <= K < N <= 10^5
-100 <= Each integer value <= 100
Input Format:
The first line contains N.
The second line contains N integers
separated by a space.
The third line contains K.
Output Format:
The first line contains K integers
representing the integers in the subarray which are removed as per the given conditions.
Example Input/Output 1: 
Input: 
7
10 20 5 2-5 66-69
3
Output: 
-5 66-69
Explanation:
The 7 integers are 10 20 5 2-5 66-69. The maximum sum 37 is obtained by removing the last subarray [-5, 66, -69]. Hence the output is
-5 66-69
Example Input/Output 2: 
Input:
9
2 12 3 5 4 3 3 8 1
4
Output: 
3 5 4 3
 */
import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int sum=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    sum+=a[i];
		}
		int k=sc.nextInt(),csum=0;
        sc.close();
        for(int i=0;i<k;i++){
            csum+=a[i];
        }
        int minsum=csum,pos=0;
        for(int i=k;i<n;i++){
            csum-=a[i-k];
            csum+=a[i];
            if(csum<minsum){
                minsum=csum;
                pos=i-k+1;
            }
        }
        for(int i=pos;i<pos+k;i++){
            System.out.print(a[i]+" ");
        }
	}
}
