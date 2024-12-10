import java.util.Scanner;

public class Day57 {
        public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),ind=0;
        long arr[]=new long[10001];
        sc.close();
        while(N>0)
        {
            arr[ind++]=N%2;
            N/=2;
        }
        int count=0;
        for(int i=ind-1;i>=0;i--)
        {
            if(arr[i]==0)
            {
                count++;
                for(int j=i-1;j>=0;j--)
                {
                    if(arr[j]==0)
                    {
                        count++;
                    }
                    else
                    {
                        break;
                    }
                }
                arr[i]=count;
                for(int j=i-1;j>=0;j--)
                {
                    if(arr[j]==0)
                    {
                        arr[j]=count;
                    }
                    else
                    {
                        i=j;
                        break;
                    }
                }
                count=0;
            }
        }
        long number=0;
        for(int i=ind-1;i>=0;i--)
        {
            number=(number*10)+arr[i];
        }
        long ans[]=new long[100001];
        int val=0;
        while(number>0)
        {
            ans[val++]=number%2;
            number/=2;
        }
        for(int i=val-1;i>=0;i--)
        {
            System.out.print(ans[i]);
        }
	}
}
