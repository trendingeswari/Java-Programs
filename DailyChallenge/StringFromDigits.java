/*
 The program must accept an integer N and ten alphabets as the input. The program must form a
string S based on the following condition.
- For each digit D in N, the program must replace the digit D by the alphabet at the index D in the
given ten alphabets.
Boundary Condition(s):
1 <= N <= 10^8
Input Format:
The first line contains N.
The second line contains ten alphabets separated by a space.
Output Format:
The first line contains the string S as per the given condition.
Example Input/Output 1:
Input:
1870
a b c d e f g h i j
Output:
biha
Explanation:
The 1
st digit in 1870 is 1, which is replaced by the alphabet at the index 1 (b).
The 2
nd digit in 1870 is 8, which is replaced by the alphabet at the index 8 (i).
The 3
rd digit in 1870 is 7, which is replaced by the alphabet at the index 7 (h).
The 4
th digit in 1870 is 0, which is replaced by the alphabet at the index 0 (a).
Hence the output is biha
Example Input/Output 2:
Input:
15733
r f g i o m m p q r
Output:
fmpii
 */

import java.util.Scanner;

public class StringFromDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),ind=0,array[]=new int[1001],val=0;
        sc.nextLine();
        char s[]=sc.nextLine().toCharArray(),a[]=new char [1001];
        sc.close();
        while(n>0)
        {
            array[val++]=n%10;
            n/=10;
        }
        for(int i=0;i<s.length;i++)
        {
            if(s[i]!=' ')
            {
                a[ind++]=s[i];
            }
        }
        for(int i=val-1;i>=0;i--)
        {
            for(int j=0;j<ind;j++)
            {
                if(array[i]==j)
                {
                    System.out.print(a[j]);
                }
            }
        }
	}
}
