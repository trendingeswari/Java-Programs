/*
 
Board Game

The program must accept an integer matrix of size RxC representing a board as the input. A player can play on the board with a pawn based on the following conditions.
-Each cell in the board has a value which indicates the number of positions the player can move forward from that cell.
- The player can start from any cell in the last row of the board or matrix. Then the player can move towards up by moving in zig-zag manner (left to right and right to left alternatively). - The player wins when he reaches out from the board.
The program must print the minimum number of moves required to can win the game as the output.
Boundary Condition(s):
2 <= R, C <= 50
1 <= Matrix element value <= 100
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
Output Format:
The first line contains an integer representing the minimum number of moves required to can win the game.

Example Input/Output 1:
Input:
34
2345
7234
5611
Output:
2
Explanation:
Here R = 3 and C = 4.
The four possible ways to win the board game are given below.
5 -> 3 -> 2 -> 4 -> Exit = 4 Moves
6 -> 7 -> Exit = 2 Moves
1 -> 1 -> 4 -> 2 -> 4 -> Exit = 5 Moves
1 -> 4 -> 2 -> 4 -> Exit = 4 Moves
Here the minimum number of moves required to exit from the board is 2. So 2 is printed as the output.

Example Input/Output 2:
Input:
58
19171478
71632937
53812749
94864287
41153578
Output:
5
Explanation:
Here R = 5 and C = 8.
The eight possible ways to win the board game are given below.
4-> 3-> 8-9 -> 7 -> 7 -> 7-> Exit = 7 Moves
1 -> 1-5 -> 7 -> 9 -> 7 -> 7 -> 7 -> Exit = 8 Moves
1 -> 5 -> 7 -> 9 -> 7 -> 7 -> 7 -> Exit = 7 Moves
5 -> 7 -> 9 -> 7 -> 7 -> 7 -> 3-8-9-7-> 7 -> 7 ->
5 -> 2 -> 6 -> 8 -> 9 -> 7 ->
7 -> 8 -> 7 -> 3 -> 7 -> 7 ->
Exit = 6 Moves Exit = 6 Moves Exit = 6 Moves Exit = 6 Moves
8 - 9 -> 7 -> 7 -> 7 -> Exit = 5 Moves
Here the minimum number of moves required to exit from the board is 5. So 5 is printed as the output.

Example Input/Output 3:
Input:
44
1111
1111
1111
1231
Output:
12
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day62 {
    static List<Integer> list=new ArrayList<>();
    public static int getMoves(int in){
        int nom=0,i=in;
        while(i<list.size()){
            i+=list.get(i);
            nom++;
        }
        return nom;
    }
    public static void main(String[] args) {
		//Your Code Here
		int i,j,flag=0,move,min=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] mat=new int[m][n];
		for(i=0;i<m;i++){
		    for(j=0;j<n;j++)
		     mat[i][j]=sc.nextInt();
		}
		for(i=m-1,j=0;;){
		   list.add(mat[i][j]);
		   if(flag==0){
		       j++;
		       if(j>=n){
		           i--;
		           j=n-1;
		           flag=1;
		       }
		  }
		  else if(flag==1){
		      j--;
		      if(j<0){
		          i--;
		          j=0;
		          flag=0;
		      }
		  }
		 if(i<0)
		   break;
		}
		for(i=0;i<n;i++){
		    move=getMoves(i);
		    if(move<min)
		      min=move;
		}
		System.out.println(min);
	}
}
