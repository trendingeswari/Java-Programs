import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s[]=sc.nextLine().split("\\s+");
        int arr[]=new int[s.length],ind=0;
        for(int i=0;i<s.length;i++)
        {
            arr[ind++]=Integer.parseInt(s[i]);
        }
        sc.close();
        for(int i=0;i<ind;i++)
        {
            for(int j=i+1;j<ind;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        boolean run=true;
        int value[]=new int[ind],sum=0;
        while(run)
        {
            int val=0;
            if(ind%2==0)
            {
                for(int i=0;i<ind;i+=2)
                {
                    sum=arr[i]+arr[i+1];
                    value[val++]=sum;
                    sum=0;
                }
            }
            else
            {
                for(int i=0;i<ind-1;i+=2)
                {
                    sum=arr[i]+arr[i+1];
                    value[val++]=sum;
                    sum=0;
                }
                value[val++]=arr[ind-1];
            }
            ind=0;
            for(int i=0;i<val;i++)
            {
                arr[ind]=value[i];
                System.out.print(arr[ind++]+" ");
            }
            System.out.println();
            if(ind==1)
            {
                break;
            }
        }
	}
}
