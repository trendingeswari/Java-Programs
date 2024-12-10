import java.util.*;
public class RomanToNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s[]=sc.nextLine().toCharArray();
        sc.close();
        int sum=0;
        if(s[0]=='I'&&s[1]!='I')
        {
            for(int i=0;i<s.length;i++)
            {
                if(s[i]=='I')
                {
                    sum-=1;
                }
                else if(s[i]=='V')
                {
                    sum+=5;
                }
                else if(s[i]=='X')
                {
                    sum+=10;
                }
                else if(s[i]=='L')
                {
                    sum+=50;
                }
            }
        }
        else//if(s[0]!='I'&&s[1]!='V')
        {
            for(int i=0;i<s.length;i++)
            {
                if(s[i]=='I')
                {
                    sum+=1;
                }
                else if(s[i]=='V')
                {
                    sum+=5;
                }
                else if(s[i]=='X')
                {
                    sum+=10;
                }
                else if(s[i]=='L')
                {
                    sum+=50;
                }
            }
        }
        System.out.print(sum);
    }
}
