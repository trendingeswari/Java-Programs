/*
 
Absent Nurses

There are seven nurses (A, B, C, D, E, F and G) working in a hospital. Only one nurse will be on duty each day of the week. At most only one nurse can take leave in a week. If one of them takes leave, another nurse will be on duty instead. The program must accept N string values representing the nurses on duty in N weeks. For each week, the program must print the name of the nurse who is absent and the name of the nurse who took charge instead. If no one is absent in a week, the program must print -1 as the output.
Boundary Condition(s):
1 <= N <= 100
Input Format:
The first line contains N.
The next N lines, each contains a string representing the nurses on duty in a week.
Output Format:
The first N lines, each contains the name of the nurse who is absent and the name of the nurse who took charge instead or -1.

Example Input/Output 1:
Input:
3
DEFGADC
ABCDEFG
FEBCDAB
Output:
BD
-1
GB
Explanation:
In the 1st week, nurse B is on leave and nurse D is on duty. So B D are printed. In the 2nd week, no one takes leave. So -1 is printed.
In the 3rd week, nurse G is on leave and nurse B is on duty, so G B are printed.
Example Input/Output 2:
Input:
4
GEFCABD
GFACBCD
FFGADEB
CDAGFEA
Output:
-1
EC
CF
BA 
*/
import java.util.Scanner;

public class Day47 {
     public static void main(String[] args) {
		//Your Code Here
        Scanner sc =new Scanner (System.in);
        int N=sc.nextInt();sc.nextLine();
        char s[][]=new char [N][8];
        for(int i=0;i<N;i++)
        {
            char str[]=sc.nextLine().toCharArray();
            for(int j=0;j<str.length;j++)
            {
                s[i][j]=str[j];
            }
        }
        sc.close();
        for(int i=0;i<N;i++)
        {
            char arr[]={'A','B','C','D','E','F','G'};
            int f=0;
            for(int j=0;j<7;j++)
            {
                boolean flag=true;
                for(int k=0;k<7;k++)
                {
                    if(arr[j]==s[i][k])
                    {
                        flag=false;
                        f++;
                    }
                }
                if(flag)
                {
                    System.out.print(arr[j]+" ");
                    f++;
                }
            }
            if(f==7)
            {
                System.out.print("-1");
            }
            for(int j=0;j<7;j++)
            {
                int count=0;
                for(int k=0;k<7;k++)
                {
                    if(arr[j]==s[i][k])
                    {
                        count++;
                    }
                }
                if(count==2)
                {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
	}
}
