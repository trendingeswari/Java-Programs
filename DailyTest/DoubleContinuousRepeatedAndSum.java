/*
 The program must accept a list of integers as the input. The program must modify the list of integers
based on the following condition.
- If an integer X is repeated continuously (i.e., occurring two or more times) then the program must
replace each repeated integer with double the value of its previous integer (except the first integer).
Finally, the program must print the sum of integers in the modified list as the output.
Boundary Condition(s):
1 <= Each integer value <= 10^8
Input Format:
The first line contains the list of integers separated by a space.
Output Format:
The first line contains the sum of integers in the modified list.
Example Input/Output 1:
Input:
3 2 2 2 4
Output:
21
Explanation:
The given integers are 3 2 2 2 4.
Here the integer 2 is repeated continuously.
The first occurring 2 never changes.
The second occurring 2 is replaced with 4 (2 * 2).
The third occurring 2 is replaced with 8 (4 * 2).
The sum of integers in the modified list is 21 (3 + 2 + 4 + 8 + 4).
So 21 is printed as the output.
Example Input/Output 2:
Input:
3 3 3 2 4 4 9
Output:
44
Example Input/Output 3:
Input:
10 5 10 1 2 5 1
Output:
34

 */

import java.util.Scanner;

public class DoubleContinuousRepeatedAndSum {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String S[]=sc.nextLine().split("\\s+");
        int len=S.length,arr[]=new int[len],sum=0,dup[]=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=Integer.parseInt(S[i]);
            dup[i]=arr[i];
        }
        sc.close();
        int val=-1;
        for(int i=0;i<len;i++)
        {
            if(i!=0)
            {
                if(dup[i-1]==dup[i])
                {
                    val=arr[i-1]*2;
                    arr[i]=val;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
	}
}
