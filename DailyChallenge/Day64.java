/*
Cyclic Path or Not
The program must accept N pairs of integers as the input. Each pair contains two integers representing the starting point S and the ending point E of a path. The program must print YES if a cyclic path is formed by connecting all the N paths. Else the program must print NO as the output. The two paths P1 and P2 can be connected only if the end point of P1 is equal to the starting point of P2.
Boundary Condition(s):
2 <= N <= 20
-100 <= E, P <= 100
Input Format:
The first line contains the value of N.
The next N lines contain two integers on each line separated by a space.
Output Format:
The first line contains either YES or NO.

Example Input/Output 1:
Input:
4
23
51
35
12
Output: YES
Explanation:
The cyclic path formed using the 4 paths is given below.
2-3-5-1-> 2
So YES is printed as the output.
Example Input/Output 2:
Input:
4
-2-4
-3-1
-4-3
-12
Output:
NO
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Day64 {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<Integer,Integer> mpp=new HashMap<>();
		Set<Integer> nodes=new HashSet<>();
		sc.nextLine();
		int startnode=sc.nextInt();
		int endnode=sc.nextInt();
		mpp.put(startnode,endnode);
		nodes.add(startnode);
		nodes.add(endnode);
		sc.close();
		for(int i=1;i<n;i++)
		{
		    sc.nextLine();
		    int start=sc.nextInt();
		    int end=sc.nextInt();
		    mpp.put(start,end);
		    nodes.add(start);
		    nodes.add(end);
		}
		if(nodes.size()!=n)
		{
		    System.out.println("NO");
		    return;
		}
		
		int current=startnode;
		for(int i=0;i<n;i++)
		{
		    if(!mpp.containsKey(current))
		    {
		        System.out.println("NO");
		        return;
		    }
		    current=mpp.get(current);
		}
		
		if(current==startnode)
		{
		    System.out.print("YES");
		}else
		{
		    System.out.println("NO");
		}
    }
}