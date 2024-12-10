/*
 Digits-divisible by same

The program must accept N integers as the input. The program must print the integers among the
given N integers based on the following condition.
- If the concatenation of the first two digits and the concatenation of the last two digits of an
integer X are divisible by an integer other than 1, the program must print the integer X. 
If there is no such integer, the program must print -1 as the output.
Boundary Condition(s):
1 <= N <= 100
10^3 <= Each integer value <= 10^8
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains the integer value(s) or -1 based on the given conditions.
Example Input/Output 1:
Input:
4
7735 90281 273117 45705
Output:
7735 90281 45705
Explanation:
In the integer 7735, the concatenation of the first two digits is 77 and the concatenation of the last
two digits is 35. Here both 77 and 35 are divisible by 7. So 7735 is printed.
In the integer 90281, the concatenation of the first two digits is 90 and the concatenation of the last
two digits is 81. Here both 90 and 81 are divisible by 3 or 9. So 90281 is printed.
In the integer 273117, the concatenation of the first two digits is 27 and the concatenation of the last
two digits is 17. Here both 27 and 17 are not divisible by any integer other than 1. So 273117 is NOT
printed.
In the integer 45705, the concatenation of the first two digits is 45 and the concatenation of the last
two digits is 5. Here both 45 and 5 are divisible by 5. So 45705 is printed.
Example Input/Output 2:
Input:
7
5671 62743 3323 45832 6685 2479 5917
Output:
-1
Example Input/Output 3:
Input:
3
5313 9922 12300
Output:
9922 12300
 */

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),arr[]=new int[N];
        boolean flag=true;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            int num=arr[i],val=num%100;
            while(num>=100)
            {
                num/=10;
            }
            int min=num<val?num:val;
            if(min==0)
            {
                min=num>val?num:val;
            }
            for(int j=2;j<=min;j++)
            {
                if(num%j==0 && val%j==0)
                {
                    flag=false;
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
        sc.close();
        if(flag)
        {
            System.out.print("-1");
        }
	}
}
