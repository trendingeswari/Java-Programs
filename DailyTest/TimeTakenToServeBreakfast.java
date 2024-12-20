/*
 In a hotel, there are 26 rooms. The name of each room is denoted by an alphabet. The order of the
room names S (containing only alphabets) is passed as the input. And X rooms have order breakfast.
The names of the X rooms are also passed as the input to the program. Initially, the server will start
from the first room, to travel from one room to the successive room it takes 1min. The program must
print the total time he takes to serve the breakfast to all the rooms as the output.
Note:
- The string S always contains non repeated alphabets.
- The length of S is always 26.
- The alphabets in S are case sensitive (i.e., a and A represent different rooms).
Boundary Conditions(s):
1 <= X <= 26
Input Format:
The first line contains S.
The second contains X alphabets representing the rooms ordered for breakfast.
Output Format:
The first line contains the total time the server takes to serve the breakfast to all the rooms.
Example Input/Output 1:
Input:
abcdefghijklmnopqrstuvwxyz
dab
Output:
7
Explanation:
The order of 26 rooms is abcdefghijklmnopqrstuvwxyz.
The rooms that have ordered breakfast are d, a and b.
The first room to serve breakfast is room d. For the server, it will take 3mins to travel from the room a
to the room d (abcdefghijklmnopqrstuvwxyz).
The second room to serve breakfast is room a. For the server, it will take 3mins to travel from the
room d to the room a (abcdefghijklmnopqrstuvwxyz).
The third room to serve breakfast is room b. For the server, it will take 1min to travel from the room a
to the room b (abcdefghijklmnopqrstuvwxyz).
So the total time taken to serve breakfast to all the rooms is 7 (3+3+1).
Hence the output is 7
Example Input/Output 2:
Input:
MNBVCXZASDFGHJKLPOIUYTREWQ
ALPA
Output:
25
Example Input/Output 3:
Input:
aAbBcCdDeEfFgGhHiIjJkKlLmM
efgEFG
Output:
19

 */

import java.util.Scanner;

public class TimeTakenToServeBreakfast {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        
        char S[]=sc.nextLine().toCharArray(),X[]=sc.nextLine().toCharArray();
        int count=0,index=0;
        sc.close();
        
        for(int i=0;i<X.length;i++)
        {
            for(int j=0;j<S.length;j++)
            {
                if(X[i]==S[j])
                {
                    if(i==0)
                    {
                        index=j;
                        count+=j;
                    }
                    else
                    {
                        if(index>j)
                        {
                            count+=(index-j);
                        }
                        else if(index<j)
                        {
                            count+=(j-index);
                        }
                        index=j;
                    }
                }
            }
        }
        
        System.out.print(count);
	}
}
