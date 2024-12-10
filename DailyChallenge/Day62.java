/*
 
String - Circularly Reverse Order

The program must accept a string S and an integer N as the input. The program must print the characters present at the positions of multiples of N in circularly reverse order. Once a character is printed, the program must remove that character from the string. If the multiple of N goes beyond the first character, then the characters must be navigated in a cyclic manner till all the characters are printed.
Boundary Condition(s):
1 <= N, Length of S <= 1000
Input Format:
The first line contains S.
The second line contains N.
Output Format:
The first line contains all the characters of S as per the given conditions.

Example Input/Output 1:
Input:
apple
4
Output: 
ppale
Explanation:
The given string is apple and the value of N is 4.
The multiples of 4 are 4, 8, 12, 16, 20, 24 and so on.
While traversing the string apple in circularly reverse order, the 4th character is
So the character p is printed and removed from the string apple. Now the string becomes aple.
Then the 8th character in circularly reverse order is p.
So the character p is printed and removed from the string aple. Now the string becomes ale. Then the 12th character in circularly reverse order is a.
So the character a is printed and removed from the string ale. Now the string becomes le. Then the 16th character in circularly reverse order is.
So the character I is printed and removed from the string le. Now the string becomes e. Finally, the remaining character e is printed and it is removed from the string.
Hence the output is ppale.
Example Input/Output 2:
Input:
Xyz#12345
5
Output: 
15z23#X4y
 */

import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
		Scanner dc = new Scanner(System.in);
		String k = dc.next();
		int a = dc.nextInt();
		int y1 = a;
		dc.close();
		//int o = 0;
		int u = 1;
		int i = k.length()-1;
		while(k.length()>=1){
		   // u=1;
		   // int i = k.length()-1;
		    while(u<=y1){
		        if(u==y1) {
		            System.out.print(k.charAt(i)+"");
		            break;
		        }
		        
		        i-=1;
		        if(i==-1) i = k.length()-1;
		        
		        u+=1;
		    }
		    
		    k = k.substring(0,i)+k.substring(i+1,k.length());
		    //System.out.println(k+" ");
		    y1+=a;
		    //o+=1;
		}

	}
}
