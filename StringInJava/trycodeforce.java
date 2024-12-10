import java.util.Scanner;

public class trycodeforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char s[]=sc.nextLine().toCharArray();
        int len=s.length;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(s[i]==s[j])
                {
                    for(int k=j;k<len-1;k++)
                    {
                        s[k]=s[k+1];
                    }
                    len--;j--;
                }
            }
        }
        System.out.print((len%2==0)?"CHAT WITH HER!":"IGNORE HIM!");
    }
}