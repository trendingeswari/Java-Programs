/*
 The program must accept a string S and a word W as the input. The program must swap the words
adjacent to the word W. Then the program must print the revised value of the string S as the output. 
Note:
- The comparison is case insensitive.
- Consecutive Ws will not be present in S.
Boundary Condition(s):
3 <= Length of S <= 1000
1 <= Length of W <= 30
Input Format:
The first line contains S.
The second line contains W.
Output Format:
The first line contains the revised string value.
Example Input/Output 1:
Input:
Sync your devices so you can take the benefits of your Firefox Account everywhere you go
you
Output:
Sync your devices can you so take the benefits of your Firefox Account go you everywhere
Explanation:
After swapping the words adjacent to the word you, the string becomes Sync your devices can you
so take the benefits of your Firefox Account go you everywhere.
Hence the output is Sync your devices can you so take the benefits of your Firefox Account go you
everywhere
Example Input/Output 2:
Input:
When the going gets tough the tough get going
going
Output:
When gets going the tough the tough get going
 */

import java.util.Scanner;

public class SwapAdjacentWords {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        String s[]=sc.nextLine().split(" "), w=sc.next(),arr[]=new String [1001];
        int ind=0;
        sc.close();
        System.out.println();
        int val=s.length;
        for(int i=0;i<val;i++)
        {
                if(s[i].equals(w))
                {
                    arr[ind-1]=s[i+1];
                    arr[ind]=s[i];
                    arr[ind+1]=s[i-1];
                    ind++;
                    i++;
                }
                else
                {
                    arr[ind]=s[i];
                }
                ind++;
        }
        for(int i=0;i<ind;i++)
        {
            System.out.print(arr[i]+" ");
        }
	}
}
