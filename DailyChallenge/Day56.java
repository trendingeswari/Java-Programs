import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),R=N+1,C=(N*2)+1,mid=C/2;
        char s[][]=new char[R][C];
        sc.close();
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(i==0 || (j==mid) || (i==j) || ((i+j)==C-1))
                {
                    s[i][j]='*';
                }
                else
                {
                    s[i][j]='0';
                }
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
	}
}
