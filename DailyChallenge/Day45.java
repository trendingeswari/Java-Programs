import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[]=new int[N],sum=0;
        sc.close();
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            String s=Integer.toString(arr[i]);
            char str[]=s.toCharArray();
            int num=0,len=s.length();
            if(arr[i]%2==0)
            {
                for(int j=0;j<len-1;j++)
                {
                    for(int k=j+1;k<len-1;k++)
                    {
                        if(str[j]<str[k])
                        {
                            char temp=str[j];
                            str[j]=str[k];
                            str[k]=temp;
                        }
                    }
                    num=(num*10)+(str[j]-'0');
                }
                num=(num*10)+(str[len-1]-'0');
            }
            else
            {
                for(int j=0;j<len-1;j++)
                {
                    for(int k=j+1;k<len-1;k++)
                    {
                        if(str[j]>str[k])
                        {
                            char temp=str[j];
                            str[j]=str[k];
                            str[k]=temp;
                        }
                    }
                    num=(num*10)+(str[j]-'0');
                }
                num=(num*10)+(str[len-1]-'0');
            }
            sum+=num;
        }
        System.out.print(sum);
	}
}
