import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt(),mat[][]=new int[R][C],count=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int j=0;j<C;j++)
        {
            boolean flag=true;
            for(int i=0;i<R-1;i++)
            {
                if(mat[i][j]<mat[i+1][j])
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
        System.out.print(count);
	}
}
