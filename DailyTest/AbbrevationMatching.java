/*
 The program must accept N string values and print the string value that matches the given
abbreviation A.
Note: Always only one string will match with the given abbreviation A.
Boundary Condition(s):
2 <= N, Length of each string <= 100
1 <= Length of A <= 50
Input Format:
The first line contains N.
The next N lines, each contain a string value.
The (N+2)nd
line contains A.
Output Format:
The first line contains the string value which matches the abbreviation A.
Example Input/Output 1:
Input:
4
hello Good Morning
World Health organisation
World Human Chain
World War Two
WHO
Output:
World Health organisation
Explanation:
Here N = 4.
In the given 4 string values, the suited string value for the abbreviation "WHO" is "World Health
organisation".
Hence the output is World Health organisation
Example Input/Output 2:
Input:
4
hello Good Morning
World Health Organisation
World Human Chain
World War Two
WWT
Output:
World War Two
 */

import java.util.Scanner;

public class AbbrevationMatching {
     public static void main(AbbrevationMatching[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		AbbrevationMatching s[]=new AbbrevationMatching[n];
		for(int i=0;i<n;i++){
		    s[i]=sc.nextLine();
		}
		AbbrevationMatching k=sc.nextLine();
		k=k.toUpperCase();
		for(int i=0;i<n;i++){
		    AbbrevationMatching sarr[]=s[i].split(" ");
		    StringBuilder abb=new StringBuilder();
		    for(int j=0;j<sarr.length;j++){
		        abb.append(sarr[j].charAt(0));
		    }
		    AbbrevationMatching abbUpp=abb.toString().toUpperCase();
		    if(abbUpp.equals(k)){
		        System.out.print(s[i]);
		        break;
		    }
		}

	}
}
