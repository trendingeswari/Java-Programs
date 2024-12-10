/*
 The program must accept an integer matrix of size RxC as the input. The program must sort all the
integers in the border of the matrix in ascending order (in the clockwise direction). Then the program
must print the modified matrix as the output.
Boundary Condition(s):
2 <= R, C <= 100
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
Output Format:
The first R lines, each contains C integers of the modified matrix separated by a space.
Example Input/Output 1:
Input:
5 6
60 37 26 98 10 73
21 50 32 51 12 43
52 19 29 81 14 33
13 94 17 63 67 80
90 25 77 11 78 54
Output:
10 11 13 21 25 26
98 50 32 51 12 33
90 19 29 81 14 37
80 94 17 63 67 43
78 77 73 60 54 52
Explanation:
All the integers present in the border of the given matrix are highlighted below.
60 37 26 98 10 73
21 50 32 51 12 43
52 19 29 81 14 33
13 94 17 63 67 80
90 25 77 11 78 54
After sorting all the integers in the border of the matrix in ascending order (in the clockwise direction),
the matrix becomes
10 11 13 21 25 26
98 50 32 51 12 33
90 19 29 81 14 37
80 94 17 63 67 43
78 77 73 60 54 52
Example Input/Output 2:
Input:
4 4
5/2/24, 4:42 AM skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT
https://www.skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT 1/2
354 234 398 259
104 380 160 352
331 289 360 126
127 261 181 288
Output:
104 126 127 181
398 380 160 234
354 289 360 259
352 331 288 261
 */
import java.util.*;
public class SortBorderInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt(),a[][]=new int [r][c],s[]=new int[1001],ind=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
                if(i==0||i==r-1||j==0||j==c-1)
                {
                    s[ind++]=a[i][j];
                }
            }
        }
        for(int i=0;i<ind;i++)
        {
            for(int j=i+1;j<ind;j++)
            {
                if(s[i]>s[j])
                {
                    int temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        int val=0,value=ind-1;
        System.out.println();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0)
                {
                    System.out.print(s[val++]+" ");
                }
                else if(j==0||i==r-1)
                {
                    System.out.print(s[value--]+" ");
                }
                else if(j==c-1)
                {
                    System.out.print(s[val++]+" ");
                }
                else
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
	}
}
