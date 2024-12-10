/*
 
Ship - Evacuate Passengers
There are N passengers in a ship. The ship collides with an iceberg and slowly sinking into the sea. The passengers must be evacuated from the ship based on the following conditions.
- Every minute, only one person can evacuate from the ship.
- Children should be given high priority, then women and men.
The program must accept the name and the category(children, women and men) of N passengers and an integer X as the input. The program must print the number of children, women and men who can be evacuated from the ship within X minutes as the output.
Boundary Condition(s):
1 <= N, X <= 100
1 <= Length of the passenger's name <= 25
Input Format:
The first line contains N.
The next N lines, each containing the name and the category of a passenger separated by a space.
The (N+2)nd line contains X.

Output Format:
The first line contains three integers representing the number of children, women and men who can be evacuated from the ship within X minutes.

Example Input/Output 1: Input:
7
xyz men
ABCD children
Abc women
PQRS women EFG children
Mno children
ijk men
4
Output: 310
Explanation:
There are 7 passengers in the ship and X
= 4.
3 Children + 2 Women + 2 Men. At t = 1, 1 child can be evacuated. At t = 2, 1 child can be evacuated. At t = 3, 1 child can be evacuated. At t = 4, 1 woman can be evacuated. Hence the output is
310
Example Input/Output 2: Input:
5
PQR men stu women Xyz children
abc children
IJKL children
2
Output: 200
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		List<String> children=new ArrayList<>();
		List<String> women=new ArrayList<>();
		List<String> men=new ArrayList<>();
		for(int i=0;i<N;i++)
		{
		    String[] passenger=sc.nextLine().split(" ");
		    String name=passenger[0];
		    String category=passenger[1];
		    if(category.equals("children"))
		    {
		        children.add(name);
		    }
		    else if(category.equals("women"))
		    {
		        women.add(name);
		    }
		    else if(category.equals("men"))
		    {
		        men.add(name);
		    }
		}
		int X=sc.nextInt();
		int childrenEvacuated=Math.min(children.size(),X);
		int womenEvacuated=Math.min(women.size(),Math.max(0,X-childrenEvacuated));
		int menEvacuated=Math.min(men.size(),Math.max(0,X-childrenEvacuated-womenEvacuated));
		System.out.println(childrenEvacuated+" "+womenEvacuated+" "+menEvacuated);
		sc.close();
	}
}
