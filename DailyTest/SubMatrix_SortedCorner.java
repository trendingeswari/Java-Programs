import java.util.Scanner;

/**
 The program must accept an integer matrix of size RxC and an integer K as the input. 
 The program must print the number of sub-matrices of size KxK, where the four integers in it's corners are sorted in ascending order (in the clockwise direction). 
 Note: The value of K is always less than or equal to the minimum of R and C. 
 Boundary Condition(s): 2 <= R, C <= 50 
 Input Format: The first line contains R and C separated by a space. The next R lines, each contains C integers separated by a space. The (R+2)nd line contains K. 
 Output Format: The first line contains an integer representing the number of sub-matrices based on the given condition. 
 Example Input/Output 1: 
 Input: 
 3 4 
 3 5 2 7 
 1 3 9 7 
 8 7 1 5 
 2 
 Output: 
 2 
 Explanation: In the given 3x4 matrix, the two sub-matrices which contain the sorted integers (in the clockwise direction) in it's corners are highlighted below. 3 5 2 7 1 3 9 7 8 7 1 5 Hence the output is 2 
 Example Input/Output 2: 
 Input: 
 5 5 
 67 37 68 19 55 
 32 12 45 12 12 
 70 17 69 18 89 
 78 55 55 22 54 
 87 65 97 14 91 
 3 
 Output: 
 4
 */
public class SubMatrix_SortedCorner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt(),a[][]=new int [r][c],k=0,count=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        k=sc.nextInt();
        sc.close();
        for(int i=0;i<r;i++)
        {
            if(r-i>=k)
            {
                for(int j=0;j<c;j++)
                {
                    if(c-j>=k)
                    {
                        int b[]=new int[1001],ind=0;
                        for(int e=i,cout=1;cout<=k;e++,cout++)
                        {
                            for(int m=j,val=1;val<=k;m++,val++)
                            {
                                if((e==i&&m==j)||(e==i&&val==k)||(cout==k&&m==j)||(cout==k&&val==k))
                                {
                                    b[ind++]=a[e][m];
                                }
                            }
                        }
                        int temp=b[2];
                        b[2]=b[3];
                        b[3]=temp;
                        boolean flag=true;
                        for(int o=0;o<ind-1;o++)
                        {
                            if(b[o]>b[o+1])
                            {
                                flag=false;
                                break;
                            }
                        }
                        if(flag)
                        {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.print(count);
	}
}
