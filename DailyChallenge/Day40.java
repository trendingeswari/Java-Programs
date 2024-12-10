import java.util.Scanner;

public class Day40 {
     public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),mat[][]=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int top=0,bottom=N-1,right=N-1,left=0,max=-1,index=-1;
        for(int k=0;k<(N+1)/2;k++)
        {
            int sum=0;
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                {
                    if((top==i && (left==j||right==j))||(bottom==i &&(left==j || right==j)))
                    {
                        sum+=mat[i][j];
                    }
                }
            }
            if(max<sum)
            {
                max=sum;
                index=k;
            }
            top++;bottom--;right--;left++;
        }
        sc.close();
        int up=index,down=(N-index)-1,l=up,r=down;
        for(int i=up;i<=down;i++)
        {
            for(int j=l;j<=r;j++)
            {
                if(i==up|| i==down || j==l || j==r)
                {
                System.out.print(mat[i][j]+" ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
	}
}
