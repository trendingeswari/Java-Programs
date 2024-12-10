
import java.util.*;
public class NewCalculator {
    public static void main(String args[])
    {
        Calculator obj=new Calculator();
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        sc.close();
        System.out.print(obj.add(a,b)+" "+obj.sub(a,b)+" "+obj.mul(a,b)+" "+obj.div(a,b));
    }
}
