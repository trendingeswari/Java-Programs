/*
 
Sorted Submatrix

The program must accept an integer matrix of size RxC and an integer M as the input. The program must print YES if the given matrix contains at least one submatrix of size MxM where all the integers in each row and column are sorted in ascending order. Else the program must print NO as the output.
Note: The value of M is always less than or equal to the minimum between R and C.
Boundary Condition(s):
2 <= R, C <= 50
2 <= M <= 10
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
The (R+2)nd line contains M.
Output Format:
The first line contains YES or NO.

Example Input/Output 1:
Input:
45
19124
89236
37578
51234
3
Output: YES
Explanation:
In the given 4x5 matrix, the 3x3 sub-matrix with sorted rows and columns is highlighted
below.
19124
89236
37578
51234
So YES is printed as the output.
Example Input/Output 2:
Input:
34
1234
5678
9012
3
Output:
NO
 */
import java.util.Scanner;

public class Day50 {
    public static boolean fun(int r1,int c1,int a[][],int k,int r,int c){
        for(int i=r1;i<r1+k;i++){
            for(int j=c1;j<c1+k-1;j++){
                if(a[i][j]>a[i][j+1])return false;
            }
        }
        for(int j=c1;j<c1+k;j++){
            for(int i=r1;i<r1+k-1;i++){
                if(a[i][j]>a[i+1][j])return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
        sc.close();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		int k=sc.nextInt();
		for(int i=0;i<=r-k;i++){
		    for(int j=0;j<=c-k;j++){
		        if(fun(i,j,a,k,r,c)){
		           System.out.print("YES");
		          return ;
		        }
		    }
		}
		System.out.print("NO");
	
		
	}

}
