import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String s[]=new String[N];
        int arr[]=new int[N],d[]=new int[N];
        for(int i=0;i<N;i++)
        {
            s[i]=sc.nextLine();
            char c[]=s[i].toCharArray();
            int count=0;
            for(int j=0;j<c.length;j++)
            {
                if(Character.isLowerCase(c[j]))
                {
                    count++;
                }
            }
            arr[i]=count;
            d[i]=i;
        }
        sc.close();
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    temp=d[i];
                    d[i]=d[j];
                    d[j]=temp;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            System.out.println(s[d[i]]);
        }
	}
}
