import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char s[]=sc.nextLine().toCharArray();
        int V=0;
        for(int i=0;i<s.length;i++)
        {
            if(isvowel(s[i]))
            {
                V++;
            }
        }
        sc.close();
        int arr[][]=new int [V/2][2],ind=0;
        int v1=0,v2=(s.length)-1;
        for(int i=0;i<V/2;i++)
        {
            int ind1=-1,ind2=-1;
            for(int j=v1;j<=s.length/2;j++)
            {
                if(isvowel(s[j]))
                {
                    ind1=j;
                    v1=j+1;
                    break;
                }
            }
            for(int j=v2;j>=0;j--)
            {
                if(isvowel(s[j]))
                {
                    ind2=j;
                    v2=j-1;
                    break;
                }
            }
            arr[ind][0]=ind1;arr[ind][1]=ind2;
            ind++;
            if(ind1!=-1 || ind2!=-1)
            {
                for(int j=0;j<s.length;j++)
                {
                    if((j==ind1 && ind1!=-1) || (j==ind2 && ind2!=-1))
                    {
                        System.out.print("-"+s[j]+"-");
                    }
                    else
                    {
                        System.out.print(s[j]);
                    }
                }
                System.out.println();
            }
        }
        if(V%2!=0)
        {
            int index=-1;
            for(int j=v1;j<=s.length/2;j++)
            {
                if(isvowel(s[j]))
                {
                    index=j;
                    break;
                }
            }
            for(int j=0;j<s.length;j++)
            {
                if(index==j)
                {
                    System.out.print("-"+s[j]+"-");
                }
                else
                {
                    System.out.print(s[j]);
                }
            }
            System.out.println();
        }
        for(int i=ind-1;i>=0;i--)
        {
            int in1=arr[i][0],in2=arr[i][1];
            for(int j=0;j<s.length;j++)
            {
                if((j==in1 && in1!=-1)||(j==in2 && in2!=-1))
                {
                    System.out.print("-"+s[j]+"-");
                }
                else 
                {
                    System.out.print(s[j]);
                }
            }
            System.out.println();
        }
	}
	public static boolean isvowel(char c)
	{
	    c=Character.toLowerCase(c);
	    return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
	}
}
