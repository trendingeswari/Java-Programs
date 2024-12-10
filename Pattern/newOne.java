import Java.OOPS.Calculator;
import java.util.*;
public class newOne {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(obj.add(n,n));
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
