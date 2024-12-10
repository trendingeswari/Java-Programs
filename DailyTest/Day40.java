import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[][]=new int[N][N],num=N,mat[][]=new int[N][N];
        sc.close();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                arr[i][j]=num++;
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=arr[j][i];
            };
        }
        System.out.println();
        for(int i=0;i<N;i++)
        {
            if(i%2!=0)
            {
                int value[]=new int[N],val=0;
                for(int j=N-1;j>=0;j--)
                {
                    value[val++]=mat[i][j];
                }
                for(int j=0;j<val;j++)
                {
                    mat[i][j]=value[j];
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
	}
}
