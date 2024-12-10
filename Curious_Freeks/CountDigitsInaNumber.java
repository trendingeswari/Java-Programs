import java.util.*;
public class CountDigitsInaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt(),val=n,count=0;
        while(n>0)
        {
            int num=n%10;
            if(val%num==0)
            {
                count++;
            }
            n/=10;
        }
        System.out.print(count);
    }
}
