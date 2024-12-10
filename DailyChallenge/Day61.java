/*
 
File Download Cost

The program must accept the size S of a file in MB and the data rate R in KB/sec as the input. The program must print the total cost C (in paise) to download the file based on the following price chart.
1 to 500 seconds - 1 paisa/second.
501 to 1000 seconds - 2 paise/second.
> 1000 seconds - 3 paise/second.
The above price chart depends on how many seconds it takes to download the required file. Note: 1 MB = 1024 KB
Boundary Condition(s): 1 <= S, R <= 1000
Input Format:
The first line contains S.
The second line contains R.
Output Format:
The first line contains C.

Example Input/Output 1:
Input:
500
50
Output: 29220
Explanation:
The size of the file is 500 MB.
The data rate is 50 KB/Sec.
After converting 500 MB into KB, it becomes 512000 KB. So the total time to download the file is 10240 seconds. 1 - 500 seconds, the cost is 500 paise.
501 - 1000 seconds, the cost is 1000 paise. > 1000 seconds, the cost is 27720 paise. The total cost is 29220 (27720 + 1000 + 500).
Example Input/Output 2:
Input:
2
22
Output:
94
 */
import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int r=sc.nextInt();
		int f=s*1024;
		int t=(int) Math.ceil((double) f/r);
        sc.close();
		int tc=0;
		if(t<=500)
		{
		    tc=t;
		}
		else if(t<=1000)
		{
		    tc=500 + (t-500)*2;
		}
		else
		{
		    tc=1500 + (t-1000)*3;
		}
		System.out.print(tc);

	}
}
