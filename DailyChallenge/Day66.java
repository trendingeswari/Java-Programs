/*
 
Nested Triangle Pattern
The program must accept an integer N as the input. The program must print a triangle based on the following conditions.
- The triangle contains (N+1)/2 layers. - The outermost layer contains the character H, the second outermost layer contains the character O. Similarly, the remaining layers contain the characters H and O alternatively.
- Hash symbols (#) are printed in front of the first N-1 rows of the triangle to make the triangle more clear.
Boundary Condition(s): 2 <= N <= 100
Input Format:
The first line contains N.
Output Format:
The first N lines containing the triangle pattern based on the given conditions.
Example Input/Output 1:
Input:
5
Output: ####H ###HOH
##HOHOH
#HOOOOOH HHHHHHHHH
Explanation:
Here N = 5, so the triangle contains 3 layers ((5+1)/2).
The outer layer contains the character H. The middle layer contains the character O. The inner layer contains the character H. Hash symbols (#) are printed in front of the first 4 rows of the triangle.
####H
###HOH
##HOHOH
#HOOOOOH
HHHHHHHHH
Example Input/Output 2:
Input:
6
Output: #####H
####HOH
###HOHOH
##НОНННОН
#HOOOOOOOH
AAAHHHHHHHH
 */
import java.util.Scanner;

public class Day66 {
    static int findDist(int n, int i, int j){
        int rightEnd = i*2; 
        int d = Math.min(j, rightEnd - j);
        d = Math.min(d, n-i-1);
        return d;
    }

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i, j;
        for(i=0; i<n; i++){
            System.out.print("#".repeat(n-i-1));
            for(j=0; j<=2*i; j++){
                if(findDist(n, i, j)%2==0){
                    System.out.print("H");
                }else{
                    System.out.print("O");
                }
            }
            System.out.println();
        }
	}
}
