/*
L shaped Palindromic Matrix

The program must accept a character matrix of size NxN containing only alphabets as the input. The
program must print the palindromic string values formed by concatenating the alphabets in the Lshaped layers of the matrix as the output.
Note: The palindromic string values are case sensitive.
Boundary Condition(s):
2 <= N <= 50
Input Format:
The first line contains N.
The next N lines, each contains N alphabets separated by a space.
Output Format:
The lines containing the palindromic string values.
Example Input/Output 1:
Input:
5
m R m B a
a a A o B
l C d A M
A E C a R
Y A l a m
Output:
malAYAlam
RaCECaR
BoB
a
Explanation:
The string values formed by concatenating the characters in the L-shaped layers of the matrix are
given below.
malAYAlam
RaCECaR
mAdAM
BoB
a
The palindromic string values in the above string values are
malAYAlam
RaCECaR
BoB
a
Example Input/Output 2:
Input:
6
d E s R T X
e V E a i T
t I v d a r
a T E n E s
r A T I V E
t r a t e d
Output:
detartrated
EVITATIVE
TiT
X
Example Input/Output 3:
Input:
4
a F k N
c M m u
Q v M A
d I c a
Output:
N

 */

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();sc.nextLine();
		String[][] mat=new String[n][1];
		for(int i=0;i<n;i++)
		{
		    mat[i]=sc.nextLine().split(" ");
		}
        sc.close();
		for(int i=0;i<n;i++)
		{
		    int st=0,en=n-1,flag=1;
		    while(st<n-i)
		    {
		        if(mat[st][i].equals(mat[n-i-1][en])==false)
		        {
		            flag=0;
		            break;
		        }
		        st++;
		        en--;
		    }
		    if(flag==1)
		    {
		        for(int j=0;j<n-i;j++)
		        {
		            System.out.print(mat[j][i]);
		        }
		        for(int j=i+1;j<n;j++)
		        {
		            System.out.print(mat[n-i-1][j]);
		        }
		        System.out.println();
		    }
		}
	}
}
