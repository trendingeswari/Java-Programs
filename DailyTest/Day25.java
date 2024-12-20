/*
 Probability N balls

 The program must accept three integers R, B and N as the input. R represents the number of red balls.
B represents the number of blue balls. The program must print all possible combinations of getting N
balls from the R red balls and the B blue balls as the output.
Note:
- Each possible combination contains the number of red balls followed by the number of blue balls.
- The number of red balls in the possible combinations must be sorted in descending order.
Boundary Condition(s):
1 <= R, B <= 10^5
1 <= N <= R+B
Input Format:
The first line contains R, B and N separated by a space.
Output Format:
The lines contain all the possible combinations of getting N balls from the R red balls and the B blue
balls.
Example Input/Output 1:
Input:
5 4 7
Output:
5 2
4 3
3 4
Explanation:
Here N=7, the all possible combinations of getting 7 balls from the 5 red balls and the 4 blue balls are
given below.
5 2
4 3
3 4
Example Input/Output 2:
Input:
13 10 4
Output:
4 0
3 1
2 2
1 3
0 4

 */

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),B=sc.nextInt(),N=sc.nextInt();
        if(R>N){R=N;}
        sc.close();
        for(int i=R;i>=0;i--)
        {
            if((i+B)<N)
            {
                break;
            }
            for(int j=0;j<=B;j++)
            {
                if((i+j)>N)
                {
                    break;
                }
                else if((i+j)==N)
                {
                    System.out.println(i+" "+j);   
                }
            }
        }
	}
}
