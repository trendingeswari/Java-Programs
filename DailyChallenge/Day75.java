import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int R=sc.nextInt(),C=sc.nextInt(),M1[][]=new int[R][C],M2[][]=new int[R][C];
        for(int k=0;k<2;k++)
        {
            for(int i=0;i<R;i++)
            {
                for(int j=0;j<C;j++)
                {
                   if(k==0)
                   {
                       M1[i][j]=sc.nextInt();
                   }
                   else
                   {
                       M2[i][j]=sc.nextInt();
                   }
                }
            }
        }
        System.out.println();
        int arr1[]=new int[100],arr2[]=new int[100],ind1=0,ind2=1;
        for(int i=C-1;i>=0;i--)
        {
            if(i%2==0)
            {
                arr1[ind1]=i;
                ind1++;ind1++;
            }
            else
            {
                arr2[ind2]=i;
                ind2++;ind2++;
            }
        }
        ind1=1;ind2=0;
        sc.close();
        for(int i=0;i<C;i++)
        {
            if(i%2!=0)
            {
                arr1[ind1]=i;
                ind1++;ind1++;
            }
            else
            {
                arr2[ind2]=i;
                ind2++;ind2++;
            }
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(i%2==0)
                {
                    System.out.print(M1[i][arr1[j]]+M2[i][arr1[j]]+" ");
                }
                else
                {
                    System.out.print(M1[i][arr2[j]]+M2[i][arr2[j]]+" ");
                }
            }
            System.out.println();
        }
	}
}
