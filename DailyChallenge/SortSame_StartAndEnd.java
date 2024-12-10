/*
 The program must accept N string values containing only lower case alphabets as the input. The
program must sort the string values starting and ending with the same alphabet. Then the program
must print the N modified string values as the output.
Boundary Condition(s):
2 <= N <= 50
2 <= Length of each string value <= 100
Input Format:
The first line contains N.
The next N lines, each containing a string.
Output Format:
The first N lines, each containing a string representing the N modified string values.
Example Input/Output 1:
Input:
5
rotator
madam
auto
bomb
travels
Output:
bomb
madam
auto
rotator
travels
Explanation:
The string values starting and ending with the same alphabet are rotator, madam and bomb.
After sorting those 3 string values in their positions, the string values become
bomb
madam
auto
rotator
travels
Example Input/Output 2:
Input:
6
river
steps
chair
libel
window
heath
Output:
heath
libel
chair
river
steps
window
 */

import java.util.Scanner;

public class SortSame_StartAndEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),ind1=0,c[]=new int[n],d[]=new int[n],val=0;
        sc.nextLine();
        char a[][]=new char [n][101],b[]=new char [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLine().toCharArray();
            int num=a[i].length;
            if(a[i][0]==a[i][num-1])
            {
                b[ind1]=a[i][0];
                c[ind1]=i;
                d[ind1++]=i;
            }
        }
        for(int i=0;i<ind1;i++)
        {
            for(int j=i+1;j<ind1;j++)
            {
                if(b[i]>b[j])
                {
                    char temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                    int tem=c[i];
                    c[i]=c[j];
                    c[j]=tem;
                }
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            if(d[val]==i)
            {
                System.out.println(a[c[val]]);
                val++;
            }
            else
            {
                System.out.println(a[i]);
            }
        }
	}
}
