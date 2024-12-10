/*
Replace Border with String
The program must accept a character matrix of size RxC and a string S as the input. The program must replace the characters in the border of the matrix with the characters in the string S in the clockwise direction. Then the program must print the modified matrix as the output.
Boundary Condition(s):
2 <= R, C <= 50
1 <= Length of S <= 2* (R+C-2)
Input Format:
The first line contains R and C separated
by a space.
The next R lines, each contains C
characters separated by a space.
The (R+2)nd line contains S.
Output Format:
The first R lines, each contains C characters representing the modified matrix.

Example Input/Output 1: Input:
4 5
@ b c d E
e f 5 h i
b c d e q
k 9 0 1 2
queenbee
Output:
q u e e n
e f 5 h b
b c d e e
k 9 o l e
Explanation:
The characters in the border of the matrix are highlighted below.
@bcd E
ef 5 hi
bcdeq
k9 012
So the characters in the border are
replaced with the characters in the given string in the clockwise direction.
Here the length of the string (8) is less than the number of characters in the borders (14). So the last 6 characters in the border of the matrix remain unchanged.
Hence the output is
queen
ef5hb
bc dee
k9ole
Example Input/Output 2: Input:
3 3
A b c 
d * f
g h i
d@$zling
Output: 
d @ $
g * z 
n i l
 */
import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		char ch[][]=new char[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        ch[i][j]=sc.next().charAt(0);
		    }
		}
		String s=sc.next();
		int t=0;
		int l=0;
		int ri=c-1;
		int b=r-1;
		int k=0;
        sc.close();
		while(t<=b && l<=ri){
		    for(int i=l;i<=ri && k<s.length();i++){
		        ch[t][i]=s.charAt(k++);
		    }
		    t++;
		    for(int i=t;i<=b && k<s.length();i++){
		        ch[i][ri]=s.charAt(k++);
		    }
		    ri--;
		    if(t<=b){
		        for(int i=ri;i>=l && k<s.length();i--){
		            ch[b][i]=s.charAt(k++);
		        }
		    }
		    b--;
		    if(l<=r){
		        for(int i=b;i>=t && k<s.length();i--){
		            ch[i][l]=s.charAt(k++);
		        }
		    }
		    l++;
		}
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(ch[i][j]+" ");
		    }
		    System.out.println();
		}

	}
}
