/*
 The program must accept an integer matrix of size NxN as the input. The program must print YES if
the matrix has at least one repeated 2x2 submatrix without overlapping. Else the program must
print NO as the output.
Boundary Condition(s):
4 <= N <= 25
Input Format:
The first line contains N.
The next N lines each contain N integers separated by a space.
Output Format:
The first line contains either YES or NO.
Example Input/Output 1:
Input:
4
4 5 7 8
6 2 1 6
1 2 4 5
9 4 6 2
Output:
YES
Explanation:
The repeated 2x2 submatrices without overlapping are highlighted below.
4 5 7 8
6 2 1 6
1 2 4 5
9 4 6 2
Example Input/Output 2:
Input:
6
28 44 22 23 44 41
14 40 20 33 10 12
16 29 10 20 33 33
49 49 49 10 20 25
49 49 49 32 45 33
49 49 49 25 20 22
Output:
NO
 */

import java.util.Scanner;

public class RepeatedSubMatrix {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),a[][]=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
        sc.close();
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<=n-2;j++){
                for(int k=0;k<=n-2;k++){
                    for(int l=0;l<=n-2;l++){
                        if(a[i][j]==a[k][l]&&(k>i+1||l>j+1)&&a[i+1][j]==a[k+1][l]&&a[i][j+1]==a[k][l+1]&&a[i+1][j+1]==a[k+1][l+1]) {
                            System.out.printf("YES");
                            return;
                        }
                    }
                }
            }
        }
        System.out.printf("NO");
	}
}
