/*
Next Greater - No Consecutive 1s

The program must accept an integer N as the input. The program must print the next greater integer of N having no consecutive 1s in its binary representation. If there are no consecutive 1s in the binary representation of N, the program must print the integer N as the output.
Boundary Condition(s):
2 <= N <= 10^8
Input Format:
The first line contains N.
Output Format:
The first line contains N or the next greater integer of N having no consecutive 1s in its binary representation.
Example Input/Output 1:
Proceed to Solve the Program
Input:
6
Output:
8
Explanation:
Here N = 6.
The binary representation of 6 is 110 (2 consecutive 1s).
The binary representation of 7 is 111 (3 consecutive 1s).
The binary representation of 8 is 1000 (NO consecutive 1s). So 8 is printed as the output.
Example Input/Output 2:
Input:
9
Output:
9
 */

import java.util.Scanner;

public class Day29 {
	public static void main(String[] args) { // Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		while (true) {
			if (check(N)) {
				System.out.print(N);
				break;

			}

			N++;

		}
	}

	public static boolean check(int N) {
		char s[] = Integer.toBinaryString(N).toCharArray();
		for (int i = 0; i < s.length - 1; i++) {
			if (s[i] == '1' && s[i + 1] == '1') {
				return false;
			}
		}
		return true;
	}
}
