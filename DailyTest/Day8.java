/*
 Form Z - Adding Two Integers

 The program must accept three integers X, Y and Z as the input. The program must print YES if Z can
be formed by the sum of integers using X and Y. Else the program must print NO as the output.
Boundary Condition(s):
1 <= X, Y, Z <= 1000
Input Format:
The first line contains X, Y and Z separated by a space.
Output Format:
The first line contains YES or NO.
Example Input/Output 1:
Input:
3 5 22
Output:
YES
Explanation:
Here X = 3, Y = 5 and Z = 22.
The integer 22 is formed by the sum of 3, 3, 3, 3, 5 and 5.
So YES is printed as the output.
Example Input/Output 2:
Input:
11 7 23
Output:
NO
Example Input/Output 3:
Input:
11 13 76
Output:
YES
 */

import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int k=0;
		sc.close();
		for (int i=1;i*a<=c || i*b<=c ;i++){
		    int t=c-a*i;
		    int t1=c-b*i;
		   // System.out.print(t1+","+ t +" "+ t1%a+" "+t%b+"\n");
		    if ((t1%a==0) || (t%b==0)){
		        System.out.print("YES");
		        k++;
		        break;
		    }
		}
		if (k==0) System.out.print("NO");

	}
}
