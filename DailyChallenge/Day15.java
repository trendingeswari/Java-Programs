/*
 

The program must accept two integers X and Y as the input. The program must print the integers from
X to Y having at least one zero as the output. If there is no such integer, the program must print -1 as
the output.
Boundary Condition(s):
1 <= X < Y <= 10^6
Input Format:
The first line contains X and Y separated by a space.
Output Format:
The first line contains the integers from X to Y having at least one zero separated by a space or -1.
Example Input/Output 1:
Input:
98 125
Output:
100 101 102 103 104 105 106 107 108 109 110 120
Explanation:
Here X = 98 and Y = 125.
The integers from 98 to 125 having at least one zero are 100 101 102 103 104 105 106 107 108 109
110 120.
Hence the output is
100 101 102 103 104 105 106 107 108 109 110 120
Example Input/Output 2:
Input:
1351 1358
Output:
-1
 */

import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int X=sc.nextInt(),Y=sc.nextInt();
        boolean present=true;
        sc.close();
        for(int i=X;i<=Y;i++)
        {
            int num=i;
            boolean flag=false;
            while(num>0)
            {
                if(num%10==0)
                {
                    flag=true;
                }
                num/=10;
            }
            if(flag)
            {
                present=false;
                System.out.print(i+" ");
            }
        }
        if(present)
        {
            System.out.print("-1");
        }
	}
}
