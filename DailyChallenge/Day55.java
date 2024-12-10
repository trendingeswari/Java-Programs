import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt(),arr[][]=new int[R][C],str[][]=new int [R][C];
        int min=(R<C)?R:C;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                arr[i][j]=sc.nextInt();
                str[i][j]=arr[i][j];
            }
        }
        sc.close();Day
        int val=min/2;
        int top=1,bottom=C-2,right=0,left=R-1,tr=0,tc=C-1,rr=R,rc=C-1,bc=1,br=R-1,lr=0,lc=0;
        int Top=0,Bottom=C-1,Right=1,Left=R-2,Tc=C,Tr=0,Rr=R-1,Rc=C-1,Bc=0,Br=R-1,Lr=1,Lc=0;
        for(int i=0;i<val;i++)
        {
            int s[]=new int[10001],ind=0;
            for(int j=top;j<tc;j++)
            {
                s[ind++]=arr[tr][j];
            }
            for(int j=right;j<rr;j++)
            {
                s[ind++]=arr[j][rc];
            }
            for(int j=bottom;j>=bc;j--)
            {
                s[ind++]=arr[br][j];
            }
            for(int j=left;j>=lr;j--)
            {
                s[ind++]=arr[j][lc];
            }
            int vl=0;
            for(int j=Top;j<Tc;j++)
            {
                str[Tr][j]=s[vl++];
            }
            for(int j=Right;j<Rr;j++)
            {
                str[j][Rc]=s[vl++];
            }
            for(int j=Bottom;j>=Bc;j--)
            {
                str[Br][j]=s[vl++];
            }
            for(int j=Left;j>=Lr;j--)
            {
                str[j][Lc]=s[vl++];
            }
            Top++;Bottom--;Right++;
            Bc++;Br--;Left--;Lr++;Lc++;
            Rr--;
            Rc--;
            Tc--;
            Tr++;
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
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(str[i][j]+" ");
            }
            System.out.println();
        }
	}
}
