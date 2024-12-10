import java.util.Scanner;

public class Day74 {
     /*public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        long N=sc.nextLong(),arr[]=new long[100001],ind=0,count=0;
        boolean flag=false;
        for(long i=1;;i++)
        {
            long num=(long)Math.pow(2,i);
            for(long j=0;j<num;j++)
            {
                count++;
                arr[(int)ind++]=j;
                if(count==N)
                {
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                break;
            }
        }
        System.out.print(arr[(int)ind-1]);
	}*/
    public static void main(String[] args) 
    {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		long n= sc.nextLong();
		sc.close();
		long length =0;
		int k=1;
		while(true)
		{
		    long currentlength = (1L << k);
		    if(currentlength <= 0 || currentlength + length >= n)
		    {
		        break;
		    }
		       
		    length += currentlength;
	     	k++;
		}
	     	long index = n-length-1;
	     	System.out.print(index);

    }
}
