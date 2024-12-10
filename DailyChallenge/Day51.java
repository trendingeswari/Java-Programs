/*

 */ 
public class Day51 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc =new Scanner(System.in);
        long N=sc.nextLong(),count=0,num=1;
        boolean run=true;
        sc.close();
        while(run)
        {
            long n=num,ncount=0;
            while(n>0)
            {
                if((n%2)==1)
                {
                    ncount++;
                }
                n/=2;
            }
            if(ncount==2)
            {
                count++;
            }
            if(count==N)
            {
                System.out.println(num);
                run=false;
            }
            num++;
        }
	}
}
