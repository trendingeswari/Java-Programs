import java.util.Scanner;

public class FirstNTerms_ProductSeries {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
s.close();
int ctr = 1;
for(int i=1;i<=n;i++)
{
 long p = 1;
 for(int j=0;j<3;j++)
 {
 p*=ctr;
 ctr++;
 }
 System.out.print(p+" ");
}
}
}
