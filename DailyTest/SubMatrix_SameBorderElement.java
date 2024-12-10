/*
 The program must accept an integer matrix of size RxC and an integer K as the input. The program must print YES if there is at least one KxK sub matrix in the given RxC matrix with all the elements in the border having the same value. Else the program must print NO as the output. 
 Boundary Condition(s): 3 <= R, C <= 50 3 <= K <= R and C 
 Input Format: The first line contains R and C separated by a space. The next R lines, each containing C integers separated by a space. The (R+2)nd line contains K. 
 Output Format: The first line contains either YES or NO. 
 Example Input/Output 1: 
 Input: 
 5 6 
 1 2 3 4 5 5 
 5 2 5 2 4 5 
 6 7 5 5 5 3 
 5 7 5 4 5 4 
 7 7 5 5 5 1 
 3 
 Output: 
 YES 
 Explanation: Here K=3, the 3x3 sub matrix with all the elements in the border having the same value is highlighted below. 
 1 2 3 4 5 5 
 5 2 5 2 4 5 
 6 7 5 5 5 3 
 5 7 5 4 5 4 
 7 7 5 5 5 1 
 Example Input/Output 2: 
 Input: 
 5 4 
 18 71 41 76 
 68 17 48 26 
 92 46 86 80 
 55 28 88 10 
 32 93 64 65 
 4 
 Output: 
 NO
 */

import java.util.Scanner;

public class SubMatrix_SameBorderElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt(),a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
        int k=sc.nextInt();
        System.out.println();
        for(int i=0;i<r;i++)
        {
            if(r-i>=k)
            {
                for(int j=0;j<c;j++)
                {
                    if(c-j>=k)
                    {
                        int b[]=new int[r*c],ind=0;
                        for(int l=i,count=1;count<=k;l++,count++)
                        {
                            for(int m=j,val=1;val<=k;m++,val++)
                            {
                                if(l==i||k==count||m==j||k==val)
                                {
                                    b[ind++]=a[l][m];
                                }
                            }
                        }
                        boolean flag=true;
                        for(int p=0;p<ind-1;p++)
                        {
                            if(b[p]>b[p+1]||b[p]<b[p+1])
                            {
                                flag=false;
                            }
                        }
                        if(flag)
                        {
                            System.out.print("YES");
                            return ;
                        }
                    }
                }
            }
        }
        System.out.print("NO");
	}
}
