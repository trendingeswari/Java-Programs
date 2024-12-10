/*
 The program must accept a string S as the input. The program must print yes if S is a valid
hexadecimal representation of a number. Else the program must print no as the output.
Boundary Condition(s):
1 <= Length of S <= 20
Input Format:
The first line contains S.
Output Format:
The first line contains either yes or no.
Example Input/Output 1:
Input:
7cD
Output:
yes
Explanation:
The decimal equivalent of 7cD is 1997.
Here 7cD is a valid hexadecimal representation, so yes is printed as the output.
Example Input/Output 2:
Input:
12h
Output:
no

 */

import java.util.Scanner;

public class CheckValidHexadecimalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        sc.close();
        if(str.matches("[0-9a-fA-F]+")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
	}
}
