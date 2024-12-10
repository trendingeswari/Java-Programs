/*
 The program must accept an integer array of size N and two integers R and X as the input. The
program must print the output based on the following condition.
- The program must shift the integers in the array to the left by R positions. Then the program must
remove the last X integers in the modified array. Then the program must print the integers in the
modified array as the output.
The program must repeat the above process until the array becomes empty.
Note: When removing the last X integers, if the array contains less than X integers, then all integers
are removed and the program ends.
Boundary Condition(s):
2 <= N <= 100
1 <= R <= 100
1 <= X < N
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
The third line contains R and X separated by a space.
Output Format:
The lines containing the integers separated by a space.
Example Input/Output 1:
Input:
8
99 58 28 33 90 30 81 64
2 2
Output:
28 33 90 30 81 64
90 30 81 64
81 64
Explanation:
Here R = 2 and X = 2.
After shifting the integers in the array to the left by 2 positions, the array becomes 28 33 90 30 81 64
99 58.
After removing the last 2 integers, the array becomes 28 33 90 13 81 64. So the integers in the
modified array are printed.
After shifting the integers in the modified array to the left by 2 positions, the array becomes 90 13 81
64 28 33.
After removing the last 2 integers, the array becomes 90 13 81 64. So the integers in the modified
array are printed.
After shifting the integers in the modified array to the left by 2 positions, the array becomes 81 64 90
13.
After removing the last 2 integers, the array becomes 81 64. So the integers in the modified array are
printed.
4/29/24, 10:56 PM skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT
https://www.skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT 1/2
After shifting the integers in the modified array to the left by 2 positions, the array becomes 81 64.
After removing the last 2 integers, the array is empty.
Example Input/Output 2:
Input:
6
11 43 36 25 12 45
3 1
Output:
25 12 45 11 43
11 43 25 12
12 11 43
12 11
11
Example Input/Output 3:
Input:
4
10 20 30 40
1 3
Output:
20
 */
import java.util.*;
public class LeftShiftAndRemoveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        int R=sc.nextInt(),X=sc.nextInt();
        sc.close();
        while(N>=X){
            int temp[] = new int[N];
            int mid = R%N,ind=0;
            for(int i=mid;i<N;i++){
                temp[ind++]=arr[i];
            }
            for(int i=0;i<mid;i++){
                temp[ind++]=arr[i];
            }
            N -= X;
            for(int i=0;i<N;i++){
                System.out.print(temp[i]+" ");
            }
            arr = temp;
            if(N!=X)
                System.out.println();
        }
	}
}
