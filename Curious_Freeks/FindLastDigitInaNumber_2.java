import java.util.*;
public class FindLastDigitInaNumber_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        double num=Math.pow(a,b);
        int n=(int)num;
        System.out.print(n%10);
    }
}
