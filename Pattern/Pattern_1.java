
import java.util.*;
public class Pattern_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ch=sc.nextInt();
        sc.close();
        switch(ch)
        {
            case 1:
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i=0;i<n;i++)
                {
                    for(int j=n-1;j>=i;j--)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                int start=n-2;
                for(int i=0;i<())
        }
    }
}
