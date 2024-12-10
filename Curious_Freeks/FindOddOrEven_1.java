import java.util.*;
public class FindOddOrEven_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.print((n%2==0)?n+" is even":n+" is odd");
    }
}
