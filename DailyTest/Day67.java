/*
 
Square Triangle Pattern
The program must accept an integer N as the input. The program must generate a grid of size RxC with the asterisks, where R represents the number of rows in the grid (N) and C represents the number of columns in the grid ((2*N)-1). Then the program must generate a sequence of integers with the squares of the integers 1, 2, 3, 4, ... (3*N)-3. Then the program must modify the grid by replacing the asterisks with the integers in the generated sequence based on the following conditions.
- The asterisks present in the cells from the bottom-left to the top-middle must be replaced with the first N integers in the generated sequence.
- Then the asterisks present in the cells from the top-middle (exclusive) to the bottom-right must be replaced with the next (N-1) integers in the generated sequence.
- Then the asterisks present in the alternate cells from the bottom-right to the bottom-left (both exclusive) must be replaced with the remaining integers in the generated sequence.
Finally, the program must print the RXC grid as the output.

Boundary Condition(s): 2 <= N <= 100
Input Format:
The first line contains N.
Output Format:
The first R lines, each contains C values representing the RXC grid.
Example Input/Output 1:
Input:
3
Output: 
**9**
*4*16*
1*36*25
Explanation:
Here N = 3.
R = N = 3.
C = ((2*N)-1) = ((2*3)-1) = 5.
A sequence of 6 (3*3-3) integers contains 149 16 25 36.
A grid of size 3x5 with asterisks is given below.
After replacing the asterisks with the integers in the generated sequence based on the given conditions, the grid becomes **9**
*4*16* 1*36*25
Example Input/Output 2: Input:
4
Output: 
***16***
**9*25**
*4***36*
1*81*64*49
 */
import java.util.Arrays;
import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String c[][] = new String[n][2*n-1];
        for(int i=0;i<n;i++){
            Arrays.fill(c[i], "*");
        }
        int val=1, idx=0;
        sc.close();
        for(int i=n-1;i>=0;i--){
            c[i][idx]=Integer.toString(val*val);
            val++;
            idx++;
        }
        for(int i=1;i<n;i++){
            c[i][idx]=Integer.toString(val*val);
            val++;
            idx++;
        }
        for(int i=n*2-4;i>1;i-=2){
            c[n-1][i]=Integer.toString(val*val);
            val++;
        }
        for(String i[]:c){
            for(String j:i){
                System.out.print(j);
            }
            System.out.println();
        }
	}
}
