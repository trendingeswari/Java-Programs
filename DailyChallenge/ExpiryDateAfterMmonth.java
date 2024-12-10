/*
 The program must accept the date of manufacture D (in the format MM-YYYY) and the validity of a
product in months M as the input. The program must print the expiry date of the product in the same
format MM-YYYY as the output.
Boundary Condition(s):
1 <= M <= 100
Input Format:
The first line contains D.
The second line contains M.
Output Format:
The first line contains the expiry date of the product.
Example Input/Output 1:
Input:
08-2019
18
Output:
02-2021
Explanation:
The date of manufacture is 08-2019.
Here the validity M = 18, so after 18 months the date becomes 02-2021.
Hence the output is 02-2021
Example Input/Output 2:
Input:
01-2013
11
Output:
12-2013

 */

import java.util.Scanner;

public class ExpiryDateAfterMmonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String D[]=sc.nextLine().split("-");
        int M=sc.nextInt();
        int month=Integer.parseInt(D[0]),val=0,count=0,year=Integer.parseInt(D[1]);
        sc.close();
        boolean flag=true;
        if(month==12 && M<=12)
        {
            count++;
        }
        else if(M+month<=12)
        {
            M+=month;
        }
        else if(M>12)
        {
            while(M>12)
            {
                if(flag)
                {
                    val=0;
                    val=12-month;
                    M-=val;
                    flag=false;
                }
                else
                {
                    M-=12;
                }
                count++;
            }
        }
        else
        {
            val=12-month;
            M-=val;
            count++;
        }
        if(M<=9)
        {
            System.out.print("0"+Math.abs(M));
        }
        else
        {
            System.out.print(Math.abs(M));
        }
        System.out.print("-"+(year+count));
	}
}
