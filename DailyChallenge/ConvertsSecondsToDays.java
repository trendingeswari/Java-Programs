/*
 The program must accept an integer S denoting seconds and convert it into days, hours, minutes and seconds as shown in the Example Input/Output section. 
 Boundary Condition(s): 1 <= S <= 10^8 
 Input Format: The first line contains S. 
 Output Format: The first line contains the days, hours, minutes and seconds as shown in the Example Input/Output section. 
 Example Input/Output 1: 
 Input: 
 164 
 Output: 
 0D 00:02:44 
 Explanation: 164 seconds equal to 0 day, 0 hour, 2 minutes and 44 seconds. Hence the output is 0D 00:02:44 
 Example Input/Output 2: 
 Input: 
 96408 
 Output: 
 1D 02:46:48

 formula:
 Number of days=n/(24*3600)
 Number of hours=(n%(24*3600))/3600
 Number of minutes=(n%(24*3600*3600))/60
 Number of seconds=(n%(24*3600*3600*60))/60
 */

import java.util.Scanner;

public class ConvertsSecondsToDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int d=n/(24*3600);n%=(24*3600);int h=n/3600;n%=3600;int m=n/60;n%=60;int s=n;
        System.out.print(d+"D"+" ");
        System.out.print((h<10)?"0"+h+":":h+":");
        System.out.print((m<10)?"0"+m+":":m+":");
        System.out.print((s<10)?"0"+s:s);
	}
}
