/*
Project Team

N employees are working in a company. Each employee has a rating (positive/negative). A positive
rating means the employee is performing good and a negative rating means the employee is
performing poor. The company has decided to form teams based on the following conditions.
- Each team contains at most 5 employees.
- Each team can have a maximum of 3 employees with negative rating.
The program must accept N integers representing the ratings of the N employees as the input. The
program must print the minimum number of teams T (that can be formed based on the above
conditions) as the output.
Note: All ratings are non-zero.
Boundary Condition(s):
1 <= N <= 1000
-10 <= Each integer value <= 10
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains T.
Example Input/Output 1:
Input:   
6
5 -1 -6 -2 -6 7
Output:
2
Explanation:
There are 2 employees with positive ratings and 4 employees with negative ratings. One of the
possible ways is given below.
The first team can be formed with 5 employees (5 -1 -2 -6 7).
The second team can be formed with 1 employee (-6).
Hence the output is 2.
Example Input/Output 2:
Input:
9
2 -5 -7 -2 -10 -3 -4 -6 -3
Output:
3
 */

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(),neg[]=new int[N],pos[]=new int[N],ind1=0,ind2=0;
        for(int i=0;i<N;i++)
        {
            int num=sc.nextInt();
            if(num<0)
            {
                neg[ind1++]=num;
            }
            else
            {
                pos[ind2++]=num;
            }
        }
        sc.close();
        int countn=0,countp=0;
        while(ind1>0)
        {
            if(ind1>=3)
            {
                ind1-=3;
                if(ind2>=2){ind2-=2;}
                else if(ind2>=1){ind2-=1;}
            }
            else if(ind1>=2)
            {
                ind1-=2;
                if(ind2>=3){ind2-=3;}
                else if(ind2>=2){ind2-=2;}
                else if(ind2>=1){ind2-=1;}
            }
            else if(ind1>=1)
            {
                ind1-=1;
                if(ind2>=4){ind2-=4;}
                else if(ind2>=3){ind2-=3;}
                else if(ind2>=2){ind2-=2;}
                else if(ind2>=1){ind2-=1;}
            }
            countn++;
        }
        while(ind2>0)
        {
            if(ind2>=5){ind2-=5;}
            else if(ind2>=4){ind2-=4;}
            else if(ind2>=3){ind2-=3;}
            else if(ind2>=2){ind2-=2;}
            else if(ind2>=1){ind2-=1;}
            countp++;
        }
        System.out.print(countn+countp);
	}
}
