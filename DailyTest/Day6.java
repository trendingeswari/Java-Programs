/*
Employee Break Timing  

The program must accept the N entry time and exit time records of an employee during a day as the
input. N records are given in chronological order. The opening time of the office will be the first entry
time of the employee. The closing time of the office will be the last exit time of the employee. The
program must print the total duration the employee takes the break based on the following format.
X Hours Y Minutes
If X is 1, then the format will be 1 Hour Y Minutes.
Note:
Entry time and exit time will be in the 24-hour format (HH:MM).
Entry time and exit time do not occur at the same time.
Boundary Condition(s):
2 <= N <= 100
Input Format:
The first line contains N.
The next N lines, each contains the entry time and exit time separated by a space.
Output Format:
The first line contains the total duration the employee takes the break.
Example Input/Output 1:
Input:
2
09:30 11:30
11:45 14:00
Output:
0 Hours 15 Minutes
Explanation:
Here N = 2.
The opening time of the office is 09:30.
The closing time of the office is 14:00.
In the first record, the employee will be inside the office for 2 Hours 0 Minutes.
In the second record, the employee will be inside the office for 2 Hours 15 Minutes.
The total duration the employee takes the break is 0 Hours 15 Minutes.
Hence the output is
0 Hours 15 Minutes
Example Input/Output 2:
Input:
4
08:00 10:10
10:30 13:50
14:30 17:15
17:25 19:11
Output:
1 Hour 10 Minutes

 */

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    sc.nextLine();
	    int ans=0;
	    int h1=0,h2=0,m1=0,m2=0;
	    for(int i=0;i<n;i++){
	        String[] str=sc.nextLine().split(" ");
	        h1=Integer.parseInt(str[0].split(":")[0]);
	        m1=Integer.parseInt(str[0].split(":")[1]);
	        if(i!=0){
    	        if(m1==0){
    	            ans+=(h2-h1)*60;
    	            ans+=m2;
    	        }else{
    	            ans=ans+((h2-h1-1)*60)+m2+(60-m1);
    	        }
	        }
	        h2=Integer.parseInt(str[1].split(":")[0]);
	        m2=Integer.parseInt(str[1].split(":")[1]);
	        
	    }
	    String h=-1*ans/60==1?"Hour":"Hours";
	    System.out.print((-1*ans/60)+" "+h+" "+(-1*ans%60)+" Minutes");
        sc.close();
	}
}
 