import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt(),mat[][]=new int[R][C],arr[]=new int[R],ind=0,d[]=new int[R];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
                if(j==C-1)
                {
                    d[ind]=ind;
                    arr[ind++]=mat[i][j];
                }
            }
        }
        for(int i=0;i<ind-1;i++)
        {
            for(int j=0;j<ind-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    temp=d[j];
                    d[j]=d[j+1];
                    d[j+1]=temp;
                }
            }
        }
        sc.close();
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(mat[d[i]][j]+" ");
            }
            System.out.println();
        }
	}
}
