import java.util.Scanner;
import java.util.TreeSet;

public class Day69 {
    public static void gnco(char a[],int index,TreeSet<Integer> rset)
    {
        if(index==a.length)
        {
            int k=Integer.parseInt(new String(a));
            if(k%2!=0)
            {
                rset.add(k);
            }
            return;
        }
        for(int i=index;i<a.length;i++)
        {
            swp(a,i,index);
            gnco(a,index+1,rset);
            swp(a,i,index);
        }
    }
    public static void swp(char []a,int i,int j)
    {
        char t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		char a[]=sc.next().toCharArray();
		TreeSet<Integer> rset=new TreeSet<>();
		gnco(a,0,rset);
		for(Integer i:rset)
		{
		    System.out.print(i+" ");
		}
		sc.close();

	}
}
