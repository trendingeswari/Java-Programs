import java.util.Scanner;

public class DifficultDCPattern {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int v = str.length()-2;
        s.close();
		if(str.length()%2 == 1)
		    str += "*";
		char[] arr = str.toCharArray();
		for(int i=0;i<v;i++)
		{
		    boolean invert = true;
		    for(int j=0;j<arr.length;j+=2)
		    {
		        if(invert)
		        {
		            for(int k=v;k>i;k--)
		            {
		                System.out.print(arr[j]);
		            }
		            for(int k=0;k<=i;k++)
		            {
		                System.out.print(arr[j+1]);
		            }
		        }
		        else
		        {
		            for(int k=0;k<=i;k++)
		            {
		                System.out.print(arr[j]);
		            }
		            for(int k=v;k>i;k--)
		            {
		                System.out.print(arr[j+1]);
		            }
		        }
		       invert = !invert;
		    }
		    System.out.println();
		}
	}
}

