/**
 The program must accept N unique digits and an integer X as the input. The program must print the
smallest palindromic integer, which is formed from the given N digits and is greater than X.
Note: At least one non-zero digit is always present in the given N digits.
Boundary Condition(s):
1 <= N <= 10
1 <= X <= 10^8
Input Format:
The first line contains N.
The second line contains N digits separated by a space.
The third line contains X.
Output Format:
The first line contains the smallest palindromic integer, which is formed from the given N digits and is
greater than X.
Example Input/Output 1:
Input:
3
2 4 0
567
Output:
2002
Explanation:
The smallest palindromic integer is 2002, which is formed from the given 3 digits and is greater
than 567.
Hence the output is 2002
Example Input/Output 2:
Input:
4
1 2 3 4
12545
Output:
13131

 */
import java.util.*;
public class SmallestPalendromicInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        Integer arr[] = new Integer[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int X = sc.nextInt();
        main: while(true){
            String s = String.valueOf(++X);
            for(int i=0;i<=9;i++){
                if(!Arrays.asList(arr).contains(i)&&s.contains(i+"")){
                    continue main;
                }
            }
            if(new StringBuilder(s).reverse().toString().equals(s)){
                System.out.println();
                System.out.println(s);
                break;
            }
        }
	}
}
