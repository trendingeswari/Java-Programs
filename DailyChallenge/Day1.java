/*
 String Stairs Pattern
 The program must accept a string S containing only alphabets as the input. The program must print
the string S for (L*2)-1 times (where L is the length of the string S) based on the following conditions.
- In line 1, the program must print L-1 hyphens and the first alphabet in S.
- In line 2, the program must print L-2 hyphens and the first two alphabets in S.
- Similarly, the program prints the first L lines as the output.
- In line L+1, the program must print the string S except the first alphabet.
- In line L+2, the program must print the string S except the first two alphabets.
- Similarly, the program prints the remaining lines as the output.
Boundary Condition(s):
3 <= Length of S <= 100
Input Format:
The first line contains S.
Output Format:
The first (L*2)-1 lines containing the string values based on the given conditions.
Example Input/Output 1:
Input:
receiving
Output:
--------r
-------re
------rec
-----rece
----recei
---receiv
--receivi
-receivin
receiving
eceiving
ceiving
eiving
iving
ving
ing
ng
g
Explanation:
The length of the given string receiving is 9. So the pattern contains (9*2)-1 lines.
In line 1, 8 hyphens and the first alphabet in S are printed.
In line 2, 7 hyphens and the first two alphabets in S are printed.
In line 3, 6 hyphens and the first three alphabets in S are printed.
Similarly, the first 9 lines are printed
--------r
-------re
------rec
-----rece
----recei
---receiv
--receivi
-receivin
receiving
In line 10, the string S is printed except the first alphabet.
In line 11, the string S is printed except the first two alphabets.
In line 12, the string S is printed except the first three alphabets.
Similarly, the remaining lines are printed.
eceiving
ceiving
eiving
iving
ving
ing
ng
g
Example Input/Output 2:
Input:
ZERO
Output:
---Z
--ZE
-ZER
ZERO
ERO
RO
O
Example Input/Output 3:
Input:
KeyBoard
Output:
-------K
------Ke
-----Key
----KeyB
---KeyBo
--KeyBoa
-KeyBoar
KeyBoard
eyBoard
yBoard
Board
oard
ard
rd
d

 */

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char s[]=sc.nextLine().toCharArray();
        int L=s.length,len=1;
        sc.close();
        for(int i=0;i<(L*2)-1;i++)
        {
            if(i<L)
            {
                for(int j=0;j<L-1-i;j++)
                {
                    System.out.print("-");
                }
                for(int j=0;j<i+1;j++)
                {
                    System.out.print(s[j]);
                }
                System.out.println();
            }
            else
            {
                for(int j=len;j<L;j++)
                {
                    System.out.print(s[j]);
                }
                len++;
                System.out.println();
            }
        }
	}
}
