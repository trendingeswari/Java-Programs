import java.util.*;
public class start {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[]=new int[N],num[]=new int[N],len=N;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            num[i]=arr[i];
        }
        sc.close();
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {       
                if(arr[i]==arr[j])
                {
                    for(int k=j;k<len-1;k++)
                    {
                        arr[k]=arr[k+1];
                    }
                    len--;j--;
                }
            }
        }
        int dif=num.length-len,count=0,sum=0,val=num.length,value=0;
        for(int i=0;i<val;i++)
        {
            for(int j=0;j<val;j++)
            {
                if(arr[i]==num[j])
                {
                    for(int k=j;k<val-1;k++)
                    {
                        num[k]=num[k+1];
                    }
                    val--;
                    i++;
                }
            }
        }
        for(int i=1;;i++)
        {
            boolean flag=true;
            if(count<dif)
            {
                for(int j=0;j<len;j++)
                {
                    if(arr[j]==i)
                    {
                        flag=false;
                    }
                }
                if(flag)
                {
                    int number=Math.abs(num[value++]-i);
                    sum+=number;
                    count++;
                }
            }
            else{
                break;
            }
        }
        System.out.print(sum);
    }
}
