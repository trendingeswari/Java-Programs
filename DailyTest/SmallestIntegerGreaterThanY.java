/*
 The program must accept two integers X and Y as the input. The program must form the smallest
possible integer N based on the following conditions.
- The integer N must be formed using all the digits of X.
- The value of N must be greater than Y.
Finally, the program must print the value of N as the output. If it is not possible to form such an
integer then the program must print -1 as the output.
Boundary Condition(s):
1 <= X, Y <= 10^7
Input Format:
The first line contains X and Y separated by a space.
Output Format:
The first line contains N or -1.
Example Input/Output 1:
Input:
459 500
Output:
549
Explanation:
All the possible integers that can be formed using the digits of 459 are 459, 495, 549, 594, 945 and
954.
Here 549 is the smallest possible integer which is greater than 500.
Hence the output is 549
Example Input/Output 2:
Input:
456 660
Output:
-1
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SmallestIntegerGreaterThanY {
    static void permut(String a, String k, ArrayList<String> l) {
        if (a.length() == 0) {
            l.add(k);
            return;
        }
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            String d = a.substring(0, i) + a.substring(i + 1);
            permut(d, k + ch, l);
        }
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt(), m = -1;
        sc.close();
        ArrayList<String> l = new ArrayList<>();
        permut(a, "", l);
        for (int i = 0; i < l.size(); i++) {
            // System.out.println(l.get(i));
            int t = Integer.parseInt(l.get(i));
            if (t > b && (t < m || m == -1)) {
                m = t;
            }
        }
        System.out.print(m);
    }
}
