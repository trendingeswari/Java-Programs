
import java.util.*;
public class Ass1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n=sc.nextInt();
        //System.out.println();
        System.out.println("Output:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"X"+n+"="+i*n);
        }
    }
}
