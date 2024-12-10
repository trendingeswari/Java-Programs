/*
War Field - Largest Battalion
 The program must accept an integer matrix of size RxC representing the blueprint of a war field as the
input. The matrix always contains 1s and 0s, where each 1 represents a soldier and each 0 represents
an empty place. A group of soldiers in the war field is called a battalion, where the soldiers are
connected vertically and horizontally. The program must print the number of soldiers in the largest
battalion as the output.
Note: At least one soldier is always present in the war field.
Boundary Condition(s):
2 <= R, C <= 50
Input Format:
The first line contains R and C separated by a space.
The next R lines each contain C integers separated by a space.
Output Format:
The first line contains the number of soldiers in the largest battalion.
Example Input/Output 1:
Input:
5 5
0 0 0 1 0
0 0 0 1 1
0 0 0 0 0
0 0 0 1 0
0 1 1 1 1
Output:
5
Explanation:
The largest battalion in the war field is highlighted below.
0 0 0 1 0
0 0 0 1 1
0 0 0 0 0
0 0 0 1 0
0 1 1 1 1
Here the number of soldiers in the largest battalion is 5, so 5 is printed as the output.
Example Input/Output 2:
Input:
6 4
0 0 0 1
0 0 0 0
0 0 1 1
0 1 1 0
0 0 0 1
0 0 1 1
Output:
4
 */

import java.util.Scanner;

public class Day3 {
    public static int trav(int g[][],int i,int j,int r,int c){
        if(i<0 || j<0 || i>=r || j>=c){
            return 0;
        }
        if(g[i][j]==0){
            return 0;
        }
        g[i][j]=0;
        int ri=1;
        ri+=trav(g,i-1,j,r,c);
        ri+=trav(g,i,j-1,r,c);
        ri+=trav(g,i+1,j,r,c);
        ri+=trav(g,i,j+1,r,c);
        return ri;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		int ar=0;
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        int aa=trav(a,i,j,r,c);
		        ar=Math.max(aa,ar);
		    }
		}
		sc.close();
		System.out.print(ar);
	}
}