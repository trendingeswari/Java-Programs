/*
LCM of Even Integer

The program must accept N integers as the input. The program must print the LCM of all the even
integers among the N integers as the output.
Note: At least two even integers are always present among the N integers.
Boundary Condition(s):
2 <= N <= 10
1 <= Each integer value <= 100
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains the LCM of all the even integers among the N integers.
Example Input/Output 1:
Input:
5
2 5 3 6 4
Output:
12
Explanation:
The even integers among the 5 integers are 2, 6 and 4.
The LCM of 2, 6 and 4 is 12.
So 12 is printed as the output.
Example Input/Output 2:
Input:
5
10 21 14 89 2
Output:
70
 */

 import java.util.Scanner;

 public class Day9 {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i = 1;
		long x = sc.nextLong();
		
		while(x%2 != 0)
		{
		    i++;
		    x = sc.nextInt();
		}
		
		long lcm = x;
		
		while(i < n)
		{
		    x = sc.nextLong();
		    if(x%2 == 0)
		    {
		        long max, min;
		        if(lcm > x)
		        {
		            max = lcm;
		            min = x;
		        }
		        else
		        {
		            min = lcm;
		            max = x;
		        }
		        lcm = (max*min)/gcd(max, min);
		    }
		    i++;
		}
		
		System.out.println(lcm);
        sc.close();
		
	}
	public static long gcd(long a, long b)
	{
	    if(b == 0)
	    return a;
	    else
	    return gcd(b, a%b);
	}
 }
 
