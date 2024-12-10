/*
 The program must accept an integer N as the input. The program must find the number of 1's in the
binary representation of N. Then the program must print the next greater integer of N having the
same number of 1's in the binary representation.
Boundary Condition(s):
1 <= N <= 10^5
Input Format:
The first line contains N.
Output Format:
The first line contains an integer.
Example Input/Output 1:
Input:
6
Output:
9
Explanation:
The binary representation of 6 is 110. The count 1's in 110 is 2.
So the next greater integer with two 1's in the binary representation is 9. The binary representation of
9 is 1001.
Example Input/Output 2:
Input:
13
Output:
14
Example Input/Output 3:
Input:
15
Output:
23
 */
import java.util.*;
public class NextGreater_1_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[1001],ind=0,num=n,count=0;
		sc.close();
        while(num>0)
        {
            if(num%2==1)
            {
                count++;
            }
            a[ind++]=num%2;
            num/=2;
        }
        for(int i=n+1;;i++)
        {
            if(binary(i,count))
            {
                System.out.print(i);
                return;
            }
        }
	}
	public static boolean binary(int num,int count)
	{
	    int a[]=new int [1001],ind=0,val=0,number=num;
	    while(num>0)
	    {
	        if(num%2==1)
	        {
	            val++;
	        }
	        a[ind++]=num%2;
	        num/=2;
	    }
	    if(val==count)
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}
}
