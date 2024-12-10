import java.util.*;
public class Day68 {
    void findper(int arr[],int size,int n)
    {
        int array[]=new int[1001],ind=0;
        if(size==1)
        {
            int num=0;
            for(int i=0;i<n;i++)
            {
                num=(num*10)+arr[i];
            }
            array[ind++]=num;
        }
        for(int i=0;i<size;i++)
        {
            findper(arr,size-1,n);
            if(size%2==1)
            {
                int temp=arr[0];
                arr[0]=arr[size-1];
                arr[size-1]=temp;
            }
            else
            {
                int temp=arr[i];
                arr[i]=arr[size-1];
                arr[size-1]=temp;
            }
        }
        givearray(array,ind);
    }
    void givearray(int array[],int ind)
    {
        int value[]=new int[10001],index=0;
        for(int i=0;i<ind;i++)
        {
            if(array[i]%2!=0)
            {
                System.out.print(array[i]+" ");
                value[index++]=array[i];
            }
        }
        Arrays.sort(value);
    }
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),num=N,arr[]=new int[10001],ind=0;
        while(num>0)
        {
            arr[ind++]=num%10;
            num/=10;
        }
        System.out.println();
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
        }
        sc.close();
        Day68 per=new Day68();
        per.findper(arr,ind,ind);
    }
}

