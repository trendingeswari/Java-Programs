import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s[]=sc.nextLine().split(":");
        int num1=Integer.parseInt(s[0]),num2=Integer.parseInt(s[1]);
        sc.close();
        for(int i=num1;i<=23;i++)
        {
            for(int j=num2;j<=59;j++)
            {
                int n1=i,n2=j,a1[]=new int[3],a2[]=new int[3],ind1=0,ind2=0;
                String s1=Integer.toString(i),s2=Integer.toString(j);
                int len1=s1.length(),len2=s2.length();
                while(n1>0)
                {
                    a1[ind1++]=n1%10;
                    n1/=10;
                }
                if(len1==1)
                {
                    a1[ind1++]=0;
                }
                while(n2>0)
                {
                    a2[ind2++]=n2%10;
                    n2/=10;
                }
                if(len2==1)
                {
                    a2[ind2++]=0;
                }
                boolean flag=true;
                for(int k=ind1-1,l=0;k>=0;k--,l++)
                {
                    if(a1[k]!=a2[l])
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag)
                {
                    for(int k=ind1-1;k>=0;k--)
                    {
                        System.out.print(a1[k]);
                    }
                    System.out.print(":");
                    for(int k=ind2-1;k>=0;k--)
                    {
                        System.out.print(a2[k]);
                    }
                    return;
                }
            }
            if(num1==i)
            {
                num2=0;
            }
        }
	}
}
