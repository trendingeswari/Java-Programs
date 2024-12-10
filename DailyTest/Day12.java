/*
 U shaped Layer Matrix

 The program must accept an integer matrix of size RxC as the input. The program must print all the
integers in each U-shaped layer of the given matrix (in a separate line) as the output.
Note: The value of C is always even.
Boundary Condition(s):
2 <= R, C <= 100
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
Output Format:
The lines containing the integer values representing the integers in U-shaped layers of the matrix.
Example Input/Output 1:
Input:
5 4
36 93 11 91
80 79 72 26
82 26 60 52
78 57 64 31
87 44 12 75
Output:
36 80 82 78 87 44 12 75 31 52 26 91
93 79 26 57 64 60 72 11
Explanation:
Two U-shaped layers in the 5x4 matrix are highlighted below.
36 93 11 91
80 79 72 26
82 26 60 52
78 57 64 31
87 44 12 75
Hence the output is
36 80 82 78 87 44 12 75 31 52 26 91
93 79 26 57 64 60 72 11
Example Input/Output 2:
Input:
8 6
50 24 33 45 99 22
13 28 83 47 80 65
64 97 36 56 53 30
21 85 33 66 39 27
59 30 53 17 85 78
35 56 19 32 36 83
91 80 15 47 90 69
20 11 14 65 71 33
Output:
50 13 64 21 59 35 91 20 11 14 65 71 33 69 83 78 27 30 65 22
24 28 97 85 30 56 80 15 47 90 36 85 39 53 80 99
33 83 36 33 53 19 32 17 66 56 47 45
Example Input/Output 3:
Input:
3 6
5 1 10 8 9 8
2 9 10 2 2 3
3 2 3 10 8 2
Output:
5 2 3 2 3 10 8 2 3 8 
1 9 10 2 2 9 
10 8

 */

import java.util.Scanner;

public class Day12 {
    /*public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt(),mat[][]=new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        sc.close();
        int up=0,mid=R-1,down=C-1,midi=1,midf=C-1,downi=R-1,upf=R;
        for(int i=1;i<=C/2;i++)
        {
            for(int row=0;row<upf;row++)
            {
                System.out.print(mat[row][up]+" ");
            }
            for(int col=midi;col<midf;col++)
            {
                System.out.print(mat[mid][col]+" ");
            }
            for(int row=downi;row>=0;row--)
            {
                System.out.print(mat[row][down]+" ");
            }
            System.out.println();
            up++;mid--;down--;midi++;midf--;downi--;upf--;
        }
	}*/
    //another way
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
        sc.close();
		int c1=0,c2=c-1,r1=r-1;
		while(c1<=c2 && r1>=0 && c1<c && c2>=0){
		    for(int i=0;i<=r1;i++){
		        System.out.print(a[i][c1]+" ");
		    }
		    c1++;
		    for(int j=c1;j<=c2;j++){
		        System.out.print(a[r1][j]+" ");
		    }
		    r1--;
		    for(int i=r1;i>=0;i--){
		        System.out.print(a[i][c2]+" ");
		    }
		    c2--;
		    System.out.println();
		}

	}
}
