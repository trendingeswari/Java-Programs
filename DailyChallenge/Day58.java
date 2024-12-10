import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[]=new int[N],min=11,sum=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if(i==0)
            {
                int val=arr[i];
                while(val>0)
                {
                    if((val%10)<min)
                    {
                        min=val%10;
                    }
                    val/=10;
                }
            }
        }
        sc.close();
        sum+=min;
        int index=min;
        for(int i=1;i<N;i++)
        {
            int value=arr[i],ans[]=new int[1001],ind=0;
            boolean flag=false;
            while(value>0)
            {
                ans[ind++]=value%10;
                value/=10;
            }
            for(int j=0;j<ind;j++)
            {
                for(int k=j+1;k<ind;k++)
                {
                    if(ans[j]>ans[k])
                    {
                        int temp=ans[j];
                        ans[j]=ans[k];
                        ans[k]=temp;
                    }
                }
            }
            for(int j=0;j<ind;j++)
            {
                if(index<=ans[j])
                {
                    index=ans[j];
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                sum+=index;
            }
        }
        System.out.print(sum);
	}
}
