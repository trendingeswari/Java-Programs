import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        String s[]=sc.nextLine().split("\\s+");
        int arr[]=new int[s.length],ind=0,mat[]=new int[s.length],val=0;
        for(int i=0;i<s.length;i++)
        {
            int num=Integer.parseInt(s[i]);
            arr[ind++]=num;
            mat[val++]=num;
        }
        for(int i=0;i<val;i++)
        {
            for(int j=i+1;j<val;j++)
            {
                if(mat[i]>mat[j])
                {
                    int temp=mat[i];
                    mat[i]=mat[j];
                    mat[j]=temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<ind;i++)
        {
            boolean flag=true;
            for(int j=0;j<val;j++)
            {
                if(arr[i]<mat[j])
                {
                    flag=false;
                    System.out.print(mat[j]+" ");
                    break;
                }
            }
            if(flag)
            {
                System.out.print("-1 ");
            }
        }
	}
}
