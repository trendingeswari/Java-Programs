import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt(),arr[][]=new int[R][C],str[][]=new int[R][C];
        int min=(R<C)?R:C;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                arr[i][j]=sc.nextInt();
                str[i][j]=arr[i][j];
            }
        }
        System.out.println();
        /*for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(i==0 || i==R-1 || j==0 || j==C-1)
                {
                    if(i==0 && j==0)
                    {
                        continue;
                    }
                    else
                    {
                        System.out.print(arr[i][j]+" ");
                    }
                }
            }
        }
        System.out.print(arr[0][0]);*/
        int val=min/2;
        int top=1,bottom=C-2,right=0,left=R-1,tr=0,tc=C-1,rr=R,rc=C-1,bc=1,br=R-1,lr=0,lc=0;
        int Tr=0,Tc=0,Rr=1,Rc=C-1
        for(int i=0;i<val;i++)
        {
            int s[]=new int[10001],ind=0;
            int temp1=Tc,temp2=Rr;
            boolean f1=false,f2=false,f3=false,f4=false;
            for(int j=top;j<tc;j++)
            {
                
                //System.out.print(arr[tr][j]+" ");
                s[ind++]=arr[tr][j];
                f1=true;
                str[Tr][temp1++]=arr[tr][j];
            }
            for(int j=right;j<rr;j++)
            {
                //System.out.print(arr[j][rc]+" ");
                s[ind++]=arr[j][rc];
                if(j==right)
                {
                    str[Tr][temp1++]=arr[j][rc];
                }
                else
                {
                    str[temp2++][Rc]=arr[j][rc];
                }
                f2=true;
            }
            for(int j=bottom;j>=bc;j--)
            {
                //System.out.print(arr[br][j]+" ");
                s[ind++]=arr[br][j];
                if(j==bottom)
                {
                    str[temp2++][Rc]=arr[br][j];
                }
                f3=true;
            }
            for(int j=left;j>=lr;j--)
            {
                //System.out.print(arr[j][lc]+" ");
                s[ind++]=arr[br][j]
                f4=true;
            }
            for(int j=0;j<R;j++)
            {
                for(int k=0;k<C;k++)
                {
                    System.out.print(str[j][k]+" ");
                }
                System.out.println();
            }
           /* int val=0;
            for(int j=0;j<tc;j++)
            {
                arr[tr][j]=s[val++];
            }
            for(int j=0;j<R;j++)
            {
                arr[j][C-1]=s[val++];
            }
            for(int j=bottom)*/
            System.out.println();
            Rr++;
            Rc--;
            top++;
            tr++;
            tc--;
            right++;
            rr--;
            rc--;
            bottom--;
            br--;
            bc++;
            left--;
            lr++;
            lc++;
            Tr++;
            Tc++;
        }
	}
}
