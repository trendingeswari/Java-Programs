/*
 Maximum coins seven days
The 7 days in a week from Sunday to Saturday are numbered from 1 to 7. On Sunday and Saturday, a
magical pot will double the gold coins put in it. On remaining days, the magical pot will just increase
the coins by 5. The program must accept two integers N and D representing the number of gold coins
in the pot and the starting day respectively. The program must print the maximum coins M that can be
obtained using the magical pot for seven days continuously.
Boundary Condition(s):
1 <= N <= 100
1 <= D <= 7
Input Format:
The first line contains N and D separated by a space.
Output Format:
The first line contains M.
Example Input/Output 1:
Input:
1 7
Output:
29
Explanation:
Initially, the number of gold coins in the pot is 1 and the starting day is 7(Saturday).
On day 7, the magical pot doubles the gold coins as it is Saturday. So the number of gold coins in the
pot becomes 2 (1*2 = 2).
On day 1, the magical pot doubles the gold coins as it is Sunday. So the number of gold coins in the
pot becomes 4 (2*2 = 4).
On day 2, the magical pot just increases the gold coins by 5 as it is Monday. So the number of gold
coins in the pot becomes 9 (4+5 = 9).
Similarly, on day 3, the number of gold coins in the pot becomes 14 (9+5=14).
On day 4, the number of gold coins in the pot becomes 19 (14+5 = 19).
On day 5, the number of gold coins in the pot becomes 24 (19+5 = 24).
On day 6, the number of gold coins in the pot becomes 29 (24+5 = 29).
Hence the output is 29
Example Input/Output 2:
Input:
50 2
Output:
300
 */

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int coin=sc.nextInt(),day=sc.nextInt();
        sc.close();
        for(int i=1;i<=7;i++)
        {
            if(day==1|| day==7)
            {
                coin*=2;
            }
            else if(day!=7)
            {
                coin+=5;
            }
            if(day!=7)
            {
                day++;
            }
            else
            {
                day=1;
            }
        }
        System.out.print(coin);
	}
}
