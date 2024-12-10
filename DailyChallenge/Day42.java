import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),acount=0;
        sc.nextLine();
        String str[]=sc.nextLine().split("\\s+");
        char s[];
        sc.close();
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                if(i!=j)
                {
                    int count=0;
                    boolean f1=false,f2=false,f0=false,f3=false,f4=false,f5=false,f6=false,f7=false,f8=false,f9=false;
                    while(count<2)
                    {
                        if(count==0)
                            s=str[i].toCharArray();
                        else
                            s=str[j].toCharArray();
                        for(int k=0;k<s.length;k++)
                        {
                            int num=s[k]-'0';
                            switch(num)
                            {
                                case 0:
                                    f0=true;break;
                                case 1:
                                    f1=true;break;
                                case 2:
                                    f2=true;break;
                                case 3:
                                    f3=true;break;
                                case 4:
                                    f4=true;break;
                                case 5:
                                    f5=true;break;
                                case 6:
                                    f6=true;break;
                                case 7:
                                    f7=true;break;
                                case 8:
                                    f8=true;break;
                                case 9:
                                    f9=true;
                            }
                        }
                        count++;
                    }
                    if(f1&& f0 && f2&& f3&& f4&& f5&& f6&& f7 && f8&& f9)
                    {
                        acount++;
                    }
                }
            }
        }
        System.out.print(acount);
	}
}
