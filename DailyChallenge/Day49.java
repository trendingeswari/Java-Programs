/*
 
Reverse Alphabetical Order - Diagonals

The program must accept a character matrix of size RxC containing only lower case alphabets as the input. The program must print YES if the alphabets in all the bottom-left to top-right diagonals are arranged in reverse alphabetical order. Else the program must print NO as the output.
Boundary Condition(s):
2 <= R, C <= 100
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C alphabets separated by a space.
Output Format:
The first line contains YES or NO.

Example Input/Output 1:
Input:
66
mfxkbo
fyldrp
zmftph
nhupdl
juphmw
vpjmvu
Output:
NO
Explanation:
There are 2 bottom-left to top-right diagonals where the alphabets are not arranged in reverse alphabetical order.
mfxkbo
fyldrp
zmftph
nhupdl
juphmw
vpjmvu
So NO is printed as the output.
Example Input/Output 2:
Input:
34
aspu tqvb
zx bi
Output: 
YES
 */
import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        sc.close();
        char m []=new char[a+b];
        for(int i=0;i<a+b;i++)
            m[i]='a';
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                char t=sc.next().charAt(0);
                if(t<m[i+j]){
                    System.out.print("NO");return;}
                else
                    m[i+j]=t;
            }
        }
        System.out.print("YES");
	}
}
