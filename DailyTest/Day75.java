import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        long ans=0;
        sc.nextLine();
        String S[]=sc.nextLine().split("\\s+");
        for(int i=0;i<S.length;i++)
        {
            char str[]=S[i].toCharArray();
            int len=str.length,num=len/2,sum=0,count=0;
            for(int j=0;j<str.length;j++)
            {
                count++;
                sum=(sum*10)+(str[j]-'0');
                if(count==num)
                {
                    ans+=(int)sum;
                    sum=0;
                    count=0;
                }
            }
        }
        sc.close();
        System.out.print(ans);
	}
}
