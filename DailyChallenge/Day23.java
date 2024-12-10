/*
Difference - Two Time Period

The program must accept the entry time and the exit time of an employee as the input. The time will
be in 24-hour format HH:MM:SS. The program must print the difference D (in 24-hour format)
between the entry time and the exit time as the output.
Input Format:
The first line contains the entry time.
The second line contains the exit time.
Output Format:
The first line contains D.
Example Input/Output 1:
Input:
08:12:15
12:34:55
Output:
04:22:40
Explanation:
The entry time of the employee is 08:12:15.
The exit time of the employee is 12:34:55.
The difference between the entry time and the exit time is 04:22:40.
So 04:22:40 is printed as the output.
Example Input/Output 2:
Input:
09:30:55
11:12:15
Output:
01:41:20
 */

import java.util.Scanner;

public class Day23 {
     public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String start[]=sc.nextLine().trim().split(":"),end[]=sc.nextLine().trim().split(":");
        sc.close();
        int s = (Integer.parseInt(start[0])*3600)+(Integer.parseInt(start[1])*60)+(Integer.parseInt(start[2])),e=(Integer.parseInt(end[0])*3600)+(Integer.parseInt(end[1])*60)+(Integer.parseInt(end[2])),diff = e-s,hour=(diff/3600),min=(diff%3600)/60,sec=(diff%3600)%60;
        System.out.println();
        System.out.printf("%02d:%02d:%02d",hour,min,sec);
	}
}
