import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String str[]=new String[N];
        int arr[]=new int[N],D[]=new int[N];
        for(int i=0;i<N;i++)
        {
            String s[]=sc.nextLine().split("\\s+");
            str[i]=s[0];
            arr[i]=Integer.parseInt(s[1]);
        }
        sc.close();
        for(int i=0;i<N-1;i++)
        {
            for(int j=0;j<N-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    String tem=str[j];
                    str[j]=str[j+1];
                    str[j+1]=tem;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(str[i].equals(str[j]))
                {
                    for(int k=j;k<N-1;k++)
                    {
                        str[k]=str[k+1];
                        arr[k]=arr[k+1];
                    }
                    N--;j--;
                }
            }
        }
        int index1=-1,index3=-1;
        boolean flag=false;
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]==arr[j])
                {
                    index1=i;
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                flag=false;
                break;
            }
        }
        for(int i=index1;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]!=arr[j])
                {
                    index3=j;
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                break;
            }
        }
        char c[]=new char[N];
        for(int i=index1;i<index3;i++)
        {
            c[i]= str[i].charAt(0);
            D[i]=i;
        }
        for(int i=index1;i<index3;i++)
        {
            for(int j=i+1;j<index3;j++)
            {
                if(c[i]>c[j])
                {
                    char val=c[i];
                    c[i]=c[j];
                    c[j]=val;
                    int t=D[i];
                    D[i]=D[j];
                    D[j]=t;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            if(i>=index1 && i<index3)
            {
                System.out.println(str[D[i]]+" "+arr[i]);
            }
            else
            {
                System.out.println(str[i]+" "+arr[i]);
            }
        }
	}
}
