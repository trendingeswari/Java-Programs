import java.util.Scanner;

public class Day73 {
     public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s[]=sc.nextLine().split("\\s+");
        int arr[]=new int[1001],ind=0,mat[]=new int[1001],val=0;
        for(int i=0;i<s.length;i++)
        {
            int num=Integer.parseInt(s[i]);
            mat[val++]=num;
            arr[ind++]=num;
        }
        sc.close();
        for(int i=0;i<val;i++)
        {
            boolean flag=false;
            for(int j=i+1;j<val;j++)
            {
                if(mat[i]==mat[j])
                {
                    arr[i]*=2;
                    arr[j]=0;
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                i++;
            }
        }
        for(int i=0;i<ind;i++)
        {
            if(arr[i]!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<ind;i++)
        {
            if(arr[i]==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
	}
}
