/*
 Nth Character - Binary String

 The program must accept a string S and two integers R, N as the input. The string S always
contains 0s and 1s. The program must expand the string S based on the first R characters.
- If the character is 0, the program must insert 1 after 0 (0 -> 01).
- If the character is 1, the program must insert 0 after 1 (1 -> 10).
Finally, the program must print the Nth
character in the modified string S.
Note: At least N characters are always present in the modified string S.
Boundary Condition(s):
1 <= R <= Length of S <= 100
1 <= N <= 200
Input Format:
The first line contains S.
The second line contains R and N separated by a space.
Output Format:
The first line contains the Nth character in the modified string S.
Example Input/Output 1:
Input:
101
2 3
Output:
0
Explanation:
Here R = 2 and N = 3.
The first character is 1, so 0 is inserted after 1.
The second character is 0, so 1 is inserted after 0.
Now the string becomes 10011.
The 3rd
character in the above string is 0, which is printed as the output.
Example Input/Output 2:
Input:
11
1 3
Output:
1
Example Input/Output 3:
Input:
11011
5 10
Output:
0

 */

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char c[]=sc.nextLine().toCharArray();
        int R=sc.nextInt(),N=sc.nextInt(),arr[]=new int [201],ind=0;
        sc.close();
        for(int i=0,j=1;j<=R;i++,j++)
        {
            arr[ind]=c[i]-'0';
            if(arr[ind]==0)
            {
                arr[++ind]=1;
            }
            else{
                arr[++ind]=0;
            }
            ind++;
        }
        for(int i=R-1;i<c.length;i++)
        {
            arr[ind++]=c[i]-'0';
        }
        System.out.print(arr[N-1]);
	}
}
