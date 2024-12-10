/*
Last Occurrence Sorting

The program must accept two string values $1 and S2 as the input. The program must print the characters in S2 in ascending order based on the positions of their last occurrence in S1. Note: All the characters in S2 are always present in S1.
Boundary Condition(s):
1 <= Length of S1, S2 <= 100
Input Format:
The first line contains S1.
The second line contains S2.
Output Format:
The first line contains a string representing the characters of S2 as per the given condition.
Example Input/Output 1:
Input:
earthquakes
shake
Output:
hakes
Explanation:
Here S1 is earthquakes and S2 is shake.
The position of the last occurrence of s in earthquakes is 11. The position of the last occurrence of h in earthquakes is 5. The position of the last occurrence of a in earthquakes is 8. The position of the last occurrence of k in earthquakes is 9. The position of the last occurrence of e in earthquakes is 10.
So the characters in shake are printed in ascending order based on the positions of their last occurrence in S1.
Hence the output is
hakes

Example Input/Output 2: Input:
SoftwareHardwares
SHortS
Output:
SSotHr
 */
import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char s1[]=sc.nextLine().toCharArray(),s2[]=sc.nextLine().toCharArray();
        int arr[]=new int[101],ind=0;
        sc.close();
        for(int i=0;i<s2.length;i++)
        {
            for(int j=s1.length-1;j>=0;j--)
            {
                if(s1[j]==s2[i])
                {
                    arr[ind++]=j;
                    break;
                }
            }
        }
        for(int i=0;i<ind;i++)
        {
            for(int j=i+1;j<ind;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<ind;i++)
        {
            System.out.print(s1[arr[i]]);
        }
	}
}
