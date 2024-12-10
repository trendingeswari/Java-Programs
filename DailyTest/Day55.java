import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String ss=sc.nextLine();
        int N=sc.nextInt();
        sc.nextLine();
        sc.close();
        for(int i=0;i<N;i++)
        {
            String str=sc.nextLine();
            char s[]=ss.toCharArray();
            int len=s.length,ind=0;
            if(str.equals("S++"))
            {
                char val[]=new char [len+1];
                for(int j=0;j<len;j++)
                {
                    val[ind++]=s[j];
                }
                val[ind++]=s[len-1];
                String value=new String(val);
                ss=value;
                System.out.println(ss);
            }
            else if(str.equals("++S"))
            {
                char val[]=new char[len+1];
                val[ind++]=s[0];
                for(int j=0;j<len;j++)
                {
                    val[ind++]=s[j];
                }
                String value=new String(val);
                ss=value;
                System.out.println(ss);
            }
            else if(str.equals("S+1"))
            {
                ss+=ss;
                System.out.println(ss);
            }
        }
	}
}
