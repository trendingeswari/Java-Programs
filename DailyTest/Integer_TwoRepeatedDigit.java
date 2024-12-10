/*
 The program must accept two integers X and Y as the input. The program must print the integers from
X to Y having at least two repeated digits. If there is no such integer, the program must print -1 as the
output.
Boundary Condition(s):
10^3 <= X < Y <= 10^8
Input Format:
The first line contains X and Y separated by a space.
Output Format:
The first line contains the integers from X to Y having at least two repeated digits or -1.
Example Input/Output 1:
Input:
1000 1025
Output:
1001 1010
Explanation:
The integers from 1000 to 1025 having at least two repeated digits are 1001 and 1010.
So the integers 1001 and 1010 are printed as the output.
Example Input/Output 2:
Input:
2502 2524
Output:
-1
Example Input/Output 3:
Input:
97887 97910
Output:
97887 97889 97897 97898 97900 97907
 */
import java.util.*;
public class Integer_TwoRepeatedDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        sc.close();
        int arr[] = new int[10], t = 0, k = 0, c = 0;
        for (int i = m; i <= n; i++) {
            arr = new int[10];
            t = i;
            while (t > 0) {
                arr[t % 10]++;
                t /= 10;
            }
            for (int j = 0; j < 10; j++) {
                if (arr[j] > 1)
                    k++;
            }
            if (k > 1) {
                System.out.print(i + " ");
                c++;
            }
            k = 0;
        }
        if (c == 0)
            System.out.print(-1);
        }
}
