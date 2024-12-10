import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        sc.close();
        for(int i=N+1;;i++)
        {
            int num=i;
            boolean pre=true;
            while(num>0)
            {
                int val=num%10;
                if(val!=2 && val!=3 && val!=5 && val!=7)
                {
                    pre=false;
                    break;
                }
                num/=10;
            }
            if(pre)
            {
                System.out.print(i);
                return ;
            }
        }
	}
}
