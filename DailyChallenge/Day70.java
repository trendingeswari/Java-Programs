import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String str[]=sc.nextLine().trim().split("\\s+");
        char s[]={'C','D','H','S'};
        System.out.println();
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i]+" - ");
            int arr[]=new int[21],ind=0;
            char mat[]=new char[21],index=0;
            boolean pre=true;
            for(int j=0;j<str.length;j++)
            {
                char s1[]=str[j].toCharArray();
                char c=s1[s1.length-1];
                int num=0;
                boolean flag=false;
                if(c==s[i])
                {
                    for(int k=0;k<s1.length-1;k++)
                    {
                        if(Character.isDigit(s1[k]))
                        {
                            num=(num*10)+(s1[k]-'0');
                            flag=true;
                        }
                        else
                        {
                            if(s1[k]=='A')
                            {
                                System.out.print(s1[k]+" ");
                                pre=false;
                            }
                            else
                            {
                                mat[index++]=s1[k];
                            }
                            break;
                        }
                    }
                    if(flag)
                    {
                        arr[ind++]=num;
                    }
                }
            }
            for(int j=0;j<ind;j++)
            {
                for(int k=j+1;k<ind;k++)
                {
                    if(arr[j]>arr[k])
                    {
                        int temp=arr[j];
                        arr[j]=arr[k];
                        arr[k]=temp;
                    }
                }
                System.out.print(arr[j]+" ");
            }
            char answer[]={'J','Q','K'};
            for(int j=0;j<answer.length;j++)
            {
                for(int k=0;k<index;k++)
                {
                    if(mat[k]==answer[j])
                    {
                        System.out.print(mat[k]+" ");
                    }
                }
            }
            if(index==0 && ind==0 && pre)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
	}
}
